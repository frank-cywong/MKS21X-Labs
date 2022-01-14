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

  public String attack(Damageable other){
    int damage = 5 + (int)(mana * Math.random());
    other.applyDamage(damage);
    setMana(getMana()+1);
    return(this + " attacked " + other + " for " + damage + " damage!");
  }

  public String specialAttack(Damageable other){
    int damage = 10 + (int)(mana * mana * Math.random()) / 2;
    int toHeal = damage / 5;
    this.applyDamage(-1 * toHeal);
    other.applyDamage(damage);
    setMana(0);
    return(this + " attacked " + other + " for " + damage + " damage, and healed " + toHeal + " HP!");
  }

  public void setMana(int m){
    mana = m;
  }
  public int getMana(){
    return mana;
  }

  public String toString(){
    return "Wizard " + super.toString();
  }
}
