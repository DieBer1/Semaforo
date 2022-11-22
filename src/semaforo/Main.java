/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;
import java.util.concurrent.Semaphore;
import semaforo.p1;
/**
 *
 * @author estudiante
 */
public class Main 
{
    public static void main(String [] args)
    {
       Semaphore s1 = new Semaphore(0,true);
       Semaphore s2 = new Semaphore(2,true);
        
       (new Thread(new p1(s1))).start();
       (new Thread(new p2(s1,s2))).start();
       (new Thread(new p3(s1))).start();
       (new Thread(new p4(s1,s2))).start();
    }
}
