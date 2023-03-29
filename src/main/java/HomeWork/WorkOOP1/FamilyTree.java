package HomeWork.WorkOOP1;

public class FamilyTree {
    public static void main(String[] args) {
        Mother mom = new Mother();
        Dad dad = new Dad();
        Brother bro = new Brother();
        Sister sis = new Sister();

        System.out.println(dad.getInfo());
        System.out.println(mom.getInfo());

        System.out.println(bro.getInfo());
        System.out.println(sis.getInfo());



    }


}
