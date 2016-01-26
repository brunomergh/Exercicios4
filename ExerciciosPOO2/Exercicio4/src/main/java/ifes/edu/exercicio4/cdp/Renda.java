package ifes.edu.exercicio4.cdp;

/**
 *
 * @author 20131bsi0033
 */
public class Renda {
    public PEstrategia impostoDeRenda;

    public Renda() {
        impostoDeRenda = new Nivel1();
    }
    public void calculoDoImposto(double valor){
        if(valor <= 1710.78)
            this.impostoDeRenda = new Nivel1();
        else if(valor >= 1710.79 && valor <= 2563.91) 
            this.impostoDeRenda = new Nivel2();
        else if(valor >= 2563.92 && valor <= 3418.59)
            this.impostoDeRenda = new Nivel3();    
        else if(valor >= 3418.60 && valor <= 4271.59)
            this.impostoDeRenda = new Nivel4();    
        else if(valor > 4271.59)
            this.impostoDeRenda = new Nivel5();
        
        impostoDeRenda.ValorImposto(valor);
        
    }
    
}

