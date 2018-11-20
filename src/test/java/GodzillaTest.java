import kaijuMonsters.Godzilla;
import kaijuMonsters.Slattern;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;
    Slattern slattern;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 100, 50);
        slattern = new Slattern("Slattern", 80, 30);
    }

    @Test
    public void canRoar(){
        assertEquals("Roaaar", godzilla.roar());
    }

    @Test
    public void canTakeDamage(){
        godzilla.takeDamage(10);
        assertEquals(90, godzilla.getHealthValue());
    }

    @Test
    public void canAttack(){
        godzilla.attack(slattern);
        assertEquals(30, slattern.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("THUD THUD THUD", godzilla.move());
    }

}
