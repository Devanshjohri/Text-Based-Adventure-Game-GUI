
public class Grid {
    public void Entry(){
        AnimationPanel.label.setText("Welcome to Voldemort's Revenge Game\n \n \nClick on the below Text Field and Press Enter to continue");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Help(){
        AnimationPanel.label.setText("The commands used in the game are action specific:- like read, give, attack, take, pick etc. venture into the darkness to find the light you seek. \n\nExplore and let your decisions guide your fate.\nNote:- If you write wrong commmand or any other command that exist, then nothing will happen, you will be seeing the same screen\n\nGood Luck!!!\n\n Write ENTER to Enter into the Game :)");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Room1Entry(){
        AnimationPanel.label.setText("You are in Dumbledore's Office \n \n There are a lot of old books on bookshelves. Dumbledore's desk has various items on it. There is a Magic Mirror in one corner. Dumbledore is sitting behind his desk.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Dumbledore(){
        AnimationPanel.label.setText("Hermione and Ron have been kidnapped by you know who \n \nYou need to rescue them. Here is a magical amulet, it will glow when you get close to them \nWhen you find them,say 'Returnus'.\n\n Good Luck!! \n \nYou can see: an amulet");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void MagicMirror(){
        AnimationPanel.label.setText("\nThe mirror is large and has ancient writing. It says \n'To useth this myrror, sayeth thou tralfaz'");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void MirrorEntry(){
        AnimationPanel.label.setText("The Magic Mirror begins to glow. You feel your self floating towards the mirror. You go through the mirror and find yourself on a path. \n \n Press Enter to continue");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void path(){
        AnimationPanel.label.setText("You are on a path.\n\n\nThe path goes in many different directions. To the north you can see trees. It must be the legendary Forbidden Forest. To the south you can see a river. To the east is the castle of the evil Lord Voldemort.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void forestEntry(){
        AnimationPanel.label.setText("You are in front of the Forest Entrance.\n\n\nYou can go to any direction");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void insideForest(){
        AnimationPanel.label.setText("You are in the Forest\n\nA path leads to the north and into the forest. You remember that many people who enter the forest never return.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void endForest(){
        AnimationPanel.label.setText("You have been Lost!!\n\nThere is nothing out there (However, you can go back to previous direction)");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void outskirts(){
        AnimationPanel.label.setText("You are at the outskirts of the forest\n\nYou can see an apple!!");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void cave(){
        AnimationPanel.label.setText("You are at the cave\n\nYou can see a giant ugly loooking Troll");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void river(){
        AnimationPanel.label.setText("You can see a dirty river!!\n\n\nWAIT.....HOLD UP.....\n\n\nYou can see a bottle lying at the river shore\n\nYou can see: A Bottle");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void castle(){
       AnimationPanel.label.setText("You are at the entry gate of Castle!!\n\nTo enter into the castle you have to use the hint provided in the Note!!\n\n(Remember, the note is in a bottle hehe)");
       AnimationPanel.label.revalidate();
       AnimationPanel.label.repaint();
    }

    public void after_taking_bottle(){
        AnimationPanel.label.setText("You can see a dirty river!!, You have taken the bottle, the bottle is made of glass.\n\n\nYou can go back to previous direction now.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void break_bottle(){
        AnimationPanel.label.setText("You have got the Note!!!\n\n\nThe note is torned out but it has something written on it!!");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void readNote(){
        AnimationPanel.label.setText("If you are finding this note, then thank you for finding us..\n\nWe are inside the voldemort castle. To enter into the castle you have to wear the ring.\n\nAfter wearing the ring you must have to say the word at the castle gate:- Avada_____");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void apple_taken(){
        AnimationPanel.label.setText("\nYou are at the outskirts of the forest\n\nYou have taken the apple, you can go back to previous direction now :)");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void troll(){
        AnimationPanel.label.setText("The troll looked very worried, he didn't fight back with you :((((\n\nHe started crying and yelling at you!!!!\n\nNow you are also worried about him, so what will you do?\ntalk to troll?");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void troll_say(){
        AnimationPanel.label.setText("Please! PLease! Please! Give me something to eat.\n\nI am very Hungry!!");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void give_apple(){
        AnimationPanel.label.setText("Thank you very much for your kindness :))\n\nHere, Take this ring, it will help you for the entry of you in the castle");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void wear_ring(){
        AnimationPanel.label.setText("You have wore the ring.\n\nYou are feeling a great amount of power flowing in you!!");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void castle_entrance(){
        AnimationPanel.label.setText("You are inside the Lord Voldemort Castle\n\n You can only see a path going in North  direction :O");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Ball_Room(){
        AnimationPanel.label.setText("You are in Ball Room\n\n\n You can see there are two paths, one path in east and other path in west\n\n which path you want to choose?");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void kitchen(){
        AnimationPanel.label.setText("As the heavy door opens, leading to Voldemort's castle kitchen.\n\nIn the shadows, a frosted refrigerator glows ominously harboring not food, but dark magic.\n\n");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void refrigerator(){
        AnimationPanel.label.setText("As soon as you open the refrigerator, you can see fumes coming out of refrigerator.\n\n After some time, the fumes vanished Hidden among bottles inside is a potion, alongside a deadly poison.\n\nChoose with care, for within these shadows lies not just the potential for victory, but the peril of unseen end..\n\nYou can see: two potions\n\nSo where does your wisdom leads you to?");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }
    public void Common_Jail_Room(){
        AnimationPanel.label.setText("As the clock strikes midnight in the dimly lit Voldemort's jail room, a mysterious whisper echoes through the shadows, sending shivers down your spine.\n\n\nBut as you turn to investigate, you realize you are not alone....\n\nYou can see two paths, one to north, where you can see nothing but only a path leading to nowhere, other to south, where you can hear horrifying noises coming out of there.\n\nSo, tell me which path you want to choose??");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Guard_Without_Potion(){
        AnimationPanel.label.setText("As you round the corner, you come face to face with a stern-looking guard, his wand at the ready. \n\nHis eyes narrow suspiciously as he demands to know your business in the restricted area of Castle.\n\nAs soon as you say anything, he has looked at your scar and busted you.\n\nYou failed, Press Enter to go back to the last Checkpoint.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Guard_With_Potion(){
        AnimationPanel.label.setText("As you round the corner, you come face to face with a stern-looking guard, but he can't see you as you have already taken the invisible potion.\n\n You go head on the path and you found some keys hanging over there.\n\nYou can see: A bunch of keys.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Ron_Hermione_Jail_Room(){
        AnimationPanel.label.setText("You see Yourself going deep into the path from which you can hear horrifying sounds.\n\n Suddenly, your invisibility potion time came to an end, and some guards have seen you going towards the jail.\n\nGuards are now chasing you, you can't go back, you have to free Ron and Hermione as soon as possible.\n\nAfter some time, you see a room in which Ron and Hermione are there. You have to open the gate now.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Open_Gate(){
        AnimationPanel.label.setText("You have freed Ron and Hermione now, you have to go to the Dumbledore's office now, otherwise, you know who wil caught you. \n\n\nUse the word to go back to the Dumbledore's office");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void Returnus(){
        AnimationPanel.label.setText("You have said the word, you are going back to the real world, where your life awaits.\n\nDumbledore is very Happy, you have saved Ron and Hermione\n\nBUT........\n\nWhile you were going back.......\nsome darklings have followed you and.........\nPress Enter to continue.");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public void End_game(){
        AnimationPanel.label.setText("THE END\n\n\nWait for PART 2 :)\n\n\n You can close the game now, Thanks for playing this Text based Adventure Game...");
        AnimationPanel.label.revalidate();
        AnimationPanel.label.repaint();
    }

    public class MoveAction{
        void move(){
            AnimationPanel.label.setText("Not Valid");
            AnimationPanel.label.revalidate();
            AnimationPanel.label.repaint();
        }
    }

    // public MoveAction[][] introGrid = new MoveAction[1][1];

    public MoveAction[] introAction = new MoveAction[]{
        new MoveAction(){
            public void move(){
                Entry();
            }
        },
        new MoveAction(){
            public void move(){
                Help();
            }
        }
    };

    private MoveAction[] Room1Action = new MoveAction[]{
        new MoveAction(){
            public void move(){
                Room1Entry();
            }
        },
        new MoveAction(){
            public void move(){
                Dumbledore();
            }
        },
        new MoveAction(){
            public void move(){
                MagicMirror();
            }
        },
        new MoveAction(){
            public void move(){
                MirrorEntry();
            }
        },
    };
    
    private MoveAction[] Room2Action = new MoveAction[]{
        new MoveAction(){
            public void move(){
                after_taking_bottle();
            }
        },
        new MoveAction(){
            public void move(){
                break_bottle();
            }
        },
        new MoveAction(){
            public void move(){
                readNote();
            }
        },
        new MoveAction(){
            public void move(){
                apple_taken();
            }
        },
        new MoveAction(){
            public void move(){
                troll();
            }
        },
        new MoveAction(){
            public void move(){
                troll_say();
            }
        },
        new MoveAction(){
            public void move(){
                give_apple();
            }
        },
        new MoveAction(){
            public void move(){
                wear_ring();
            }
        },
    };

    // public MoveAction[][] ForestGrid = new MoveAction[7][5];

    private MoveAction[] moveActions = new MoveAction[]{
        new MoveAction(){
            public void move(){
                path();
            }
        },
        new MoveAction(){
            public void move(){
                forestEntry();
            }
        },
        new MoveAction(){
            public void move(){
                insideForest();
            }
        },
        new MoveAction(){
            public void move(){
                endForest();
            }
        },
        new MoveAction(){
            public void move(){
                outskirts();
            }
        },
        new MoveAction(){
            public void move(){
                cave();
            }
        },
        new MoveAction(){
            public void move(){
                river();
            }
        },
        new MoveAction(){
            public void move(){
                castle();
            }
        }
    };

    private MoveAction[] Room3Actions = new MoveAction[]{
        new MoveAction(){
            public void move(){
                castle_entrance();
            }
        },
        new MoveAction(){
            public void move(){
                Ball_Room();
            }
        },
        new MoveAction(){
            public void move(){
                kitchen();
            }
        },
        new MoveAction(){
            public void move(){
                refrigerator();
            }
        },
        new MoveAction(){
            public void move(){
                Common_Jail_Room();
            }
        },
        new MoveAction(){
            public void move(){
                Guard_Without_Potion();
            }
        },
        new MoveAction(){
            public void move(){
                Guard_With_Potion();
            }
        },
        new MoveAction(){
            public void move(){
                Ron_Hermione_Jail_Room();
            }
        },
        
        new MoveAction(){
            public void move(){
                Open_Gate();
            }
        },
        
        new MoveAction(){
            public void move(){
                Returnus();
            }
        },
        new MoveAction(){
            public void move(){
            End_game();
            }
        },
    };

    public void move(int index){
        moveActions[index].move();
        // introAction[index].move();
    }

    public void action(int index){
        introAction[index].move();
    }

    public void Room1(int index){
        Room1Action[index].move();
    }
    public void room2(int index){
        Room2Action[index].move();
    }
    public void room3(int index){
        Room3Actions[index].move();
    }
    
}

//class Main{
    //public static void main(String[] args) {
        //Grid n = new Grid();
        //n.move(3);
        //n.action(0);
    //}

//}

