import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class PotenzaTest {
    private static final double DELTA = 0.001;
    private Potenza op1;
    private Potenza op2;

    @Before
    public void setUp() {
        op1 = new Potenza(2);
        op2 = new Potenza(3);
    }

    @Test
    public void applica() {
        Double num = 2d;

        Assert.assertEquals(4d, op1.applica(num), DELTA);
        Assert.assertEquals(8d, op2.applica(num), DELTA);
    }

    @Test
    public void combina() {
        Double num = 2d;
        OperazioneUnaria<Double> combinata = op1.combina(op2);

        Assert.assertEquals(32d, combinata.applica(num), DELTA);
    }

    @Test
    public void ripeti() {
        Double num = 2d;
        Potenza[] arr = {op1, op2};
        Assert.assertEquals(64d, OperazioneUnaria.ripeti(num, arr), DELTA);
    }
}