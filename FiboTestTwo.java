import org.junit.Test;

public class FiboTestTwo {

    @Test(expected = RuntimeException.class)
    public void testNegaive() throws RuntimeException {
        Fibo.compute(-1);
    }
}
