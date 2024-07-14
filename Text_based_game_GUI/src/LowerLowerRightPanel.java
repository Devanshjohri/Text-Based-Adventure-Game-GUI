import javax.swing.*;
import java.awt.*;

public class LowerLowerRightPanel extends JPanel{
    static JTextArea inv;
    LowerLowerRightPanel(){
        this.setBackground(Color.blue);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Font invFont = new Font("Times New Roman", Font.PLAIN, 35);

        inv = new JTextArea();
        inv.setEditable(false);
        inv.setLineWrap(true);
        inv.setWrapStyleWord(true);
        inv.setBackground(Color.black);
        inv.setForeground(Color.white);
        inv.setFont(invFont);
        this.add(inv);
    }
}
