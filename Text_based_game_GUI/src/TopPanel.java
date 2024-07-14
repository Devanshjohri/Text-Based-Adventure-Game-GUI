import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class TopPanel extends JPanel {
    TopPanel(){
        // this.setPreferredSize(new Dimension(600,200));
        this.setBackground(Color.black);
        Border border= BorderFactory.createLineBorder(Color.WHITE);
        this.setBorder(border);
        this.setLayout(new BorderLayout());
        Font titleFont = new Font("Times New Roman", Font.PLAIN, 35);
        JLabel TopPanelName= new JLabel();
        TopPanelName.setText("Voldemort's Revenge");
        TopPanelName.setForeground(Color.white);
        TopPanelName.setFont(titleFont);
        TopPanelName.setVerticalAlignment(JLabel.CENTER);
        TopPanelName.setHorizontalAlignment(JLabel.CENTER);
        this.add(TopPanelName);
    }
}
