package uri;

import java.util.Scanner;

public class URI1070 {

    public static void main(String[] args) {

        Scanner keyMap = new Scanner(System.in);
        int X = keyMap.nextInt();
        //9 (9,11,13,15,17,19)

        //apresentation of nambers
        for (int i = 0; i < 12; i++,X++) {
            if (X % 2 != 0 && X > 0) {
                System.out.println(X);
            }
        }
        keyMap.close();
    }
}
