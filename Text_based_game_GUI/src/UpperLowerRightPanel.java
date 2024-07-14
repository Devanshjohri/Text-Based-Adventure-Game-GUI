import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class UpperLowerRightPanel extends JPanel {
    UpperLowerRightPanel(){
        this.setBackground(Color.black);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Border border= BorderFactory.createLineBorder(Color.WHITE);
        this.setBorder(border);
        Font invFont = new Font("Times New Roman", Font.PLAIN, 35);
        JTextArea LowerRightPanelName= new JTextArea();
        LowerRightPanelName.setBackground(Color.black);
        LowerRightPanelName.setText("   Inventory");
        LowerRightPanelName.setForeground(Color.white);
        LowerRightPanelName.setFont(invFont);
        LowerRightPanelName.setEditable(false);
        LowerRightPanelName.setLineWrap(true);
        LowerRightPanelName.setWrapStyleWord(true);
        this.add(LowerRightPanelName);
    }
}
