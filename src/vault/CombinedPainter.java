/*package vault;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.WaypointPainter;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.List;
import javax.swing.JButton;
import java.awt.Rectangle;
import waypoint.MyWaypoint;

public class CombinedPainter extends WaypointPainter<MyWaypoint> implements Painter<JXMapViewer> {

    private final List<GeoPosition> faultLine;

    // Constructor to initialize fault lines
    public CombinedPainter(List<GeoPosition> faultLine) {
        this.faultLine = faultLine;
    }

    // Override the paint method to handle both faults and waypoints
    @Override
    protected void doPaint(Graphics2D g, JXMapViewer map, int w, int h) {
        // Draw fault lines
        drawFaultLines(g, map);

        // Render waypoints
        for (MyWaypoint wp : getWaypoints()) {
            Point2D p = map.getTileFactory().geoToPixel(wp.getPosition(), map.getZoom()); 
            Rectangle rec = map.getViewportBounds();
            int x = (int) (p.getX() - rec.getX());
            int y = (int) (p.getY() - rec.getY());
            JButton cmd = wp.getButton();
            if (cmd.getParent() == null) {
                map.add(cmd); // Ensure button is added to the map's component tree
            }
            cmd.setLocation(x - cmd.getWidth() / 2, y - cmd.getHeight());
        }
    }

    // Method to draw fault lines
    private void drawFaultLines(Graphics2D g, JXMapViewer map) {
        int lastX = 0, lastY = 0;
        boolean first = true;

        for (GeoPosition gp : faultLine) {
            Point2D pt = map.getTileFactory().geoToPixel(gp, map.getZoom());
            if (first) {
                first = false;
            } else {
                g.setColor(Color.RED); // Customize color and stroke here
                g.setStroke(new BasicStroke(2));
                g.drawLine(lastX, lastY, (int) pt.getX(), (int) pt.getY());
            }
            lastX = (int) pt.getX();
            lastY = (int) pt.getY();
        }
    }
} */
