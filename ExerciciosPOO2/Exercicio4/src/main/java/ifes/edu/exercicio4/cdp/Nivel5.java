package ifes.edu.exercicio4.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class Nivel5 implements PEstrategia {

    @Override
    public double ValorImposto(double valor) {
        System.out.println("Imposto a pagar " + valor * 0.275);
        return valor * 0.275;
    }
    
}
