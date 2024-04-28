import java.util.*;

class test {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(30);
        li.add(40);
        li.add(50);
        Iterator i = li.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}