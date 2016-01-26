package ifes.edu.exercicio5.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class SensorPessoa {
    private int qtd;
    private ArCondicionado ac;

    public SensorPessoa(ArCondicionado ac) {
        this.ac = ac;
    }
    
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
        ac.update();
    }
    
}
