/*
Vivian Peng
18/12/2022
ICS3U7, Ms. S
GUI Exercise #3
 */

import javax.swing.*;
import java.awt.*;

public class LayoutExercise3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        Container cont = frame.getContentPane();

        CardsGame p= new CardsGame();
        cont.add(p); //adding object of cards game to container

        frame.setSize(800,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class CardsGame extends JPanel {
    JPanel scorePanel, cardsPanel, controlsPanel;
    JLabel score, dealer, player, card;
    JButton deal, hit, stand;
    ImageIcon myIcon;
    public CardsGame() {
        setLayout(new BorderLayout());

        myIcon = new ImageIcon("card.png");

        //SCORE PANEL - TOP
        scorePanel = new JPanel();
        scorePanel.setLayout(new BorderLayout());
        add(scorePanel, BorderLayout.NORTH);

        JPanel panel = new JPanel(); //using to center all buttons in the score panel
        panel.setLayout(new FlowLayout());
        scorePanel.add(panel, BorderLayout.CENTER);

        score = new JLabel("Win: 0 Lost: 0 Tie: 0 Welcome!");
        panel.add(score, BorderLayout.CENTER);

        //DEALER & PLAYER - CENTER
        cardsPanel = new JPanel();
        cardsPanel.setLayout(new GridLayout(2, 6, 10, 40));
        add(cardsPanel, BorderLayout.CENTER);

        dealer = new JLabel("Dealer");
        player = new JLabel("Player");

        cardsPanel.add(dealer);

        for(int i = 0; i < 11; i++) {
            card = new JLabel(myIcon);
            cardsPanel.add(card);

            if(i == 5)
                cardsPanel.add(player);
        }

        //CONTROLS - BOTTOM
        controlsPanel = new JPanel();
        controlsPanel.setLayout(new BorderLayout());
        add(controlsPanel, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel(); //using to center all buttons in the controls panel
        panel2.setLayout(new FlowLayout());
        controlsPanel.add(panel2, BorderLayout.CENTER);

        deal = new JButton("Deal");
        hit = new JButton("Hit");
        stand = new JButton("Stand");

        panel2.add(deal);
        panel2.add(hit);
        panel2.add(stand);
    }
}
