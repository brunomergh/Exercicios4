package ifes.edu.exercicio1.util;

import java.util.HashMap;

/**
 *
 * @author 20131bsi0033 
 */
public class Maquina {
    public HashMap<String, EstadoMaquina> estados;
    public int goma;
    public EstadoMaquina estadoMaquina;
    

    public Maquina(int goma) {
        estados = new HashMap<>();
        estados.put("sem moeda", new EstadoSemMoeda(this));
        estados.put("com moeda", new EstadoComMoeda(this));
        estados.put("goma vendida", new EstadoGomaVendida(this));
        estados.put("sem goma", new EstadoSemGoma(this)); 
        this.setState("sem moeda");
        this.goma = goma;
                        
    }
    public EstadoMaquina getState(){
        return this.estadoMaquina;
    }
    public void setState(String estado) {
        this.estadoMaquina = estados.get(estado);
    }
    public void poemMoeda(int moeda) {
        this.estadoMaquina.poemMoeda(moeda);
    }
    public void puxaAlavanca() {
        this.estadoMaquina.puxaAlavanca();
    }
    public void entregaGoma() {        
        this.estadoMaquina.poemMoeda(0);
    }
    
    
          
}
