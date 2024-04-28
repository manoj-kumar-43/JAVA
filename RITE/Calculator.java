import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class test extends JFrame implements ActionListener {
    int c, n;
    String s1, s2, s3, s4, s5;
    JFrame f;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, bdiv, beq, bclr;
    JTextField t1;
    JPanel p;
    GridLayout g;

    test() {
        f = new JFrame("Calculator");
        f.setLayout(new FlowLayout());
        p = new JPanel();

        b0 = new JButton("0");
        b0.addActionListener(this);

        b1 = new JButton("1");
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.addActionListener(this);

        badd = new JButton("+");
        badd.addActionListener(this);

        bsub = new JButton("-");
        bsub.addActionListener(this);

        bmul = new JButton("*");
        bmul.addActionListener(this);

        bdiv = new JButton("/");
        bdiv.addActionListener(this);

        beq = new JButton("=");
        beq.addActionListener(this);

        bclr = new JButton("CLR");
        bclr.addActionListener(this);

        t1 = new JTextField(20);
        f.add(t1);

        g = new GridLayout(6, 6);
        p.setLayout(g);

        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bsub);
        p.add(bmul);
        p.add(bdiv);
        p.add(beq);
        p.add(bclr);

        f.add(p);
        f.setSize(350, 250);
        f.setVisible(true);
        f.setBackground(Color.black);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ae) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b0) {
            s3 = t1.getText();
            s4 = "0";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b1) {
            s3 = t1.getText();
            s4 = "1";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b2) {
            s3 = t1.getText();
            s4 = "2";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b3) {
            s3 = t1.getText();
            s4 = "3";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b4) {
            s3 = t1.getText();
            s4 = "4";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b5) {
            s3 = t1.getText();
            s4 = "5";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b6) {
            s3 = t1.getText();
            s4 = "6";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b7) {
            s3 = t1.getText();
            s4 = "7";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b8) {
            s3 = t1.getText();
            s4 = "8";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == b9) {
            s3 = t1.getText();
            s4 = "9";
            s5 = s3 + s4;
            t1.setText(s5);
        }
        if (ae.getSource() == badd) {
            s1 = t1.getText();
            t1.setText("");
            c = 1;
        }
        if (ae.getSource() == bsub) {
            s1 = t1.getText();
            t1.setText("");
            c = 2;
        }
        if (ae.getSource() == bmul) {
            s1 = t1.getText();
            t1.setText("");
            c = 3;
        }
        if (ae.getSource() == bdiv) {
            s1 = t1.getText();
            t1.setText("");
            c = 4;
        }
        if (ae.getSource() == beq) {
            s2 = t1.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
            if (c == 4) {
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            }
        }
        if (ae.getSource() == bclr) {
            t1.setText("");
        }
    }

    public static void main(String[] args) {
        new test();
    }
}