import kaijuMonsters.Godzilla;
import org.junit.Before;
import org.junit.Test;
import vehicles.Helicopter;

import static org.junit.Assert.assertEquals;

public class HelicopterTest {

    Helicopter helicopter;
    Godzilla godzilla;

    @Before
    public void before(){
        helicopter = new Helicopter("Black Hawk", 50, 10);
        godzilla = new Godzilla("GodZilla", 100, 50);
    }



    @Test
    public void canTakeDamage(){
        helicopter.takeDamage(10);
        assertEquals(40, helicopter.getHealthValue());
    }

    @Test
    public void canAttack(){
        helicopter.attack(godzilla);
        assertEquals(90, godzilla.getHealthValue());
    }
}
