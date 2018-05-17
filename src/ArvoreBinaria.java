/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kleber Junio
 */
public class ArvoreBinaria {

    private No raiz = null;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
    
    //metodo que libera todos os Nos da arvore
    public void liberaMemoria(No raiz){
        
//        //se a arvore estiver vazia
//        if(raiz == null){
//            return;
//        }
//        
//        //se a arvore tiver apenas um No
//        if(this.raiz.noFolha()){
//            this.raiz = null;
//            return;
//        }
//
//        if(raiz.getEsquerdo() == null){
//            if (raiz.getDireito().noFolha()){
//                raiz.setDireito(null);
//                liberaMemoria(this.raiz);
//            }else{
//                liberaMemoria(raiz.getDireito());
//            }
//        }else{
//            if (raiz.getEsquerdo().noFolha()) {
//                raiz.setEsquerdo(null);
//                liberaMemoria(this.raiz);
//            }else{
//                liberaMemoria(raiz.getEsquerdo());
//            }
//        }
        
        //--------- ALGORITMO PROFESSOR ---------- //
        if (raiz == null || raiz.noFolha()) {
            return;
        }
        
        if (raiz.getDireito() != null){
            liberaMemoria(raiz.getDireito());
            raiz.setDireito(null);
        }
        
        if (raiz.getEsquerdo() != null) {
            liberaMemoria(raiz.getEsquerdo());
            raiz.setEsquerdo(null);
        }
        
        this.raiz = null;
    }

    //metodo que seta recursivamente o atributo nivel de cada no
    void calculaNivelNos(No raiz, int nivel){
        
        //quando chegar a um no folha retorna
        if (raiz == null) {
            return;
        }
        
        raiz.setNivel(nivel);
        
        calculaNivelNos(raiz.getDireito(), nivel+1);
        calculaNivelNos(raiz.getEsquerdo(), nivel+1);
    }
    //metodo que insere um valor na arvore binaria de forma ordenada
    public void insereValor(No raiz, int valor) {

        //se a arvore estiver vazia, inicializo a arvore
        if (this.raiz == null) {
            this.raiz = new No(valor);
            return;
        }

        //fazendo a ordenacao das insercoes
        if (valor > raiz.getValor()) {

            //se nao tiver lado direito, insere
            if (raiz.getDireito() == null) {
                raiz.setDireito(new No(valor));
                return;
            }

            //insere recursivamente
            insereValor(raiz.getDireito(), valor);

        } else {

            //se nao tiver lado direito, insere
            if (raiz.getEsquerdo() == null) {
                raiz.setEsquerdo(new No(valor));
                return;
            }

            //insere recursivamete
            insereValor(raiz.getEsquerdo(), valor);
        }

    }

    //metodo que exibe a arvore
    public void imprimeArvore(No raiz) {
        
        if (raiz == null) {
            return;
        }
        imprimeArvore(raiz.getEsquerdo());
        System.out.println("conteudo: "+raiz.getValor()+" - nivel "+raiz.getNivel());
        imprimeArvore(raiz.getDireito());
    }

}
