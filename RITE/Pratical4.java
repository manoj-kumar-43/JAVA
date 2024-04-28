import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class test extends JFrame implements ActionListener {
    JTextField t1, t2;
    JLabel l1;
    JButton b1, btn2, btn3, btn4;

    test() {
        t1 = new JTextField();
        t1.setBounds(50, 50, 150, 40);
        this.add(t1);

        t2 = new JTextField();
        t2.setBounds(50, 100, 150, 40);
        this.add(t2);

        b1 = new JButton("ADD");
        this.add(b1);
        b1.setBounds(50, 150, 150, 40);
        b1.addActionListener(this);

        btn2 = new JButton("SUB");
        this.add(btn2);
        btn2.setBounds(250, 150, 150, 40);
        btn2.addActionListener(this);

        btn3 = new JButton("MULTI");
        this.add(btn3);
        btn3.setBounds(50, 250, 150, 40);
        btn3.addActionListener(this);

        btn4 = new JButton("DIV");
        this.add(btn4);
        btn4.setBounds(250, 250, 150, 40);
        btn4.addActionListener(this);

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
        if (ae.getSource() == b1) {
            r = i + j;
        }
        if (ae.getSource() == btn2) {
            r = i - j;
        }
        if (ae.getSource() == btn3) {
            r = i * j;
        }
        if (ae.getSource() == btn4) {
            r = i / j;
        }
        l1.setText(String.valueOf(r));
    }

    public static void main(String[] args) throws Exception {
        new test();
    }

}
