import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 2;
        while(a < 10){
            a++;
            System.out.println("Hello world! " + a);
        }
        a = 0;
        do{
            a++;
            System.out.println("a = " + a);
        }
        while (a < 10);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        timer(3);
        timer(x);
    }

    public static void timer(int x){
        int min = x / 60;
        int sec = x % 60;
        for (int j = x; j >= 0; j--) {
            min = j / 60;
            sec = j % 60;
            System.out.println("Minutes: " + min + ". Seconds: " + sec);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}