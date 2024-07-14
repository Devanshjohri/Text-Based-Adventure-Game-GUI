
import javax.swing.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setSize(800,600);

        MyPanel mp = new MyPanel();
        this.add(mp);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Voldemort Revenge Game Frame");
    }
}
