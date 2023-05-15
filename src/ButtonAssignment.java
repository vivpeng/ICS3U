/*
Vivian Peng
18/12/2022
ICS3U7, Ms. S
Button Assignment - Extension of GUI Exercise #2
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAssignment {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My New Game...");

        Container cont = frame.getContentPane();

        Game p= new Game();
        cont.add(p); //adding object of game to container

        frame.setSize(560,640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Game extends JPanel{
    JPanel buttonPanel, menuPanel, labelPanel;
    JButton b;
    ImageIcon myIcon, myIcon2, myIcon3;
    JLabel puppyLabel;
    public Game(){
        setLayout(new BorderLayout());

        myIcon = new ImageIcon("image.png");

        //GAME TITLE & LABEL
        labelPanel = new JPanel();
        labelPanel.setLayout(new BorderLayout());
        add(labelPanel, BorderLayout.NORTH);

        JPanel panel = new JPanel(); //using to center all buttons in the label panel
        panel.setLayout(new FlowLayout());
        labelPanel.add(panel, BorderLayout.CENTER);

        puppyLabel = new JLabel("My New Game...");
        puppyLabel.setIcon(myIcon);
        panel.add(puppyLabel, BorderLayout.CENTER);

        //PANEL IN MIDDLE
        myIcon2 = new ImageIcon("cat.png");
        myIcon3 = new ImageIcon("duck.png");

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(10, 10));
        add(buttonPanel,BorderLayout.CENTER);

        for(int i = 1; i < 101; i++) {
            b = new JButton(myIcon);
            buttonPanel.add(b);

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton)e.getSource();
                    if(e.getSource() == button && button.getIcon() == myIcon)
                        button.setIcon(myIcon2);
                    else if(e.getSource() == button && button.getIcon() == myIcon2)
                        button.setIcon(myIcon3);
                }
            });
        }
        //PANEL @ BOTTOM
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(1, 3, 5, 5));
        add(menuPanel, BorderLayout.SOUTH);

        menuPanel.add(new JButton("aaaa"));
        menuPanel.add(new JButton("bbbb"));
        menuPanel.add(new JButton("Exit"));
    }
}