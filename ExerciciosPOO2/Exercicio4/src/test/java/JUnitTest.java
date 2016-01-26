/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifes.edu.exercicio4.cdp.Nivel1;
import ifes.edu.exercicio4.cdp.Nivel2;
import ifes.edu.exercicio4.cdp.PEstrategia;
import ifes.edu.exercicio4.cdp.Renda;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruno
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void Nivel1() {
        PEstrategia impostoDeRenda;
        impostoDeRenda = new Nivel1();
        double valor = impostoDeRenda.ValorImposto(2000);
        Assert.assertEquals(valor, 2000*0.0);

    }
    
    @Test
    public void Nivel2() {
        PEstrategia impostoDeRenda;
        impostoDeRenda = new Nivel2();
        double valor = impostoDeRenda.ValorImposto(2000);
        Assert.assertEquals(valor, 2000*0.075);

    }
}
