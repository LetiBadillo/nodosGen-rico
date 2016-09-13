/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodosgenerico;

/**
 *
 * @author ASUS
 */
public class NodosGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        // TODO code application logic here
      linealListClass list = new linealListClass();
  
       list.insertFirst(20);
       list.insertFirst(15);
       list.insertFirst(16);
       list.insertLast("hola");
       list.insertFirst(16.25);
       list.insertLast("Leti");
       System.out.println("Lista inicial:");
       list.showList();
       System.out.println("\nBorrar primero:");
       list.deleteFirst();
       list.showList();
       System.out.println("\nBorrar elemento Leti:");
       list.delete("Leti");
       list.showList();
       System.out.println("\nBorrar último:");
       list.deleteLast();
       list.showList();
       
    }
    
    
}
