package ifes.edu.exercicio1.util;

/**
 *
 * @author 20131bsi0033 
 */
public abstract class AbstractEstadoMaquina implements EstadoMaquina {
    
    protected Maquina maquina;
    
    public AbstractEstadoMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
    
    
}
