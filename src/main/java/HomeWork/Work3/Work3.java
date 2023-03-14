//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.


package HomeWork.Work3;

import java.util.ArrayList;
import java.util.Arrays;


public class Work3 {
    public static void main(String[] args) {
        String[] array = new String[]{"123", "sdfsdf", "sdfs","123","123","123","123","123","sdfs" };
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        int i = 0;
        int deleteCounter = 0;
        int counter = 0;
        System.out.println ("Initial list: " + list);
        while (i < list.size()){
            try {
                Integer.parseInt(list.get(i));
            }catch (NumberFormatException e){
                deleteCounter++;
            }
            if (deleteCounter == counter){
                System.out.println (list.get(i) + " deleted");
                list.remove(i);
                i--;
            }else{
                counter++;
            }
            i++;
        }
        System.out.println ("End List: " + list);
    }

}
