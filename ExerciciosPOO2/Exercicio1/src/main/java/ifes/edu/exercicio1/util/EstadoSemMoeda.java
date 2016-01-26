package ifes.edu.exercicio1.util;

/**
 *
 * @author 20131bsi0033 
 */
public class EstadoSemMoeda extends AbstractEstadoMaquina {

    EstadoSemMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void poemMoeda(int moedas) {
        if(moedas == 1) {
            System.out.println("Moeda de 1 real inserida");
            this.maquina.setState("com moeda");            
        } else { 
            System.out.println("Aceitamos somente moeda de 1 real, BURRO!!!");
            
        }
        
    }

    @Override
    public void puxaAlavanca() {
        System.out.println("Ta puxando alavanca sem colocar moeda? acha que vai fazer milagre?");
    }

    
}
