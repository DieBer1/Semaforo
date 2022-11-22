/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class p1 extends Thread
{
    protected Semaphore s1;
    public p1(Semaphore s1)
    {
        this.s1 = s1;
    }
    
    public void run()
    {
        
        try {
            sleep((int) Math.round(500*Math.random()-5));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("p1");
        this.s1.release(2);  
    }  
}