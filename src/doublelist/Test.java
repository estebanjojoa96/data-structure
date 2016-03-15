/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

import Unity1.simplestructures.List;

/**
 *
 * @author AULA1
 */
public class Test {
     public static void main (String [] args){
       list l = new list();
       l.add(5);
       
       l.add(10);
       
       l.add(15);
       
       l.add(25);
       
       l.add(30);
       
       l.add(40);   
       
         System.out.println("Remove First");
         System.out.println("List Initial");
         l.print();
         System.out.println("After remove first");
         l.RemoveFirst();
         l.print();
         System.out.println("Remove last");
         System.out.println("List initial");
         l.print();
         System.out.println("Last remove last");
         l.RemoveLast();
         l.print();
                     
     }
     
            
}