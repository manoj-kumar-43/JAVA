import java.util.*;

class test {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(30);
        li.add(40);
        li.add(50);
        for (Object i : li) {
            System.out.println(i);
        }
    }
}