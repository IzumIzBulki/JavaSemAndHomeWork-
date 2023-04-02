package HomeWork.WorkOOP1;

public class FamilyTree {
    public static void main(String[] args) {
        Mother mom = new Mother(35, "Natalie", "Grey", 65, 180, 3000);
        Dad dad = new Dad(38, "Maksim", "Grey", 80, 185, 6000);
        Brother bro = new Brother(18, "Sergey", "Red", 70, 195, 500);
        Sister sis = new Sister(15, "Elena", "Green", 50, 165, 500);
        childSister child = new childSister(3, "Katay", "Black", 10, 100, 0);

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(dad.getInfoDad());
        System.out.println(mom.getInfoMother());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(bro.getInfoBrother());
        System.out.println(sis.getInfoSister());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Катя вышла замуж, поменяла имя и у нее родилась дочь!");
        sis.setName("FedorovaElena");
        System.out.println("С тех пор прошло 3 года");
        sis.setAge(18);
        System.out.println(sis.getInfoSister());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(child.getInfo());
        System.out.println("-----------------------------------------------------------------------------");
    }


}
