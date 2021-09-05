import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String score = "";

        MyObserver observer = new MyObserver();
        observer.register(new Youtube());
        observer.register(new Television());
        observer.register(new Radio());

        System.out.println("Enter -1 to exit program");

        score = in.nextLine();
        while (!score.equals("-1")){
            observer.setScore(score);
            score = in.nextLine();

        }

        System.out.println("End of Observer");


    }
}
