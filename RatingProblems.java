import java.util.Scanner;

public class RatingProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double sum = 0;
        for(int i = 0; i < k; i++){
            sum += sc.nextInt();
        }
        double min = (sum + ((n-k) * -3))/n;
        double max = (sum + ((n-k)* 3))/n;
        System.out.println(min + " " + max);
    }
}
