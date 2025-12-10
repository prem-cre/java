import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5); // intial capacity is max elements
        l2.add(16);
        l2.add(26);
        l2.add(26);

        l1.add(6);
        l1.add(5);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);                   // element 5 will be added in index 0 i.e 1 st place
        l1.add(0, 9);                   //^^^^ same
        l1.addAll(l2);
        //  l1.clear();                               //it clears all elements
        System.out.println(l1.contains(444));       //no 444 so returns false
        System.out.println(l1.indexOf(7));              // prints index 7 th element
        System.out.println(l1.lastIndexOf(7));
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));          // get 0 or 1 or 2 .. ives their respective elements;
            System.out.print(", ");
        }
    }


}




