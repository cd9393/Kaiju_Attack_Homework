package kaijuMonsters;

import behaviours.IAttack;
import behaviours.IDamage;

public class Slattern extends Kaiju implements IAttack, IDamage {

    public Slattern(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move() {
        return "EARTH SHAKES";
    }

    public void attack(IDamage victim) {
        victim.takeDamage(getAttackValue());
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue((healthValue -= damage));
    }
}
