import kaijuMonsters.Godzilla;
import kaijuMonsters.Slattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SlatternTest {

    Godzilla godzilla;
    Slattern slattern;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 100, 50);
        slattern = new Slattern("Slattern", 80, 30);
    }

    @Test
    public void canRoar(){
        assertEquals("Roaaar", slattern.roar());
    }

    @Test
    public void canTakeDamage(){
        slattern.takeDamage(10);
        assertEquals(70, slattern.getHealthValue());
    }

    @Test
    public void canAttack(){
        slattern.attack(godzilla);
        assertEquals(70, godzilla.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("EARTH SHAKES", slattern.move());
    }
}
