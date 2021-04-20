package uri;

import java.util.Scanner;

public class URI1073 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 1; i <= N && N < 2000; i++) {
            if (i % 2 == 0) {
                System.out.println(i+"^2 = "+(i*i));
            }
        }
        input.close();
    }
}
