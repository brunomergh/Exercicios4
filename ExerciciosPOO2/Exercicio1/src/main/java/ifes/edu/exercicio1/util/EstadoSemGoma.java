package ifes.edu.exercicio1.util;

/**
 *
 * @author 20131bsi0033 
 */
public class EstadoSemGoma extends AbstractEstadoMaquina{

    EstadoSemGoma(Maquina maquina) {
        super(maquina);
    }

    @Override
    public void puxaAlavanca() {
        System.out.println("Sem chiclete, volte outro dia!");
    }

    @Override
    public void poemMoeda(int moedas) {
        System.out.println("Sem chiclete, volte outro dia!");
    }
    
}
