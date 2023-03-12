//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package HomeWork.Work2;
import java.io.FileWriter;
import java.io.IOException;

public class Work2 {
    public static void main(String[] args) throws IOException {
        createFileTest(createStringTest());
    }
    public static StringBuilder createStringTest() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            if (i%10 == 0) {
                str.append("\n"+(i+1)+"Test ");
            }else{
                str.append((i+1)+"Test ");
            }

        }
        System.out.println("Создание строки завершено!");
        return str;
    }
    public static void createFileTest(StringBuilder test) throws IOException {
        FileWriter fw = new FileWriter( "fileTest.txt" );
        fw.write(String.valueOf(test));
        fw.close();
        System.out.println("Строка добавлена в файл");
    }
}
