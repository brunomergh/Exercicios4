package ifes.edu.exercicio3.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class AbrirCarro implements Comando {
    private Carro carro;
    public AbrirCarro(Carro carro) {
        this.carro = carro;
    }
    
    public void BotaoPrecionado() {
        carro.abrirCarro();
    }

    @Override
    public String toString() {
        return "Aberto";
    }
    
    
}
