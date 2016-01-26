/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifes.edu.exercicio3.cdp.AbrirCarro;
import ifes.edu.exercicio3.cdp.AbrirPortao;
import ifes.edu.exercicio3.cdp.Carro;
import ifes.edu.exercicio3.cdp.Comando;
import ifes.edu.exercicio3.cdp.FecharCarro;
import ifes.edu.exercicio3.cdp.FecharPortao;
import ifes.edu.exercicio3.cdp.Portao;
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
    public void testSeCarroFechado() {
        Carro car = new Carro();
        car.fecharCarro();
        Comando carroFechar = new FecharCarro(car);
        assertEquals(carroFechar.toString(), "Fechado");
    }
    
    @Test
    public void testSeCarroAberto() {
        Carro car = new Carro();
        car.abrirCarro();
        Comando carroAbrir = new AbrirCarro(car);
        assertEquals(carroAbrir.toString(), "Aberto");
    }

    @Test
    public void testSePortaoAberto() {
        Portao portao = new Portao();
        portao.abrirPortao();
        Comando portaoAbrir = new AbrirPortao(portao);
        assertEquals(portaoAbrir.toString(), "Aberto");
    }
    
    @Test
    public void testSePortaoFechado() {
        Portao portao = new Portao();
        portao.fecharPortao();
        Comando portaoFechar = new FecharPortao(portao);
        assertEquals(portaoFechar.toString(), "Fechado");
    }
}
