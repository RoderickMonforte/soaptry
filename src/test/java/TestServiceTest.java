import com.daehosting.TemperatureConversions;
import com.daehosting.TemperatureConversionsSoapType;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by student on 2/20/17.
 */
public class TestServiceTest {
    @Test
    public void convert() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions()
                .getTemperatureConversionsSoap12();

        assertEquals("Same",BigDecimal.valueOf(212), service
                .celsiusToFahrenheit
                (BigDecimal.valueOf
                (100)));

    }

}