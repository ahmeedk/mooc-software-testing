package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy gHappy = new GHappy();

    @Test
    public void gHappy_on_xxggxx_shouldReturnTrue() {

        Assertions.assertTrue(gHappy.gHappy("xxggxx"));
    }

    @Test
    public void gHappy_on_xxgg_shouldReturnTrue() {
        Assertions.assertTrue(gHappy.gHappy("xxgg"));
    }

    @Test
    public void gHappy_on_ggxx_shouldReturnTrue() {
        Assertions.assertTrue(gHappy.gHappy("ggxx"));
    }

    @Test
    public void gHappy_on_xxgxx_shouldReturnFalse() {
        Assertions.assertFalse(gHappy.gHappy("xxgxx"));
    }

    @Test
    public void gHappy_on_gxx_shouldReturnFalse() {
        Assertions.assertFalse(gHappy.gHappy("gxx"));
    }

    @Test
    public void gHappy_on_xxxg_shouldReturnFalse() {
        Assertions.assertFalse(gHappy.gHappy("xxxg"));
    }
}
