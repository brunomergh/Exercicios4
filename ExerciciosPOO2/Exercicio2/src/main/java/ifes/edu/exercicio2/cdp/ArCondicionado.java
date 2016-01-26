package ifes.edu.exercicio2.cdp;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 20131bsi0033
 */
public class ArCondicionado implements Observer {
    
    private static final int alertaTemp = 25;
    
    private Integer numPessoas;
    private Integer temp;
    
    private ArrayList<Sensor> sensores;

    public ArCondicionado() {
        this.sensores = new ArrayList<Sensor>();        
    }
    
        private Integer MediaPessoas() {
        int soma = 0;
        int totalsensores = sensores.size();
        for(Sensor s: sensores) {
            soma += s.getNumPessoas();
        }
        return soma / totalsensores;
    }

    private Integer MediaTemperatura() {
        int soma = 0;
        int totalsensores = sensores.size();
        for(Sensor s: sensores) {
            soma += s.getTempAmbiente();
        }
        return soma / totalsensores;                        
    }
    
    @Override
    public void update(Observable o, Object arg) {
        
        Sensor sensor = (Sensor) o;
        sensores.add(sensor);
        this.numPessoas = this.MediaPessoas();
        this.temp = this.MediaTemperatura() + this.numPessoas;
        if (this.temp > alertaTemp){
            System.out.printf("Temperatura %dº, esta acima\n", this.temp);
        }else{
            System.out.printf("Temperatura %dº, esta correta\n", this.temp);
        }
    }
  
}
