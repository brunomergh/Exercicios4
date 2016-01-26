/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifes.edu.exercicio5.cdp.ArCondicionado;
import ifes.edu.exercicio5.cdp.SensorPessoa;
import ifes.edu.exercicio5.cdp.SensorTemp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20131bsi0033
 */
public class UnitTest {

    @Test
    public void TestaSensorPessoa() {
        ArCondicionado ac = new ArCondicionado();
        SensorPessoa sensor = new SensorPessoa(ac);
        assertEquals(sensor.getQtd(), 0);
    }
    @Test
    public void TestTemp() {
        ArCondicionado ac = new ArCondicionado();
        SensorTemp sensorTemp = new SensorTemp(ac);
        ac.SensorTemperatura(sensorTemp);
        sensorTemp.setTemp(6);
        SensorPessoa sensorPessoa = new SensorPessoa(ac);
        ac.SensorPessoa(sensorPessoa);
        sensorPessoa.setQtd(6);
        assertEquals(Math.round(ac.getTemp()), 6, 6);
    }
}
