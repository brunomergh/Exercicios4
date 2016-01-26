package ifes.edu.exercicio3.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class FecharPortao implements Comando {
     private Portao portao;

    public FecharPortao(Portao portao) {
        this.portao = portao;
    }

    @Override
    public void BotaoPrecionado() {
        portao.fecharPortao();
    }
    @Override
    public String toString() {
        return "Fechado";
    }
}
