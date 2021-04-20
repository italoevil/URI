package uri;

import java.util.Scanner;

public class URI1074 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N < 10000){
            String msg ="";
            for (int i = 0; i < N; i++) {
                int V = input.nextInt();
                if (V % 2 == 0){
                    msg = "EVEN ";
                }else{
                    msg = "ODD ";
                }
                if (V < 0){
                    msg += "NEGATIVE";
                }else if (V > 0){
                    msg += "POSITIVE";
                }else{
                    msg = "NULL";
                }
                System.out.println(msg);
            }
        }
        input.close();
    }
}
