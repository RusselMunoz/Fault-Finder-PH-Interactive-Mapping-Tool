package map;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.GeoPosition;

import waypoint.Coordinates;
import waypoint.EventWaypoint;
import waypoint.MyWaypoint;
import waypoint.WayPointRender;

import vault.FaultPainter;
import vault.VaultCoordinates;



public class Main extends javax.swing.JFrame {
    private final Set<MyWaypoint> waypoints = new HashSet<>();
    private EventWaypoint event;
    
    public Main() {
        initComponents();
        init();
    }
    
    private void init(){
        
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition(12.51970934, 123.07434082);
        jXMapViewer.setAddressLocation(geo);
        jXMapViewer.setZoom(14);
        
        // Delay the display of JOptionPane to ensure the frame is already visible
        SwingUtilities.invokeLater(() -> {
            // Create the JOptionPane message
            String projectInfo = """
                                                 This project displays fault lines and waypoints on a map using JXMapViewer.
                                                 You can visualize fault lines, and waypoints.""";
            // Display the modal JOptionPane to block interaction with the frame
            JOptionPane.showMessageDialog(Main.this, projectInfo, "About the Project", JOptionPane.INFORMATION_MESSAGE);
        });
        
        // Define bounding box (restrict movement within this box)
        final double minLat = 5.5;  // Example: southernmost boundary of Mindanao
        final double maxLat = 21.5;  //northernmost boundary of Mindanao
        final double minLon = 115;  // Example: westernmost boundary
        final double maxLon = 130;  // easternmost boundary

        // Listen to user actions to limit map panning
        jXMapViewer.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Get the current map center position
                GeoPosition currentCenter = jXMapViewer.getCenterPosition();
            
                // Restrict the movement based on the bounding box
                double lat = currentCenter.getLatitude();
                double lon = currentCenter.getLongitude();

                // Correct if the latitude or longitude goes out of bounds
                if (lat < minLat) {
                    lat = minLat;
                } else if (lat > maxLat) {
                    lat = maxLat;
                }

                if (lon < minLon) {
                    lon = minLon;
                } else if (lon > maxLon) {
                    lon = maxLon;
                }

                // Update the map's center position to stay within bounds
                jXMapViewer.setCenterPosition(new GeoPosition(lat, lon));
            }
        });
        
        event=getEvent();
        
        // Get waypoints from Coordinates class
        Coordinates coords = new Coordinates(event);
        List<MyWaypoint> waypointsList = coords.getWaypoints();
        
        for (MyWaypoint waypoint : waypointsList) {
        addWaypoint(waypoint);  // This will add waypoints automatically during initialization
        }
        
        MouseInputListener mm = new PanMouseInputListener (jXMapViewer);
        jXMapViewer.addMouseListener(mm);
        jXMapViewer.addMouseMotionListener(mm);
        // Enforce zoom limits
        
        jXMapViewer.addMouseWheelListener((MouseWheelEvent e) -> {
            int currentZoom = jXMapViewer.getZoom();
            int maxZoom = 14;  // Maximum zoom level (zoomed out)
            int minZoom = 1;   // Set a minimum zoom level (zoomed in)
            
            // Zoom in (wheel scroll up)
            if (e.getWheelRotation() < 0 && currentZoom > minZoom) {
                jXMapViewer.setZoom(currentZoom - 1);  // Zoom in
            }
            // Zoom out (wheel scroll down)
            else if (e.getWheelRotation() > 0 && currentZoom < maxZoom) {
                jXMapViewer.setZoom(currentZoom + 1);  // Zoom out
            }
        });
        
        // Create and add fault lines
        List<FaultPainter> faultPainters = new ArrayList<>();
        String[] faultLineNames  = { 
            "Tanbulan", "South Barira", "West Compostela", "Short West Compostela", 
            "Surigao", "Surigao Lower Part", "Surigao P2 Lower Part", 
            "Esperanza", "De Oro Esperanza", "Daguma", "Koronodal", 
            "Agusan Marsh", "Lianga", "Lianga Left", "Mati", "Caraga River",
            "Central Mindanao", "Short Central Mindanao", "West Central Mindanao",
            "Zamboanga", "Kabasalan", "Western", "Tangbulan", "Talakag", "Lanao",
            "Kalilangan", "Bunbaran", "Central Davao", "South Bukidnon", "Tagoloan River",
            "West Ilocos", "Infanta", "Ambuklao", "San Manuel", "West Valley",
            "Divilican", "West Zambales", "Iba", "Central Mindoro", "Offshore",
            "West Panay", "East Negros", "Cardoni", "East Bohol", "Liros"
        };

        List<org.jxmapviewer.painter.Painter<JXMapViewer>> painters = new ArrayList<>();

        // Add waypoint painter
        WayPointRender waypointRender = new WayPointRender();
        waypointRender.setWaypoints(waypoints);
        painters.add(waypointRender);

        for (String faultLine : faultLineNames) {
            List<GeoPosition> track = VaultCoordinates.getFaultLineCoordinates(faultLine);
            FaultPainter painter = new FaultPainter(track, faultLine);
            faultPainters.add(painter);  // Store in list for click detection
            painters.add(painter);  // Add to painter for rendering
        }

        // Set compound painter
        CompoundPainter<JXMapViewer> compoundPainter = new CompoundPainter<>(painters);
        jXMapViewer.setOverlayPainter(compoundPainter);

        // Handle mouse clicks for fault lines
        jXMapViewer.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked at: " + e.getPoint());
            Point mousePt = e.getPoint();
            boolean found = false;
            Rectangle viewportBounds = jXMapViewer.getViewportBounds();
                
                // Calculate the world coordinates
                int wx = viewportBounds.x + e.getPoint().x;
                int wy = viewportBounds.y + e.getPoint().y;

                // Get the current zoom level
                int currentZoom = jXMapViewer.getZoom();

                // Convert the adjusted pixel coordinates to geographic coordinates
                GeoPosition clickedPosition = tileFactory.pixelToGeo(new Point(wx, wy), currentZoom);

                // Print the accurate clicked coordinates
                System.out.printf("Clicked at: %.8f, %.8f\n", clickedPosition.getLatitude(), clickedPosition.getLongitude());
            for (FaultPainter faultPainter : faultPainters) {
                if (faultPainter.isNearFaultLine(mousePt, jXMapViewer)) {
                    found = true;
                    String faultName = faultPainter.getFaultName();
                    String tooltipText = faultName + " (" + faultName + ")";
                
                    // Show the tooltip in a dialog
                    JOptionPane.showMessageDialog(jXMapViewer, tooltipText, "Fault Line Info", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            if (!found) {
                System.out.println("No fault line clicked.");
            }
        }
        });
    }
    
    private void addWaypoint(MyWaypoint waypoint) {
        waypoints.add(waypoint);
        initWaypoint();
    }
    
    private void initWaypoint(){
        WaypointPainter<MyWaypoint> wp = new WayPointRender();
        wp.setWaypoints(waypoints);
        jXMapViewer.setOverlayPainter(wp);
        for (MyWaypoint d: waypoints) {
            jXMapViewer.add(d.getButton());
        }
    }
       
    private EventWaypoint getEvent() {
        return new EventWaypoint() {
        @Override
        public void selected(MyWaypoint waypoint) { 
            JOptionPane.showMessageDialog(Main.this, waypoint.getName());
        }
    };
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        ZoomIn = new javax.swing.JButton();
        ZoomOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Philippines Map Fault Viewer");

        jXMapViewer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jXMapViewerMouseMoved(evt);
            }
        });

        ZoomIn.setText("+");
        ZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomInActionPerformed(evt);
            }
        });

        ZoomOut.setText("-");
        ZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXMapViewerLayout = new javax.swing.GroupLayout(jXMapViewer);
        jXMapViewer.setLayout(jXMapViewerLayout);
        jXMapViewerLayout.setHorizontalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXMapViewerLayout.createSequentialGroup()
                .addContainerGap(1181, Short.MAX_VALUE)
                .addGroup(jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ZoomOut)
                    .addComponent(ZoomIn))
                .addGap(14, 14, 14))
        );
        jXMapViewerLayout.setVerticalGroup(
            jXMapViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXMapViewerLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ZoomIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ZoomOut)
                .addContainerGap(540, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXMapViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jXMapViewerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXMapViewerMouseMoved
        
    }//GEN-LAST:event_jXMapViewerMouseMoved

    private void ZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomInActionPerformed
        double currentZoom = jXMapViewer.getZoom();
            jXMapViewer.setZoom((int) (currentZoom - 1)); // Increase zoom level
            jXMapViewer.revalidate(); // Refresh the viewer
            jXMapViewer.repaint();
    }//GEN-LAST:event_ZoomInActionPerformed
    
    private void ZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomOutActionPerformed
            double currentZoom = jXMapViewer.getZoom();
            if (currentZoom < 14) {
            jXMapViewer.setZoom((int) (currentZoom + 1)); // Increase zoom level
            jXMapViewer.revalidate(); // Refresh the viewer
            jXMapViewer.repaint(); // Repaint the viewer to reflect changes
        } else {
            JOptionPane.showMessageDialog(null, "Maximum zoom level reached!");// Increase zoom level
            jXMapViewer.revalidate(); // Refresh the viewer
            jXMapViewer.repaint(); // Repaint the viewer to reflect changes
            }
    }//GEN-LAST:event_ZoomOutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ZoomIn;
    private javax.swing.JButton ZoomOut;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    // End of variables declaration//GEN-END:variables
}
