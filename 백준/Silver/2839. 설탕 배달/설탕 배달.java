
import java.io.IOException;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a >= 0) {
            if (a%5==0) {
                count += a / 5;
                break;
            }
            a -= 3;
            count++;
            if (a < 0){
                count = -1;
            }

        }
        System.out.println(count);






    }
}
