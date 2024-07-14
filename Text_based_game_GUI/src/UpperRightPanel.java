import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class UpperRightPanel extends JPanel{
    static JLabel ScoreNumber;
    UpperRightPanel(){
        this.setBackground(Color.black);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Border border= BorderFactory.createLineBorder(Color.black);
        this.setBorder(border);
        ScoreNumber= new JLabel();
        Font ScoreFont = new Font("Times New Roman", Font.PLAIN, 35);
        JLabel UpperRightPanelName= new JLabel();
        UpperRightPanelName.setText("Score\n\n");
        UpperRightPanelName.setForeground(Color.white);
        UpperRightPanelName.setFont(ScoreFont);

        ScoreNumber.setForeground(Color.white);
        ScoreNumber.setFont(ScoreFont);
        this.add(UpperRightPanelName); 
        this.add(ScoreNumber);   
        
    }


}