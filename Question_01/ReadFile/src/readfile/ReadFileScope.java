package readfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileScope {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "Question_01/ReadFile/src/readfile/text.txt";
        try {
            FileInputStream in = new FileInputStream(path);
            int biteCode = in.read();
            while (biteCode != -1) {
                // здесь строки 16 и 17 вместе не работают
                // только по отдельности. Почему?
                System.out.print(biteCode + " ");
                char c = (char) biteCode;
                System.out.print(c);

//                if (c == '\r') {
//                    // надо добавить экранирвоание (escaping) для  симовола \r (\r - это возврат каретки, то есть пернос курсора в первую ячейку текущей строки)
//                    // если не добавить, то идет перенос в начало строки, все стирается, что было перед \r и остается только 10-
//                    // https://www.w3schools.com/java/java_strings_specchars.asp
//                    System.out.print("");
//
//                } else {
//                    System.out.print(c);
//                }


//                System.out.print((char) biteCode);
//                System.out.print(biteCode + " ");
//                System.out.print((char) biteCode);
//                System.out.print(biteCode + " ");
//                System.out.print(biteCode + " ");
                biteCode = in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
