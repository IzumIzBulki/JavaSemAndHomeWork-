package HomeWork.Work6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> lap = new ArrayList<>();

        Laptop lap1 = new Laptop("nvidia", 1200, "red", 4000);
        Laptop lap2 = new Laptop("msi", 2200, "blue", 5000);
        Laptop lap3 = new Laptop("geforce", 2200, "black", 6000);
        Laptop lap4 = new Laptop("lenovo", 4200, "yellow", 7000);
        Laptop lap5 = new Laptop("hp", 5200, "red", 4000);

        lap.add(lap1);
        lap.add(lap2);
        lap.add(lap3);
        lap.add(lap4);
        lap.add(lap5);


        switch (searchInterface()){
            case (1):
                System.out.print("Введите требуемое количество оперативной памяти: ");
                int ram = sc.nextInt();
                for (int i = 0; i < lap.size(); i++) {
                    if (ram == lap.get(i).getRam()){
                        System.out.println(lap.get(i).display());
                    }
                }break;
            case (2):
                System.out.print("Введите желаемый цвет ноутбука: ");
                String color = sc.next();
                for (int i = 0; i < lap.size(); i++) {
                    if (color.equals(lap.get(i).getColor())){
                        System.out.println(lap.get(i).display());
                    }
                }break;
            case (3):
                System.out.print("Введите требуемое количество объема видеокарты: ");
                int graphicsCardVolume = sc.nextInt();
                for (int i = 0; i < lap.size(); i++) {
                    if (graphicsCardVolume == lap.get(i).getGraphicsCardVolume()){
                        System.out.println(lap.get(i).display());
                    }
                }break;
            case (4):
                for (int i = 0; i < lap.size(); i++) {
                    System.out.println(lap.get(i).display());
                }break;
            case (0):
                System.out.println("Программа закрыта!");
                break;
        }

    }

    public static Integer searchInterface(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой параметр хотите выбрать?");
        System.out.println("1 - Оперативная память");
        System.out.println("2 - Цвет");
        System.out.println("3 - Объем видеокарты");
        System.out.println("4 - Показать все ноутбуки");
        System.out.println("0 - Для выхода");
        System.out.print("Выберите пункт: ");
        Integer data = sc.nextInt();
        return data;
    }


}
