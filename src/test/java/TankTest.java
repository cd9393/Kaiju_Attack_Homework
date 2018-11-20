import kaijuMonsters.Godzilla;
import org.junit.Before;
import org.junit.Test;
import vehicles.Helicopter;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Godzilla godzilla;

    @Before
    public void before(){
        tank = new Tank("Big Tank", 50, 10);
        godzilla = new Godzilla("GodZilla", 100, 50);
    }


    @Test
    public void canTakeDamage(){
        tank.takeDamage(10);
        assertEquals(40, tank.getHealthValue());
    }

    @Test
    public void canAttack(){
        tank.attack(godzilla);
        assertEquals(90, godzilla.getHealthValue());
    }

}
