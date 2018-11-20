import behaviours.IDamage;

public class SkyScraper extends Building implements IDamage {

    public SkyScraper(int healthValue) {
        super(healthValue);
    }

    public void takeDamage(int damage) {
        int healthValue = this.getHealthValue();
        setHealthValue((healthValue -= damage));
    }
}
