import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class test extends JFrame implements ActionListener {
    JTextField t1, t2;
    JLabel l1;
    JButton btn1, btn2;

    test() {
        t1 = new JTextField();
        t1.setBounds(50, 50, 150, 40);
        this.add(t1);

        t2 = new JTextField();
        t2.setBounds(50, 100, 150, 40);
        this.add(t2);
        btn1 = new JButton("ADD");
        this.add(btn1);
        btn1.setBounds(50, 150, 150, 40);
        btn1.addActionListener(this);

        btn2 = new JButton("SUB");
        this.add(btn2);
        btn2.setBounds(250, 150, 150, 40);
        btn2.addActionListener(this);

        l1 = new JLabel();
        l1.setBounds(50, 200, 150, 40);
        this.add(l1);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int i = Integer.parseInt(t1.getText());
        int j = Integer.parseInt(t2.getText());
        int r = 0;
        if (ae.getSource() == btn1) {
            r = i + j;
        }
        if (ae.getSource() == btn2) {
            r = i - j;
        }
        l1.setText(String.valueOf(r));
    }

    public static void main(String[] args) {
        new test();
    }
}