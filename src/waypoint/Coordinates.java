package waypoint;

import org.jxmapviewer.viewer.GeoPosition;
import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private final List<MyWaypoint> waypoints = new ArrayList<>();

    public Coordinates(EventWaypoint event) {
        // Add all your waypoints here
        waypoints.add(new MyWaypoint("Test 001", event, new GeoPosition(7.1907, 125.4553)));
    }

    public List<MyWaypoint> getWaypoints() {
        return waypoints;
    }
}