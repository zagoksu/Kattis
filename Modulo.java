import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int modulo = sc.nextInt() % 42;
            if(!nums.contains(modulo))
                nums.add(modulo);
        }
        System.out.println(nums.size());
    }
}
