package ifes.edu.exercicio2.cdp;

import java.util.Observable;

/**
 *
 * @author 20131bsi0033
 */
public class Sensor extends Observable {
    private int tempAmbiente;
    private int numPessoas;
    
    public Sensor() {
    }     

    public float getTempAmbiente() {
        return tempAmbiente;
    }

    public void setTempAmbiente(int temp) {
        this.tempAmbiente = temp;
        setChanged();
        notifyObservers();
    }
    
    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int num) {    
        this.numPessoas = num;
        setChanged();
        notifyObservers();
    }

}
