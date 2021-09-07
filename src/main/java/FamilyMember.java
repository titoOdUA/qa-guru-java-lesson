public class FamilyMember extends Person {

    private final FamilyPosition familyPosition;
    private int personalBalance;

    public int getPersonalBalance() {
        return personalBalance;
    }

    public void setPersonalBalance(int personalBalance) {
        this.personalBalance = personalBalance;
    }

    public FamilyMember(String name, int age, FamilyPosition familyPosition) {
        this.name = name;
        this.age = age;
        this.familyPosition = familyPosition;
        this.moodBar = 50;
    }

    public void goShopping(int moneySpent) {
        if (this.personalBalance - moneySpent <= 0) {
            System.out.println("I can't buy anything");
        } else {
            System.out.println(this.name + " is shopping now.");
            this.personalBalance -= moneySpent;
            switch (this.familyPosition) {
                case Husband:
                    System.out.println("Not again :(");
                    this.moodBar -= 10;
                    System.out.println(this.name + "'s mood is decreased!");
                    break;
                case Wife:
                    System.out.println("I love shopping!");
                    this.moodBar += 10;
                    System.out.println(this.name + "'s mood is increased!");
                    break;
            }
        }
    }

    public FamilyPosition getFamilyPosition() {
        return familyPosition;
    }
}
