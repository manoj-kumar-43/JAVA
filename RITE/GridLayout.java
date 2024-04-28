import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class test extends JFrame {
    test() {
        JFrame f = new JFrame("Login Page");
        f.setLayout(new FlowLayout());
        f.setSize(300, 150);
        f.setVisible(true);
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 3));
        p.add(new Label("Login"));
        p.add(new TextField());
        p.add(new Label("Password"));
        TextField pass = new TextField();
        pass.setEchoChar('*');
        p.add(pass);

        p.add(new Button("OK"));
        p.add(new Button("Cancel"));
        f.add(p);
    }

    public static void main(String[] args) {
        new test();
    }
}