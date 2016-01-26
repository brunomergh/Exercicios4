package ifes.edu.exercicio4.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class Nivel1 implements PEstrategia {

    @Override
    public double ValorImposto(double valor) {
        System.out.println("Isento!");
        return 0;
    }
   
}