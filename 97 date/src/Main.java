import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());            // yea in java is claculated from 1900 so 124 yrs
        System.out.println(d.getSeconds());
        System.out.println(d.getDate());

    }
}