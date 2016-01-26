package ifes.edu.exercicio1.util;

/**
 *
 * @author 20131bsi0033 
 */
public class EstadoComMoeda extends AbstractEstadoMaquina {

    EstadoComMoeda(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void puxaAlavanca() {
        this.maquina.setState("goma vendida");
        this.maquina.entregaGoma();
    }
    
    @Override
    public void poemMoeda(int moedas) {
        this.maquina.setState("sem moeda");
    }
    
   
    
}
