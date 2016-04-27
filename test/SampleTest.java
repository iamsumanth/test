import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void basicFailTest() throws Exception {

        int amount = 0;
        Sample sample = new Sample(amount);

        sample.add(2);

        assertEquals(sample.total(), 2);

    }

}
