package vault;

import java.util.List;
import org.jxmapviewer.viewer.GeoPosition;

public class FaultLine {
    private String name;
    private List<GeoPosition> coordinates;

    public FaultLine(String name, List<GeoPosition> coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public List<GeoPosition> getCoordinates() {
        return coordinates;
    }
}
