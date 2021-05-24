import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();

        System.out.println(Math.max(h, l-h)*Math.max(v, l-v)*4);
    }
}
