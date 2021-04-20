package uri;

import java.util.Scanner;

public class URI1072 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            int V = input.nextInt();
            if (V >= 10 && V <= 20){
                in++;
            }else {
                out++;
            }
        }
        System.out.println(in +" in");
        System.out.println(out +" out");
        input.close();
    }
}
