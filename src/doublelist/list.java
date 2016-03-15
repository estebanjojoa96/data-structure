/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

/**
 *
 * @author AULA1
 */
public class list {
    
    private Node head;
  
   public list() {
        head = null;
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
  
     public void print() {
          Node aux = head;
          while (aux != null) {
             System.out.print(" " + aux.data);
              aux = aux.next;
          }
         System.out.println();
  
      }
   public void ReversePrint(){
          if (head==null)return;
          Node aux = head;
         while(aux.next != null){
              aux = aux.next;
         }
          while ( aux.next!= null){
             System.out.println(" "+aux.data);
              aux=aux.back;
          }
      }
      public void Push(int d){
          Node n = new Node(d);
          if(head==null){
              head=n;
          }else{
              n.next=head;
              head.back=n;
              head=n;
         }
     
  }
public void RemoveFirst(){
       if(head==null)return;
             
       head=head.next;
       head.back=null;
       
          
       }

public void RemoveLast(){
    
    if(head==null)return;
    Node aux= head,p=head;
    while(aux.next!=null){
        aux=aux.next;
       
        while(p.next!=aux){
            p=p.next;
        }
        
    }
  p.next=null;
  aux.back=p;
            
}

public void Invert(){
    
    
    
}
        
                 
         
}
