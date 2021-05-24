import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        int r = 0; int e = 0; int c = 0;
        for (int i = 0; i < numOfCases; i++){
            r = sc.nextInt();
            e = sc.nextInt();
            c = sc.nextInt();
            if((e - r) > c)
                System.out.println("advertise");
            else if ((e -r) == c)
                System.out.println("does not matter");
            else
                System.out.println("do not advertise");
        }

    }
}
