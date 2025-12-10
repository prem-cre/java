import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.logic();
    }
}

class Quiz {
    Scanner sc = new Scanner(System.in);
    int correctAnsCount = 0;
    int wrongAnsCount = 0;

    public void logic() {
        Questions q1 = new Questions("Which statement is true about Java?", "A. Java is a programming language", "B. Java is a coffee", "C. Java is an island", "D. All of the above");
        Questions q2 = new Questions("What is the file extension for Java files?", "A. .java", "B. .class", "C. .js", "D. .py");
        Questions q3 = new Questions("What is the file extension for Java whatdfff?", "A. .java", "B. .class", "C. .js", "D. .py");
        Questions q4 = new Questions("What is the file extension for varible?", "A. .java", "B. .class", "C. .js", "D. .py");

        Map<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'D');
        hmap.put(q2, 'A');
        hmap.put(q3, 'B');
        hmap.put(q4, 'D');

        for (Map.Entry<Questions, Character> map : hmap.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter your answer:");
            Character ans = sc.next().charAt(0);

            if (ans.equals(map.getValue())) {
                System.out.println("Correct!");
                correctAnsCount++;
            } else {
                System.out.println("Incorrect. The correct answer is " + map.getValue());
                wrongAnsCount++;
            }
        }
        System.out.println();
        System.out.println("--result--");
        System.out.println("total questions"+ hmap.size());
        System.out.println("correct ans"+correctAnsCount);
        System.out.println("wrong ans"+wrongAnsCount);
        int percentage = (100*correctAnsCount)/hmap.size();
        System.out.println(" Percentage"+percentage);
        if (percentage>=95){
            System.out.println("performance good");
        } else if (percentage<=35) {
            System.out.println("not bad");
        }
        else {
            System.out.println("bad");
        }


    }
}



























