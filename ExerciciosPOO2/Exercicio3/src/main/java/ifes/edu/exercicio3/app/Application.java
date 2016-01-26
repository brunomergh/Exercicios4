package ifes.edu.exercicio3.app;

import ifes.edu.exercicio3.cdp.Comando;
import ifes.edu.exercicio3.cdp.FecharCarro;
import ifes.edu.exercicio3.cdp.Controle;
import ifes.edu.exercicio3.cdp.AbrirPortao;
import ifes.edu.exercicio3.cdp.Portao;
import ifes.edu.exercicio3.cdp.FecharPortao;
import ifes.edu.exercicio3.cdp.AbrirCarro;
import ifes.edu.exercicio3.cdp.Carro;


/**
 *
 * @author 20131bsi0033
 */
public class Application {
    public static void main(String ricardinholindo[]){        
        Portao portao = new Portao();
        portao.abrirPortao();
        Comando portaoAbrir = new AbrirPortao(portao);
        Comando portaoFechar = new FecharPortao(portao);
        Carro car = new Carro();
        car.abrirCarro();
        Comando carroFechar = new FecharCarro(car);
        Comando carroAbrir = new AbrirCarro(car);
        Controle controle = new Controle();    
        controle.setCommands(carroAbrir, carroFechar);
        controle.On();
        controle.Off();
        controle.refazUltimoBotaoPrecionado();    
    }    
}
