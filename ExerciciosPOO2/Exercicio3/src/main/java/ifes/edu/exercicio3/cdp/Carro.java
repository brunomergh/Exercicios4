package ifes.edu.exercicio3.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class Carro {
    private SituacaoCarro situacao;

    public Carro() {
        situacao = SituacaoCarro.CLOSE;
        System.out.println("Fechado");
    }
    
    public void abrirCarro() {
        situacao = SituacaoCarro.OPEN;
        System.out.println("Aberto");        
    }
    
    public void fecharCarro() {
        situacao = SituacaoCarro.CLOSE;
        System.out.println("Fechado");        
    }
    
    
    
    
    
}
