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
public class linealListClass<T> {
    nodeClass first;
    nodeClass last;
    //Mètodos
    
    public void insertFirst(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            node.next=first;
            first=node;
        }
    }
     
    public void insertLast(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            last.next=node;
            last=node;            
        }
    }
    public boolean delete(T searchValue) {
    nodeClass aux = first;
    nodeClass prevNode = null;
    boolean d = false;
     while (aux != null) {
        if (aux.data == searchValue) {
            if (aux == first) {
                first = first.next;
            } else { 
                prevNode.next = aux.next;
            }
            
            d = true;
         } else {
            
             prevNode = aux;
         }
         aux = aux.next;
    }

    return d;
}
 public void deleteFirst() {
    nodeClass aux = first;
        if (aux != null) {
            first = first.next;
        }
}   
 
 public void deleteLast() {
    nodeClass actual = null;
    
    for (actual = this.first; actual.next.next != null;actual = actual.next) {
    }

    actual.next = null;
}
 
    public boolean isEmpty(){
        return first==null;
    }
    
    public void showList(){
        if(!isEmpty()){
           nodeClass aux;
           aux=first;
           while (aux!= null){
               System.out.println(aux.data);
               aux= aux.next;
               
           }
            
        }else{
            System.out.println("La lista está vacía.");
        }
    }
}
