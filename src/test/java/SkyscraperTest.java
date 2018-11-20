import kaijuMonsters.Godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkyscraperTest {

    SkyScraper skyScraper;
    Godzilla godzilla;

    @Before
    public void before(){
        skyScraper = new SkyScraper(300);
        godzilla = new Godzilla("Godzilla", 100, 50);
    }

    @Test
    public void canTakeDamage(){
        skyScraper.takeDamage(100);
        assertEquals(200, skyScraper.getHealthValue());
    }
}
