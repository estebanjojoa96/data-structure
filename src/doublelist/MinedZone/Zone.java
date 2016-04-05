/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist.MinedZone;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author deivyponal
 */
public class Zone extends JFrame {
    
    private Mine head,current;
    
    public Zone  (){
        
        setTitle("Mined zone");
        setSize(500,400);
        LaunchEvents();
        setVisible(true);
        head=current=null;
    }
    
    public void addMine(int x,int y){
        
        Mine n = new Mine(x,y,this);
        if(head== null){
            head=n;
        }else{
            Mine aux= head;
            while(aux.next!=null){
                aux=aux.next;
                aux.next=n;
                n.back=aux;
            }
            current =n;
        }
        
        
    }
    
    public void goFoward(){
        
        if (current.next!= null){
            
        }
        
    }
    
    public void goBack(){
        
    }
    
    public void explode(){
        
    }
    
    public void paint(Graphics g){
        
    }
    
    public void LaunchEvents(){
        
    }
    
    public static void main(String[] args){
        
    }
}
