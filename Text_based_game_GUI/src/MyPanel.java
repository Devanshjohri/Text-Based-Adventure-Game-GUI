import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
    MyPanel(){
        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(Color.BLACK);
        this.setLayout(null);

        TopPanel tp = new TopPanel();
        tp.setBounds(0,0,600,150);
        this.add(tp);

        UpperRightPanel urp= new UpperRightPanel();
        urp.setBounds(600,0,200,200);
        this.add(urp);

        UpperLowerRightPanel ulrp=new UpperLowerRightPanel();
        ulrp.setBounds(600,200,200,75);
        this.add(ulrp);

        LowerLowerRightPanel llrp=new LowerLowerRightPanel();
        llrp.setBounds(600,300,200,325);
        this.add(llrp);

        AnimationPanel ap = new AnimationPanel();
        ap.setBounds(0, 150, 600, 450);
        this.add(ap);

    }

}
