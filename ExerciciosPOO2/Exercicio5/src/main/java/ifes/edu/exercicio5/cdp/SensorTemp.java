package ifes.edu.exercicio5.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class SensorTemp {
    
    private ArCondicionado ac;
    private double temp;
    
    public SensorTemp(ArCondicionado ac) {
        this.ac = ac;
    }  
    public double getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
        ac.update();
    }
    
}
