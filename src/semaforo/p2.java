/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;
import java.util.concurrent.Semaphore;
/**
 *
 * @author estudiante
 */
public class p2 extends Thread
{
    protected Semaphore s1;
    protected Semaphore s2;
    public p2(Semaphore s1, Semaphore s2)
    {
        this.s1 = s1;
        this.s2 = s2;
    }
    
    public void run()
    {
        try
        {
            this.s1.acquire();
            this.s2.acquire();
        }catch(Exception e)
            {
                    e.printStackTrace();
            }
        try
        {
            sleep((int) Math.round(500*Math.random()-5));
        }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        System.out.println("p2");
    }
}
