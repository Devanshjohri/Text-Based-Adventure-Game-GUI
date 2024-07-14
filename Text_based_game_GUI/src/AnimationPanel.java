import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

public class AnimationPanel extends JPanel {

    static JTextField textField;
    static JTextArea label;
    Grid m;
    String text;


    int room=0;
    int score=0;
    boolean PressedEnter=false;
    boolean inRoom1=false;
    boolean inRoom2=false;
    boolean inRoom3=false;
    boolean askDumbledore=false;
    boolean hasMirror=false;
    boolean hasAmulet=false;
    boolean tralfazText=false;
    boolean hasApple=false;
    boolean hasNote=false;
    boolean hasBottle=false;
    boolean hasRing=false;
    boolean wearRing=false;
    boolean hasPotion1=false;
    boolean hasPotion2=false;
    boolean drinkPotion=false;
    boolean openRefrigerator=false;
    boolean PressedEnterPotionOne=false;
    boolean PressedEnterPotionTwo=false;
    boolean Encountered_Guard=false;
    boolean hasKeys=false;
    boolean hasRonHermione=false;
    boolean atLeastOnePotion=false;

    int n_flag = 0;
    int s_flag = -1;
    int e_flag = 0;
    int w_flag = 0;
    static {
        UpperRightPanel.ScoreNumber.setText("0");
    }
    static{
        LowerLowerRightPanel.inv.setText(" ");
    }
    AnimationPanel() {

        m = new Grid();

        this.setBackground(Color.black);
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        this.setBorder(border);
        this.setLayout(new BorderLayout());
        label = new JTextArea();
        label.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        label.setText("\nWelcome to Voldemort's Revenge Game \n \n \n Press Enter to continue");
        label.setLineWrap(true);
        label.setWrapStyleWord(true);
        label.setEditable(false);
        label.setForeground(Color.white);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setLayout(new BorderLayout(0,160));
        this.add(label);

        textField = new JTextField(20);
        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                text = textField.getText();
                System.out.println(text);
                textField.setText("");
                if (text.equals("") && !PressedEnter) {
                    PressedEnter=true;
                    label.setOpaque(false);
                    m.action(1);
                }
                else if(text.equalsIgnoreCase("enter")){
                    m.Room1(0);
                    room=1;
                }
                else if(room==1){
                    inRoom1=true;
                    if(text.equalsIgnoreCase("talk")|| text.equalsIgnoreCase("talk him")||text.equalsIgnoreCase("ask him")||text.equalsIgnoreCase("ask dumbledore")|| text.equalsIgnoreCase("talk to him")|| text.equalsIgnoreCase("talk to Dumbledore")|| text.equalsIgnoreCase("question him")|| text.equalsIgnoreCase("question dumbledore") && inRoom1){
                        askDumbledore=true;
                        m.Room1(1);
                    }

                    else if(text.equalsIgnoreCase("take amulet")|| text.equalsIgnoreCase("pick amulet")){
                        if(hasAmulet){

                            label.setText("You have already taken the amulet\n \n write continue to continue the game");
                            label.revalidate();
                            label.repaint();
                        }
                        else{
                            score+=10;
                            UpperRightPanel.ScoreNumber.setText(score+"");
                            hasAmulet=true;

                            LowerLowerRightPanel.inv.setText("  Amulet");
                            label.setText("You have the Amulet now \n \n write continue to continue the game");
                            label.revalidate();
                            label.repaint();
                        }
                    }
                    else if(text.equalsIgnoreCase("continue")&& inRoom1){
                        m.Room1(0);
                    }
                    else if(text.equalsIgnoreCase("mirror")|| text.equalsIgnoreCase("see mirror")|| text.equalsIgnoreCase("look into mirror")|| text.equalsIgnoreCase("magic mirror")|| text.equalsIgnoreCase("look into the mirror")&&!hasMirror){
                        if(askDumbledore){
                            hasMirror=true;
                            score+=10;
                            LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText() + "\n");
                            LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText() + "  Mirror");
                            UpperRightPanel.ScoreNumber.setText(score+"");
                            m.Room1(2);
                        }
                        else{
                            label.setText("You have to talk to dumbledore first.\n\n I think you are capable of writing next command without going back to the home screen :).");
                            label.revalidate();
                            label.repaint();
                        }
                    }

                    else if(text.equalsIgnoreCase("tralfaz")){
                        score+=5;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        m.Room1(3);
                        tralfazText=true;
                    }
                    else if(text.equalsIgnoreCase("")&& tralfazText){
                        tralfazText=false;
                        m.move(0);
                        room=2;
                    }
                    else{
                        label.setText("I can't do that :(\n\n\n Write enter to go back to the home screen :)");
                    }
                }
                else if(room==2){
                    inRoom2 = true;
                    if (text.equalsIgnoreCase("go north") && (s_flag == 0 || n_flag == 0)) {
                        m.move(1);
                        n_flag = 1;
                        s_flag = 1;
                        e_flag = 1;
                        w_flag = 1;
                    }
                    else if (text.equalsIgnoreCase("go north") && n_flag == -1) {
                        m.move(0);
                        s_flag = 0;
                        n_flag = 0;
                        e_flag = 0;
                    }
                    else if (text.equalsIgnoreCase("go north") && (s_flag == 1 || n_flag == 1)) {
                        m.move(2);
                        n_flag = 2;
                        s_flag = 2;
                    }
                    else if (text.equalsIgnoreCase("go north") && (s_flag == 2 || n_flag == 2)) {
                        m.move(3);
                        n_flag = 3;
                        s_flag = 3;
                    } else if (text.equalsIgnoreCase("go south") && (s_flag == 3 || n_flag == 3)) {
                        m.move(2);
                        n_flag = 2;
                        s_flag = 2;
                    } else if (text.equalsIgnoreCase("go south") && (n_flag == 2 || s_flag == 2)) {
                        m.move(1);
                        s_flag = 1;
                        n_flag = 1;
                    } else if (text.equalsIgnoreCase("go south") && (s_flag == 1 || n_flag == 1)) {
                        m.move(0);
                        s_flag = 0;
                        n_flag = 0;
                        e_flag = 0;
                    } else if (text.equalsIgnoreCase("go south") && (s_flag == 0 || s_flag == -1)) {
                        m.move(6);
                        s_flag = -1;
                        n_flag = -1;
                    } else if (text.equalsIgnoreCase("go east") && e_flag == 0 && n_flag == 0) {
                        m.move(7);
                        e_flag = -1;
                        w_flag = -1;
                    } else if (text.equalsIgnoreCase("go east") && (e_flag == 1 || w_flag == 1) && n_flag == 1) {
                        m.move(4);
                        e_flag = 2;
                        w_flag = 2;
                    } else if (text.equalsIgnoreCase("go east") && (w_flag == -2)) {
                        m.move(1);
                        e_flag = 1;
                        w_flag = 1;
                    } else if (text.equalsIgnoreCase("go west") && (e_flag == 1 || w_flag == 1) && n_flag == 1) {
                        m.move(5);
                        e_flag = -2;
                        w_flag = -2;
                    } else if (text.equalsIgnoreCase("go west") && (e_flag == 2)) {
                        m.move(1);
                        e_flag = 1;
                        w_flag = 1;
                    } else if (text.equalsIgnoreCase("go west") && (e_flag == -1)) {
                        m.move(0);
                        e_flag = 0;
                        w_flag = 0;
                    }
                    else if ((text.equalsIgnoreCase("take bottle")||text.equalsIgnoreCase("pick bottle"))&& (s_flag == -1 || n_flag == -1) && !hasBottle){
                        hasBottle=true;
                        score+=10;
                        LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText() + "\n  Bottle");
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        m.room2(0);
                    }
                    else if(text.equalsIgnoreCase("break bottle")&& hasBottle){
                        hasNote=true;
                        LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText()+ "\n  Note");
                        score+=5;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        m.room2(1);
                    }
                    else if(text.equalsIgnoreCase("read")||text.equalsIgnoreCase("read note")&& hasNote){
                        m.room2(2);
                    }
                    else if(text.equalsIgnoreCase("take apple")||text.equalsIgnoreCase("pick apple")&& (e_flag == 2) && !hasApple){
                        hasApple=true;
                        score+=10;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText() +"\n  Apple" );
                        m.room2(3);
                    }
                    else if(text.equalsIgnoreCase("eat apple")||text.equalsIgnoreCase("use apple")){
                        label.setText("This is a magical apple, you or any other human can not consume it.\n\n You can go back to previous direction now.");
                        label.revalidate();
                        label.repaint();
                    }
                    else if(text.equalsIgnoreCase("attack troll")&& w_flag == -2){
                        m.room2(4);
                    }
                    else if(text.equalsIgnoreCase("ask troll")|| text.equalsIgnoreCase("talk troll") && w_flag == -2){
                        m.room2(5);
                    }
                    else if(text.equalsIgnoreCase("give apple")  && w_flag == -2){
                        hasApple=false;
                        LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText().replace("Apple", ""));
                        score+=10;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        m.room2(6);
                    }
                    else if((text.equalsIgnoreCase("take ring")||text.equalsIgnoreCase("pick ring")) && !hasRing){
                        hasRing=true;
                        score+=10;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText()+"\n  Ring");
                        label.setText("You have got the ring\n\n Press Enter to continue :)");
                        label.revalidate();
                        label.repaint();
                    }
                    else if(text.equalsIgnoreCase("") && hasRing){
                        label.setText("Thank you very much for your kindness :))\n\n The ring that I have gave you will help you to enter in the castle, you can go the the castle entry direction now :) \n\nGood Luck!!");
                        label.revalidate();
                        label.repaint();
                    }
                    else if(text.equalsIgnoreCase("wear ring") && hasRing){
                        wearRing=true;
                        score+=5;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        m.room2(7);
                    }
                    else if(text.equalsIgnoreCase("enter into castle")|| text.equalsIgnoreCase("enter castle") && !wearRing){
                        label.setText("You can't go in there right now!!!\n\n(Make sure you have done all the things to enter into the castle)");
                        label.revalidate();
                        label.repaint();
                    }
                    else if(text.equalsIgnoreCase("avadakedavra")|| text.equalsIgnoreCase("avada kedavra")|| text.equalsIgnoreCase("avada ke davra")&& e_flag == -1){
                        label.setText("You are entering into the castle\n\nYou are feeling that some wormhole has created and you are passing through that wormhole\n\nAfter some time you watch yourself standing into the castle ;)\n\nPress Enter to continue.");
                        label.revalidate();
                        label.repaint();
                        room=3;
                        e_flag=0;
                        w_flag=0;
                        n_flag=0;
                        s_flag=0;
                    }
                }
                else if(room==3){
                    if(text.equalsIgnoreCase("")&& !inRoom3){
                        score+=5;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        inRoom3=true;
                        m.room3(0);
                    }
                    else if(text.equalsIgnoreCase("go north")&& n_flag==0){
                        n_flag=1;
                        s_flag=1;
                        e_flag=1;
                        w_flag=1;
                        m.room3(1);
                    }
                    else if(text.equalsIgnoreCase("go east")&& e_flag==1){
                        w_flag=2;
                        m.room3(2);
                    }
                    else if(text.equalsIgnoreCase("open refrigerator")&& e_flag==1 &&!openRefrigerator){
                        openRefrigerator=true;
                        m.room3(3);
                    }
                    else if(text.equalsIgnoreCase("take potion 1")|| text.equalsIgnoreCase("take potion1")||text.equalsIgnoreCase("pick potion 1")&&e_flag==1){
                        if(hasPotion2 && !hasPotion1){
                            label.setText("You already have one potion, you can only take one potion.\n\nAs I have said, you have to choose wisely.\n\nPress enter to continue.");
                            label.revalidate();
                            label.repaint();
                        }
                        else if(!hasPotion2 && !hasPotion1){
                            hasPotion1=true;
                            score+=5;
                            UpperRightPanel.ScoreNumber.setText(score+"");
                            label.setText("You have taken the Potion 1\n\nYour fate is in this potion, if you want to use this potion, just write drink potion 1 \n\n you can use potion 1 whenever you want to drink it :o");
                            label.revalidate();
                            label.repaint();
                        }
                    }
                    else if(text.equalsIgnoreCase("")&& (hasPotion1 || hasPotion2) && !hasRonHermione){
                        m.room3(2);
                    }
                    else if(text.equalsIgnoreCase("take potion 2")|| text.equalsIgnoreCase("take potion2")||text.equalsIgnoreCase("pick potion 2")&&e_flag==2){
                        if(!hasPotion2 && hasPotion1){
                            label.setText("You already have one potion, you can only take one potion.\n\nAs I have said, you have to choose wisely.\n\nPress enter to continue.");
                            label.revalidate();
                            label.repaint();
                        }
                        else if(!hasPotion2 && !hasPotion1){
                            hasPotion2=true;
                            score+=10;
                            UpperRightPanel.ScoreNumber.setText(score+"");
                            label.setText("You have taken the Potion 2\n\nYour fate is in this potion, if you want to use this potion, just write drink potion 2\n\n you can use potion 2 whenever you want to drink it :o");
                            label.revalidate();
                            label.repaint();
                        }
                    }
                    else if((text.equalsIgnoreCase("drink Potion 1")|| text.equalsIgnoreCase("drink Potion1"))&& !drinkPotion){
                        drinkPotion=true;
                        score-=5;
                        e_flag=0;
                        w_flag=0;
                        n_flag=0;
                        s_flag=0;
                        hasPotion1=false;
                        openRefrigerator=false;
                        drinkPotion=false;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        label.setText("You have drink the potion. As soon as you drink this potion, you sarted feeling unusual.\n\n\nSoon you started coughing blood, after some time you died.\n\n\nPress Enter to continue :(");
                        label.revalidate();
                        label.repaint();
                    }

                    else if(text.equalsIgnoreCase("")&& !PressedEnterPotionOne &&!hasRonHermione){

                        PressedEnterPotionOne=true;
                        m.room3(0);
                    }

                    else if((text.equalsIgnoreCase("drink Potion 2") || text.equalsIgnoreCase("drink Potion2"))&& !drinkPotion){
                        drinkPotion=true;
                        score+=5;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        label.setText("You have drink the potion. As soon as you drink this potion, you sarted feeling very light.\n\n\nSuddenly, a guard entered in the room but he can't see you and he left. That means, you are invisible now.\n\n\n(Remember, when you want to be visible again, just say Aparecium\n\nPress Enter to continue :)");
                        label.revalidate();
                        label.repaint();
                    }
                    else if(text.equalsIgnoreCase("")&& !PressedEnterPotionTwo && !hasRonHermione){
                        PressedEnterPotionTwo=true;
                        m.room3(2);
                    }
                    else if(text.equalsIgnoreCase("go west")&& w_flag==2){
                        w_flag=1;
                        m.room3(1);
                    }
                    else if(text.equalsIgnoreCase("go west")&&w_flag==1){
                        e_flag=2;
                        n_flag=2;
                        s_flag=2;
                        m.room3(4);
                    }
                    else if(text.equalsIgnoreCase("go north")&& n_flag==2){
                        if(!drinkPotion){
                            e_flag=0;
                            w_flag=0;
                            n_flag=0;
                            s_flag=0;
                            m.room3(5);
                        }
                        else{
                            s_flag=3;
                            m.room3(6);
                        }
                    }
                    else if(text.equalsIgnoreCase("")&& !Encountered_Guard &&!hasRonHermione){
                        Encountered_Guard=true;
                        m.room3(1);
                    }

                    else if(text.equalsIgnoreCase("take keys")|| text.equalsIgnoreCase("take key")&&!hasKeys){
                        hasKeys=true;
                        score+=10;
                        UpperRightPanel.ScoreNumber.setText(score+"");
                        LowerLowerRightPanel.inv.setText(LowerLowerRightPanel.inv.getText() + "\n   Keys");
                        label.setText("You have taken the keys.\n\n\nNow, you can go to south direction and can save your friends. \n\nRemember, you can use keys by saying open gate");
                        label.revalidate();
                        label.repaint();
                    }

                    else if(text.equalsIgnoreCase("go south")&& s_flag==3){
                        s_flag=2;
                        n_flag=2;
                        e_flag=2;
                        m.room3(4);
                    }
                    else if(text.equalsIgnoreCase("go south")&& s_flag==2){
                        if(hasKeys){
                            s_flag=0;
                            n_flag=0;
                            w_flag=0;
                            e_flag=0;
                            m.room3(7);
                        }
                        else{
                            n_flag=3;
                            label.setText("I can't go in there, the door is locked and i don't have the keys. \n\n I guess, I have to take the keys from the above path, so does that mean, I have to go back??");
                            label.revalidate();
                            label.repaint();
                        }
                    }
                    else if(text.equalsIgnoreCase("go north") && n_flag==3){
                        n_flag=2;
                        s_flag=2;
                        e_flag=2;
                        m.room3(4);
                    }

                    else if(text.equalsIgnoreCase("open gate") && s_flag==0){
                        hasRonHermione=true;
                        m.room3(8);
                    }

                    else if((text.equalsIgnoreCase("returnus") || text.equalsIgnoreCase("return us"))&& hasRonHermione){
                        m.room3(9);
                    }

                    else if(text.equalsIgnoreCase("")&&hasRonHermione){
                        s_flag=-1;
                        n_flag=-1;
                        e_flag=-1;
                        w_flag=-1;
                        label.setText("THE END\n\n\nWait for PART 2 :)\n\n\n You can close the game now, Thanks for playing this Text based Adventure Game...");
                        label.revalidate();
                        label.repaint();
                    }                    
                }
            }
        });
        this.add(textField, BorderLayout.SOUTH);
    }
}