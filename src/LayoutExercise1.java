/*
Vivian Peng
18/12/2022
ICS3U7, Ms. S
GUI Exercise #1
 */

/*
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LayoutExercise1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Buttons");

        Container cont = frame.getContentPane();

        Buttons buttons= new Buttons(); //object of button panel
        cont.add(buttons); //adding to the west part of frame

        frame.setSize(640,440);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Buttons extends JPanel{
    JPanel buttonPanel;
    public Buttons(){ //constructor
        setLayout(new BorderLayout());

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        add(buttonPanel, BorderLayout.WEST);

        buttonPanel.add(Box.createVerticalGlue());
        for(int i = 1; i < 6; i++) {
            JButton button = new JButton();
            button.setText("Command" + i);
            buttonPanel.add(button);
        }
        buttonPanel.add(Box.createVerticalGlue());
    }
}

 */