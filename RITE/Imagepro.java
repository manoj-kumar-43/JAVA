import javax.swing.*;

class test {
    test() {
        JFrame f = new JFrame();
        JButton b = new JButton(new ImageIcon("\"C:\\Users\\mkuma\\OneDrive\\图片\\B612_20231114_095450_933.jpg\""));
        b.setBounds(130, 100, 800, 300);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}