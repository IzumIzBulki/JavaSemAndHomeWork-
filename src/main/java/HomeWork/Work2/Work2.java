//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package HomeWork.Work2;
import java.io.FileWriter;
import java.io.IOException;

public class Work2 {
    public static void main(String[] args) throws IOException {
        createFileTest(createStringTest());
    }
    public static String createStringTest() {
        String str = "Test";
        for (int i = 0; i < 99; i++) {
            str += "Test";
        }
        System.out.println("Создание строки завершено!");
        return str;
    }
    public static void createFileTest(String test) throws IOException {
        FileWriter fw = new FileWriter( "fileTest.txt" );
        fw.write(test);
        fw.close();
        System.out.println("Строка добавлена в файл");
    }
}
