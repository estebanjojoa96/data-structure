/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist.MinedZone;

import java.awt.Graphics;

/**
 *
 * @author deivyponal
 */
public class Mine {
    
    protected int x,y;
    protected boolean state;
    protected Mine next,back;
    protected Zone z;
    
    public Mine (int posx,int posy,Zone zone){
        x= posx;
        y= posy;
        state=false;
        next=null;
        back=null;
        z= zone;
                
        
    }
    
    public void paint(Graphics g,boolean current){
        
        
        
    }
    
}
