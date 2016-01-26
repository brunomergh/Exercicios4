package ifes.edu.exercicio3.cdp;

/**
 *
 * @author 20131bsi0033
 */
public  class Controle {
    private Comando on, off;
    private static Comando ultimoBotaoPrecionado;
    
    public void setCommands(Comando on, Comando off) {
        this.on = on;
        this.off = off;
    }
    
    public void On() {
        on.BotaoPrecionado();
        Controle.ultimoBotaoPrecionado = on;
    }
    public void Off() {
        off.BotaoPrecionado();
        Controle.ultimoBotaoPrecionado = off;
    }
    
    public void refazUltimoBotaoPrecionado() {
        if(Controle.ultimoBotaoPrecionado != null)
            System.out.println("Ultimo comando " + Controle.ultimoBotaoPrecionado);
            Controle.ultimoBotaoPrecionado.BotaoPrecionado();
    }
    
    
    
}
