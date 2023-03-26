import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI () {
        JFrame titledFrame = new JFrame("Word Game");
        JButton button = new JButton("Click Me");
        JLabel playerOne = new JLabel()


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);



        titledFrame.add(panel, BorderLayout.CENTER);
        titledFrame.pack();
        titledFrame.setVisible(true);
        titledFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

}
