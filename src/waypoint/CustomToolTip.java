package waypoint;

import javax.swing.*;
import java.awt.*;

public class CustomToolTip extends JToolTip {
    public CustomToolTip() {
        setBackground(Color.WHITE); // Change the background color
        setForeground(Color.BLACK); // Change the text color
        setFont(new Font("Arial", Font.BOLD, 12)); // Change the font style and size
    }
}
