public class AdventurerTester{
  public static void main(String[] args) {
    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    Wizard b = new Wizard("Homer",4);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");

    }

}
