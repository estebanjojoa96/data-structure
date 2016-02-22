/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.simplestructures;

/**
 *
 * @author AULA1
 */
public class List {
    
    private Node head;
    
    public List(){
        head=null;
        
    }
    
    public void add (int d){
        
        Node n = new Node (d);
        
        if(head == null){
            head=n;
        }else{
            Node aux=head;
            while(aux.next != null){
               aux=aux.next; 
            }
            aux.next=n;
        }
    }
    public void Print (){
        
       Node aux = head;
       while (aux != null){
           System.out.print(" "+aux.data);
           aux=aux.next;
       }
        System.out.println("");
    } 
    
    public int count (){
        
        Node aux= head;
        int counter =0;
        while(aux != null){
            counter++;
            aux = aux.next;
        }
        return counter;
    } 
    
    public void PrintFirtsElement(){
        
        if( head != null){
            System.out.println(""+head.data);
            
        }else{
            System.out.println("-1");
        }
        
    }
    
    public void PrintLastElement(){
        
        
        if(head==null){
            System.out.println("-1");
        }else{
            
           Node aux = head;
           while(aux.next!=null){
               aux=aux.next;
           }
            System.out.println(" " + aux.data);
        }
        
    }
    
    public void RemoveLastElement(){
        
        Node aux = head, p=null;
        while (aux.next!= null){
            p=aux;
            aux=aux.next;
        }
        p.next=null;
    }
        
    public void RemoveFirstElement(){
        
        if(head==null){
            System.out.println("-1");
        }else{
           
           Node aux = head;
           head=aux.next;
   
        }
        
    }
    
    public int Remove(int i){
      
        
        if(head==null){
            System.out.println("-1");
        }else if(i==0){
            head = null;
        }
        Node aux = head , p= null;
        int counter = 0;
        
        for (;counter<i && aux !=null; counter++){
            p=aux;
            aux=aux.next;
        
    }
        
        if(aux != null){
            p.next= aux.next;
        }
        
     return aux.data;   
    }
}
