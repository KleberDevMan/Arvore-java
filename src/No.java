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
    


    //construtor
    public No(int valor) {
        this.valor = valor;
    }

    //verifica se o No é No folha
    public boolean noFolha(){
        if (direito == null && esquerdo == null) {
            return true;
        }
        return false;
    }
    
    //metodo que é chamado quando o coletor recolhe um objeto instaciando a partir
    //dessa classe que nao esta sendo apontado por ninguem
    @Override
    protected void finalize() throws Throwable {
        System.out.println("LIBERADO");
    }

    //getters e setters
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
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
