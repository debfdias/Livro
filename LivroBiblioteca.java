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
public class LivroBiblioteca extends Livro {
    
    private int qtd;
    private String secao;
    private boolean locado;
    
    public LivroBiblioteca( int qtd, boolean locado ) {
        super();
        this.qtd = qtd;
        this.secao = secao;
        this.locado = locado;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getSecao() {
        return this.secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public boolean isLocado() {
        return this.locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }
    
}
