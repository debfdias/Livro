/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author jctv
 */
public class LivroLivraria extends Livro {
    
       protected int preco;
       protected int qtd;
        
       
     public LivroLivraria(int preco, int qtd) {
        super();
        this.preco = preco;
        this.qtd = qtd;
    }
    

    public int getPreco() {
        return this.preco;
    }
    
    public void setPreco(int preco) {
        this.preco = preco + 2;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
  
    

    
    
}

