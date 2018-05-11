/**
 *
 * @author Kleber Junio
 */
public class No {
    
    //atributos
    private int valor;
    private No esquerdo;
    private No direito;
    private int nivel;
    
    public boolean noFolha(){
        if (direito == null && esquerdo == null) {
            return true;
        }
        return false;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //construtor
    public No(int valor) {
        this.valor = valor;
    }

    //getters e setters
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {    
        this.valor = valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }
    
    
}
