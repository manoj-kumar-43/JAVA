import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Demo extends JFrame implements ActionListener {
    JButton btn;

    Demo() {
        btn = new JButton("OK");
        this.add(btn);
        btn.setBounds(100, 100, 150, 40);
        btn.addActionListener(this);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        JDialog obj = new JDialog();
        obj.setBounds(100, 100, 200, 200);
        obj.setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}