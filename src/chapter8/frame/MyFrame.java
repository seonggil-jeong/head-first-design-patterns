package chapter8.frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    // paint() is called when the frame calls update()
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello, World!", 100, 100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("My Frame");
    }
}
