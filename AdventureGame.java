import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdventureGame {
    private JFrame frame;
    private JLabel label;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonG;
    private JButton buttonH;
    private JButton buttonI;
    private JButton buttonJ;
    private JButton buttonK;
    private JButton buttonL;
    private JButton buttonN;
    private JButton buttonO;

    public AdventureGame() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Adventure Game");
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Add this line
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        label = new JLabel("You are standing at the entrance of a dark forest.");
        label.setPreferredSize(new Dimension(300, 50));
        frame.add(label);

        buttonA = new JButton("A) Investigate the noise");
        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                investigateNoise();
                buttonA.setVisible(false);
                buttonB.setVisible(true);
                buttonC.setVisible(true);
            }
        });
        frame.add(buttonA);

        buttonB = new JButton("B) Follow the sound");
        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                followSound();
                buttonA.setVisible(false);
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                buttonD.setVisible(true);
                buttonE.setVisible(true);
            }
        });
        buttonB.setVisible(false);
        frame.add(buttonB);

        buttonC = new JButton("C) Hide");
        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                hide();
                buttonA.setVisible(false);
                buttonB.setVisible(false);
                buttonC.setVisible(false);
                buttonF.setVisible(true);
            }
        });
        buttonC.setVisible(false);
        frame.add(buttonC);

        buttonD = new JButton("D) Continue journey");
        buttonD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                continueJourney();
                buttonD.setVisible(false);
                buttonE.setVisible(false);
                buttonG.setVisible(true);
                buttonH.setVisible(true);
            }
        });
        buttonD.setVisible(false);
        frame.add(buttonD);

        buttonE = new JButton("E) Go back");
        buttonE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBack();
                buttonD.setVisible(false);
                buttonE.setVisible(false);
                buttonA.setVisible(true);
            }
        });
        buttonE.setVisible(false);
        frame.add(buttonE);

        buttonF = new JButton("F) Take left path");
        buttonF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                takeLeftPath();
                buttonF.setVisible(false);
                buttonG.setVisible(true);
                buttonH.setVisible(true);
            }
        });
        buttonF.setVisible(false);
        frame.add(buttonF);

        buttonG = new JButton("G) Take right path");
        buttonG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                takeRightPath();
                buttonG.setVisible(false);
                buttonH.setVisible(false);
                buttonI.setVisible(true);
                buttonJ.setVisible(true);
            }
        });
        buttonG.setVisible(false);
        frame.add(buttonG);

        buttonH = new JButton("H) Climb mountain");
        buttonH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                climbMountain();
                buttonG.setVisible(false);
                buttonH.setVisible(false);
                buttonK.setVisible(true);
                buttonL.setVisible(true);
            }
        });
        buttonH.setVisible(false);
        frame.add(buttonH);

        buttonI = new JButton("I) Explore cave");
        buttonI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exploreCave();
                buttonI.setVisible(false);
                buttonJ.setVisible(false);
                buttonN.setVisible(true);
                buttonO.setVisible(true);
            }
        });
        buttonI.setVisible(false);
        frame.add(buttonI);

        buttonJ = new JButton("J) Go back to the forest");
        buttonJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToForest();
                buttonI.setVisible(false);
                buttonJ.setVisible(false);
                JButton buttonN = new JButton("Game Over");
                buttonN.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                frame.add(buttonN);
                frame.revalidate();
                frame.repaint();
            }
        });
        buttonJ.setVisible(false);
        frame.add(buttonJ);

        buttonK = new JButton("K) Reach the top of the mountain");
        buttonK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reachTopOfMountain();
                buttonK.setVisible(false);
                buttonL.setVisible(false);
                JButton buttonO = new JButton("You Win!");
                buttonO.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                frame.add(buttonO);
                frame.revalidate();
                frame.repaint();
            }
        });
        buttonK.setVisible(false);
        frame.add(buttonK);
    
        buttonL = new JButton("L) Go back down the mountain");
        buttonL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackDownMountain();
                buttonK.setVisible(false);
                buttonL.setVisible(false);
                buttonG.setVisible(true);
                buttonH.setVisible(true);
            }
        });
        buttonL.setVisible(false);
        frame.add(buttonL);
    
        buttonN = new JButton("N) Follow the river");
        buttonN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                followRiver();
                buttonN.setVisible(false);
                buttonO.setVisible(false);
                JButton buttonP = new JButton("You Win!");
                buttonP.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                frame.add(buttonP);
                frame.revalidate();
                frame.repaint();
            }
        });
        buttonN.setVisible(false);
        frame.add(buttonN);
    
        buttonO = new JButton("O) Go back to the forest");
        buttonO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goBackToForest();
                buttonN.setVisible(false);
                buttonO.setVisible(false);
                JButton buttonQ = new JButton("Game Over");
                buttonQ.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                frame.add(buttonQ);
                frame.revalidate();
                frame.repaint();
            }
        });
        buttonO.setVisible(false);
        frame.add(buttonO);
    
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    private void investigateNoise() {
        label.setText("You hear a strange noise coming from the forest.");
    }
    
    private void followSound() {
        label.setText("You follow the sound and find a path.");
    }
    
    private void hide() {
        label.setText("You hide behind a tree and wait.");
    }
    
    private void continueJourney() {
        label.setText("You continue your journey through the forest.");
    }
    
    private void goBack() {
        label.setText("You go back to the entrance of the forest.");
    }
    
    private void takeLeftPath() {
        label.setText("You take the left path and find a mountain.");
    }
    
    private void takeRightPath() {
        label.setText("You take the right path and find a cave.");
    }
    
    private void climbMountain() {
        label.setText("You climb the mountain and reach the top.");
    }
    
    private void exploreCave() {
        label.setText("You explore the cave and find a river.");
    }
    
    private void followRiver() {
        label.setText("You follow the river and find a treasure.");
    }
    
    private void goBackToForest() {
        label.setText("You go back to the forest.");
    }
    
    private void reachTopOfMountain() {
        label.setText("You reach the top of the mountain and find a treasure.");
    }
    
    private void goBackDownMountain() {
        label.setText("You go back down the mountain.");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AdventureGame();
            }
        });
    }
    }