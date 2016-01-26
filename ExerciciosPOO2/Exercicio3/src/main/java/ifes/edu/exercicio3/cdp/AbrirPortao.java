package ifes.edu.exercicio3.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class AbrirPortao implements Comando {
    private Portao portao;

    public AbrirPortao(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void BotaoPrecionado() {
        portao.abrirPortao();
    }
    
    @Override
    public String toString() {
        return "Aberto";
    }
    
}
