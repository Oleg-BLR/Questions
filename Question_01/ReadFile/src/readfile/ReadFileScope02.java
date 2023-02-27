package readfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileScope02 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "Question_01/ReadFile/src/readfile/text.txt";
        try {
            FileInputStream in = new FileInputStream(path);
            int biteCode = in.read();
            while (biteCode != -1) {
                // здесь строки 16 и 17 вместе не работают
                // только по отдельности. Почему?
//                System.out.print(biteCode + " ");


//                System.out.print((char) biteCode);
                System.out.print(biteCode + " ");
                System.out.print((char) biteCode);
                System.out.print(biteCode + " ");
                System.out.print(biteCode + " ");
                biteCode = in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
