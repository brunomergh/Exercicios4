package ifes.edu.exercicio3.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class Portao {
    private SituacaoPortao situacao;

    public Portao() {
        situacao = SituacaoPortao.OPEN;
        System.out.println("Fechado");
    }
    
    public void abrirPortao() {
        situacao = SituacaoPortao.CLOSE;
        System.out.println("Aberto");
    }
    public void fecharPortao() {
        situacao = SituacaoPortao.CLOSE;
        System.out.println("Fechado");
    }
    
}
