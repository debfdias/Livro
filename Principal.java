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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Livro l1 = new LivroLivraria("Michael Jackson a magia e a locura", "Juliano Teles", 0304, 50, 1000);
        Livro l1 = new LivroLivraria(50, 1000);
       
      System.out.println(l1.getTitulo());
      System.out.println(l1.getCodigo());
      l1.setTitulo("Ricardo");
        System.out.println(l1.getTitulo());
       //l1.getPreco();
    
    }
    
}
