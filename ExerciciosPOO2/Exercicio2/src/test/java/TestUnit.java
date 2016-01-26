import ifes.edu.exercicio2.cdp.Sensor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20131bsi0033
 */
public class TestUnit {
    
    @Test
    public void testPessoas() {
        Sensor sensor = new Sensor();
        sensor.setNumPessoas(5);
        assertEquals(sensor.getNumPessoas(), 5);      
    }
    
    @Test
    public void testTemperatura() {
        Sensor sensor = new Sensor();
        sensor.setTempAmbiente(25);
        assertEquals(25, sensor.getTempAmbiente());
    }
        
}
