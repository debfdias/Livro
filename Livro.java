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
public abstract class  Livro {
     
    protected String titulo;
    protected String autor;
    protected int codigo;
        
//    public Livro(String titulo, String autor, int codigo) {
//        this.titulo = titulo;
//        this.autor = autor;
//        this.codigo = codigo;
//    }
//    
   public Livro() {} //construtor default
    
  

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


   

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getCodigo() {
        return this.codigo;
    }
    
    
}

