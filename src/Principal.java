/**
 * @author Kleber Junio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();
        
        arvore.insereValor(arvore.getRaiz(), 15);
        arvore.insereValor(arvore.getRaiz(), 12);
        arvore.insereValor(arvore.getRaiz(), 17);
        arvore.insereValor(arvore.getRaiz(), 16);
        arvore.insereValor(arvore.getRaiz(), 9);
        arvore.insereValor(arvore.getRaiz(), 10);
        
        arvore.calculaNivelNos(arvore.getRaiz(), 0);
        arvore.liberaMemoria(arvore.getRaiz());
        
        arvore.imprimeArvore(arvore.getRaiz());
        
    }
    
}
