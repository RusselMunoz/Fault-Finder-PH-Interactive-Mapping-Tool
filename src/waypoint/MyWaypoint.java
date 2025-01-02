package waypoint;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JToolTip;
import javax.swing.ToolTipManager;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

public class MyWaypoint extends DefaultWaypoint {
    
    private String name;
    private JButton button;

    public MyWaypoint(String name, EventWaypoint event, GeoPosition coord) {
        super(coord);
        this.name = name;
        initButton(event);
    }
    
    public MyWaypoint() {
    }

    public String getName() {
        return name;
    }
    
    public JButton getButton() {
        return button;
    }
    
    private void initButton(EventWaypoint event) {
        button = new ButtonWaypoint();

        // Mouse listener to handle hover events
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                GeoPosition position = getPosition(); // Use getPosition() to obtain GeoPosition
    String tooltipText = name + " (" + position.getLatitude() + ", " + position.getLongitude() + ")";
    
    
    // Set the custom tooltip
    JToolTip tooltip = new CustomToolTip();
    tooltip.setTipText(tooltipText);
    button.setToolTipText(tooltipText); // Set tooltip text for the button

    // Show tooltip immediately and keep it visible
    ToolTipManager.sharedInstance().setInitialDelay(0);
    ToolTipManager.sharedInstance().setDismissDelay(Integer.MAX_VALUE);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                // When mouse exits, just let the tooltip manager handle hiding
                ToolTipManager.sharedInstance().setDismissDelay(100); // Restore default delay for hiding
            }
        });
        
        button.addActionListener(ae -> event.selected(MyWaypoint.this));
    }
}
