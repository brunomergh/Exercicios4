package ifes.edu.exercicio3.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class FecharCarro implements Comando {
    private Carro carro;
    public FecharCarro(Carro carro) {
        this.carro = carro;
    }
    
    public void BotaoPrecionado() {
        carro.fecharCarro();
    }
    
    @Override
    public String toString() {
        return "Fechado";
    }
}
