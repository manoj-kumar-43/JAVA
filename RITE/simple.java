import java.io.*;

class simple {
    public static void main(String[] args) throws Exception {
        FileInputStream fin1 = new FileInputStream("Manoj.txt ");
        FileInputStream fin2 = new FileInputStream("Rinku.txt");
        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i;
        while ((i = sis.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
