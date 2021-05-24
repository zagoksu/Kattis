import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 0; int max =0; int winnerRow = 0;
        for (int i = 0; i < 5; i++){
            int sum = 0;
            for (int j = 0; j < 4; j ++){
                sum += sc.nextInt();

            }
            if(sum>max){
                max=sum;
                winnerRow=i;
            }
        }
        System.out.println(winnerRow + 1 + " " + max );

    }

}
