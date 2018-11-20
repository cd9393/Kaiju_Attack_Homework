package kaijuMonsters;

import behaviours.IAttack;
import behaviours.IDamage;

public class Godzilla extends Kaiju implements IAttack, IDamage {

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move() {
        return "THUD THUD THUD";
    }


    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue((healthValue -= damage));
    }

    public void attack(IDamage victim) {
        victim.takeDamage(getAttackValue());
    }
}
