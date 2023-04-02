package HomeWork.WorkOOP2;
import java.util.Random;


public class MainProgram {
    public static void main(String[] args) {
        Random r = new Random();
        Mother mom = new Mother(35, "Natalie", "Grey", 65, 180, 3000);
        Dad dad = new Dad(38, "Maksim", "Grey", 80, 185, 6000);
        Brother bro = new Brother(18, "Sergey", "Red", 70, 195, 500);
        Sister sis = new Sister(15, "Elena", "Green", 50, 165, 500);
        childSister child = new childSister(3, "Katay", "Black", 10, 100, 0);

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(sis.getInfoHuman() + sis.getInfo());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(bro.getInfoHuman() + bro.getInfo());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(mom.getInfoHuman() + mom.getInfo());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(dad.getInfoHuman() + dad.getInfo());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(child.getInfoHuman() + child.getInfo());

        for (int i = 0; i < 3; i++) {
            int number = r.nextInt(1, 3);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(child.cry());
            switch (number){
                case (1):
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println(child.eat());
                    System.out.println(sis.getName()+ " " + sis.feedBaby());
                    child.setAge(child.getAge() + 1);
                    break;
                case (2):
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println(child.diaper());
                    System.out.println(sis.getName()+ " " + sis.changeDiaper());
                    child.setAge(child.getAge() + 1);
                    break;
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Прошло 3 года, ребенку исполнилось" + " " + child.getAge() + " " + "лет" );
}


}
