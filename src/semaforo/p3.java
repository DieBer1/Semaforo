/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

/**
 *
 * @author estudiante
 */
import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class p3 extends Thread
{
    protected Semaphore s2;
    public p3(Semaphore s2)
    {
        this.s2 = s2;
    }
    
    public void run()
    {
        
        try {
            sleep((int) Math.round(500*Math.random()-5));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("p3");
        this.s2.release(2);
        
    }  
}
