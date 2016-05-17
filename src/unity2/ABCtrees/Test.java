/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.ABCtrees;

/**
 *
 * @author AULA1
 */
public class Test {
    
   
   public static void main (String args []){
      tree t = new tree();
       int values[] = {8,4,16,5,6,17,20,1,10,14,13,15};
       for (int i=0; i<values.length; i++){
           t.add(values[i]);
       }
       int v=13;
       System.out.print("Path to" + v + ":");
       t.printpath(v);
       
       if(t.isLeaf(v)){
           System.out.println("");
       }else{
           System.out.println("");
       }
       System.out.println("print tree");
       t.print();
       System.out.print("");
       
       t.Max();
       
       t.Min();
       //t.Printleafs();
       t.Count();
       System.out.println("recuersive print");
       
       t.recursivePrint();
       System.out.println("recursive count");
      int r = t.recursiveCount();
       System.out.println("Total nodes "+r);
       System.out.println("");
       
       System.out.println("Post Order Print");
       t.PostOrderPrint();
       System.out.println("Pre Order Print");
       t.PreOrderPrint();
       System.out.println("In Order Print");
       t.inOrderPrint();
       
       System.out.println("Print Leafs");
       t.PrintLeafsR();
       System.out.println("");
       System.out.println("HEIGHT");
       System.out.println(""+t.Height());
       System.out.println("");
       System.out.println("Draw Tree");
       t.Draw();
       
       System.out.println(""+ t.isComplete());
       
       System.out.println(""+ t.Exist(4));
       System.out.println("PRUEBA DE FALSO");
       System.out.println("");
       System.out.println(""+ t.Exist(50));
       //t.invert();
       //t.Prune();
       System.out.println("COUNT ODDS");
       System.out.println(t.CountOdds());
       System.out.println("COMPLETE");
       t.Complete();
       System.out.println("SON'S ALONE'S");
       t.PrintSonAlone();
       System.out.println("REVERSE PRINT");
       t.reversePrint();
       System.out.println("PRINT MISSINGS");
       t.PrintMissings();
   }
   
   
         
}
    

