package ifes.edu.exercicio1.util;

/**
 *
 * @author 20131bsi0033 
 */
public class EstadoGomaVendida extends AbstractEstadoMaquina {
    
    public EstadoGomaVendida(Maquina maquina) {
        super(maquina);
    }
    
    @Override
    public void poemMoeda(int moedas) {
        if(this.maquina.goma > 0) {
            System.out.println("Pegue o chiclete e vaza!");
            this.maquina.setState("sem moeda");
        } else {
            System.out.println("Sem chiclete, volte outro dia!");
            this.maquina.setState("sem goma");
                    
        }
    }

    @Override
    public void puxaAlavanca() {
    }

    
}
