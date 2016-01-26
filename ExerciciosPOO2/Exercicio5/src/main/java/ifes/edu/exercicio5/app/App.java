package ifes.edu.exercicio5.app;

import ifes.edu.exercicio5.cdp.ArCondicionado;
import ifes.edu.exercicio5.cdp.SensorPessoa;
import ifes.edu.exercicio5.cdp.SensorTemp;

/**
 *
 * @author 20131bsi0033
 */
public class App {
    
    public static void main(String args[]) {
        ArCondicionado ac = new ArCondicionado();
      
        SensorTemp sensorTemp = new SensorTemp(ac);
        ac.SensorTemperatura(sensorTemp);
        sensorTemp.setTemp(18);

        SensorPessoa sensorPessoa = new SensorPessoa(ac);
        ac.SensorPessoa(sensorPessoa);
        sensorPessoa.setQtd(5);

    }
}
