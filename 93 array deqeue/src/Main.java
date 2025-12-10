import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(3);                                                         // array deqeue is adding element or removing element from first or last
        ad1.add(9);
        ad1.add(8);
        ad1.add(5);
        ad1.addFirst(7);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1.getLast());






    }
}