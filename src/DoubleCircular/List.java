/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleCircular;

/**
 *
 * @author deivyponal
 */
public class List {
    
    private Node head;
    
    public List(){
        head=null;
    }
    
    public void Push(int d){
        
        Node n = new Node (d);
        
        n.next=head.next;
        n.back=head.back;
        head.next.back=n;
        head.back.next=n;
        
        
    }
    
    
}
