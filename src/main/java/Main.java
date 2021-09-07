public class Main {
    public static void main(String[] args) {
        FamilyMember bob = new FamilyMember("Bob", 30, FamilyPosition.Husband);
        FamilyMember anna = new FamilyMember("Anna", 30, FamilyPosition.Wife);

        System.out.println(bob.getFamilyPosition());
        System.out.println(anna.getFamilyPosition());

        bob.setPersonalBalance(100);
        anna.setPersonalBalance(1000);

        bob.goShopping(50);
        anna.goShopping(100);

        System.out.println(bob.getMoodBar());
        System.out.println(anna.getMoodBar());

        bob.goShopping(100);

    }
}
