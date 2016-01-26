package ifes.edu.exercicio2.app;

import ifes.edu.exercicio2.cdp.ArCondicionado;
import ifes.edu.exercicio2.cdp.Sensor;

/**
 *
 * @author 20131bsi0033
 */
public class App {
    public static void main(String args[]){
        
        ArCondicionado ac = new ArCondicionado();
        
        Sensor sensor1 = new Sensor();
        sensor1.addObserver(ac);
        
        Sensor sensor2 = new Sensor();
        sensor2.addObserver(ac);
        
        Sensor sensor3 = new Sensor();
        sensor3.addObserver(ac);
        
        sensor1.setNumPessoas(5);
        sensor1.setTempAmbiente(26);
    }
}
