package vault;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.painter.Painter;

public class FaultPainter implements Painter<JXMapViewer> {
    private final Color color = Color.RED;
    private final boolean antiAlias = true;
    private final List<GeoPosition> track;
    private final String faultName; // Add a field for the fault name

    // Constructor accepting coordinates and fault name
    public FaultPainter(List<GeoPosition> track, String faultName) {
        this.track = new ArrayList<>(track);
        this.faultName = faultName; // Store the fault name
    }

    @Override
    public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
        g = (Graphics2D) g.create();
        Rectangle rect = map.getViewportBounds();
        g.translate(-rect.x, -rect.y);

        if (antiAlias) {
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        // Draw the fault line
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        drawRoute(g, map);

        // Draw the fault line in specified color
        g.setColor(color);
        g.setStroke(new BasicStroke(2));
        drawRoute(g, map);
        g.dispose();
    }

    private void drawRoute(Graphics2D g, JXMapViewer map) {
        int lastX = 0;
        int lastY = 0;
        boolean first = true;

        for (GeoPosition gp : track) {
            if (gp == null) {
                first = true; // Reset the "first" flag on null
                continue; // Skip null positions
            }

            // Convert geo-coordinate to pixel
            Point2D pt = map.getTileFactory().geoToPixel(gp, map.getZoom());

            if (first) {
                first = false;
            } else {
                g.drawLine(lastX, lastY, (int) pt.getX(), (int) pt.getY());
            }

            lastX = (int) pt.getX();
            lastY = (int) pt.getY();
        }
    }

    public boolean isNearFaultLine(Point2D mousePt, JXMapViewer jXMapViewer) {
        for (GeoPosition position : track) {
            if (position == null) {
                continue; // Skip null positions
            }
            Point2D faultLinePoint = jXMapViewer.getTileFactory().geoToPixel(position, jXMapViewer.getZoom());
            // Check if the mouse point is within a certain distance from the fault line point
            if (mousePt.distance(faultLinePoint) < 10) { // Adjust the threshold as needed
                return true;
            }
        }
        return false;
    }

    // Method to retrieve the fault name
    public String getFaultName() {
        return faultName; // Return the specific fault name
    }
}
