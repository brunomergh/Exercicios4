package ifes.edu.exercicio5.cdp;

import java.util.ArrayList;

/**
 *
 * @author 20131bsi0033
 */
public class ArCondicionado {

    private ArrayList<SensorTemp> sensorTemp;
    private ArrayList<SensorPessoa> sensorPessoas;
    private double tempAtual;
    
    public ArCondicionado() {
        sensorTemp = new ArrayList<>();
        sensorPessoas = new ArrayList<>();
    }
    
    public void SensorPessoa(SensorPessoa sensorPessoa) {
        sensorPessoas.add(sensorPessoa);        
    }
    public void SensorTemperatura(SensorTemp sensorTemperatura) {
        sensorTemp.add(sensorTemperatura);
    }

    public double getTemp() {
        return tempAtual;
    }

    public void calculaTemperatura() {
        double mediaTemp = 0;
        double mediaPessoa = 0;
        
        if(sensorTemp.size() > 0) {
            for(SensorTemp sensor: sensorTemp) {
                mediaTemp = mediaTemp + sensor.getTemp();
            }

            mediaTemp = mediaPessoa / sensorTemp.size();
        }
        if(sensorPessoas.size() > 0) {
            for(SensorPessoa sensor: sensorPessoas){
                mediaPessoa = mediaPessoa + sensor.getQtd();
            }
            mediaPessoa = mediaPessoa / sensorPessoas.size();
        }
        tempAtual = mediaTemp + mediaPessoa;        
    }
    
    public void update() {
        calculaTemperatura();
        System.out.printf("%.2f", tempAtual);
    }        
}
