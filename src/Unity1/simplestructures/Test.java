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
public class Test {
    
   public static void main (String [] args){
       List l = new List();
       l.add(5);
       l.add(10);
       l.add(15);
       l.add(25);
       l.add(30);
       l.add(40);
       
       
       System.out.println("Inicial valves");
       l.Print();
       int c = l.count();
       System.out.println("Total nodes:"+c);
       System.out.print("");
       
       System.out.println("first number");
       l.PrintFirtsElement();
       System.out.print("");
       System.out.println("last number");
       l.PrintLastElement();
       System.out.print("");
       System.out.println("remove last number");
       l.RemoveLastElement();
       l.Print();
       System.out.print("");
       System.out.println("remove first number");
       l.RemoveFirstElement();
       l.Print();
       System.out.print("");
       System.out.println("number that will be remove");
       System.out.println(l.Remove(1));
       System.out.println("List modificade");
       l.Print();
       System.out.println("Duplicating");
       l.Duplicate();
       System.out.println("Valves after duplication");
       l.Print();
       System.out.print("");
       System.out.println("Mirror Duplication");
       l.DuplicateMirror();
       System.out.println("Valves after mirror duplication");
       l.Print();
       System.out.println("list initial");
       l.Print();
       l.InsertZeros();
       System.out.println("List Zeros");
       l.Print();
       System.out.print("");
       System.out.println("List initial");
       l.Print();
       System.out.println("Count odds");
       
       int r = l.CountOdds();
       System.out.println(""+ r);
       
       
       
       
   }
   
   
      
     
       
   
}
