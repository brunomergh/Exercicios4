package ifes.edu.exercicio4.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class Nivel4 implements PEstrategia {

    @Override
    public double ValorImposto(double valor) {
        System.out.println("Imposto a pagar " + valor * 0.225);
        return valor * 0.225;
    }
    
}
