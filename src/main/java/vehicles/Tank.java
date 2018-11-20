package vehicles;

import behaviours.IAttack;
import behaviours.IDamage;

public class Tank extends Vehicle implements IDamage, IAttack {
    public Tank(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }

    public void attack(IDamage victim) {
        victim.takeDamage(getAttackValue());
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue((healthValue -= damage));
    }
}
