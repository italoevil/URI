package uri;

import java.util.Scanner;

public class URI1071 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int X,Y,total = 0;
        X = input.nextInt();
        Y = input.nextInt();

        //-5
        //6
        int maior = X;
        int menor = Y;
        if (X < Y) {
            maior = Y;
            menor = X;
        }
        for (int i = (maior-1); i > menor; i--) {
            if (i % 2 != 0) {
                total+= i;
            }
        }
        System.out.println(total);
        input.close();
    }
}
