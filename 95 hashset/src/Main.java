import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> myHash = new HashSet<>();
        myHash.add(9);
        myHash.add(8);
        myHash.add(7);
        myHash.add(6);
        myHash.add(5);
        System.out.println(myHash);             // not like arraylist but you can write hashset directly
    }
}