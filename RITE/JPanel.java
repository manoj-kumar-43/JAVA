import java.awt.Color;
import javax.swing.*;

class test {
    public static void main(String[] args) {
        JFrame f = new JFrame("The JFrame");
        f.setSize(400, 400);
        f.setLocation(200, 200);
        f.setLayout(null);

        JPanel p = new JPanel();
        p.setBounds(100, 50, 200, 200);
        p.setBackground(Color.RED);
        f.add(p);

        JButton btn = new JButton("Login");
        p.add(btn);
        JButton btn1 = new JButton("Exit");
        p.add(btn1);
        f.setVisible(true);
    }
}