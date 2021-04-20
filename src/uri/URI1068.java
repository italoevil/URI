package uri;

import java.io.*;
import java.util.Scanner;

public class URI1068 {

    public static void main(String[] args) throws IOException {

        // Input Data of Expression
        Scanner keyMap = new Scanner(System.in);
        String path = "c:\\Programming\\exit.txt";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));

        do {
            String expressio = keyMap.nextLine();//expression
            int count = 0;
            boolean correct = true;
            int lengthOfExpression = expressio.length();

        // cheking value of expression section actual
            if (lengthOfExpression <= 1000) {
                for (int i = 0; i < expressio.length(); i++) {
                    char letter = expressio.charAt(i);
                    if (letter == '(') {
                        count++;
                    }
                    if (letter == ')') {
                        count--;
                        if (count < 0) {
                            correct = false;
                            break;
                        }
                    }
                }
                correct = (count == 0);

                // point start writer file
                String response = (correct) ? "correct" : "incorrect";
                buffer.write(response);
                buffer.flush();
                buffer.newLine();
                //where no exist more expression
                if (!keyMap.hasNext()){
                    BufferedReader reade = new BufferedReader(new FileReader(path));
                    String line = "";
                    while ((line = reade.readLine()) != null){
                        System.out.println(line);
                    }
                }
            }
        }while (keyMap.hasNext());
        keyMap.close();
        buffer.close();
    }
}
