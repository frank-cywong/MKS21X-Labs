public class Wizard extends Adventurer {
  private int mana;

  public Wizard(){
    this("Generic Name");
  }

  public Wizard(String name){
    this(name, 5);
  }

  public Wizard(String name, int mana){
    super(name, 20 + (int)(5 * Math.random()));
    setMana(mana);
  }

  public void attack(Damageable other){
    int damage = 5 + (int)(mana * Math.random());
    other.applyDamage(damage);
    setMana(getMana()+1);
    System.out.println(this + " attacked " + other + " for " + damage + " damage!");
  }

  public void specialAttack(Damageable other){
    int damage = 10 + (int)(mana * mana * Math.random()) / 2;
    setHP(getHP() + damage / 5);
    other.applyDamage(damage);
    setMana(0);
    System.out.println(this + " attacked " + other + " for " + damage + " damage, and healed " + damage / 5 + " HP!");
  }

  public void setMana(int m){
    mana = m;
  }
  public int getMana(){
    return mana;
  }

  public String toString(){
    return "Generic Wizard " + super.toString();
  }
}
