/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mihilo1;

/**
 *
 * @author hugo
 */
public class MiHilo1 implements Runnable{
   //metodo Thread poner en marcha
   public void run()
   {
       for(int i=0;i<10;i++)
       {   //método  getName(): devuelve  el  nombre  del Thread
           /*currentThread(): metodo estatico que mantiene referencia
             al hilo propio
           */
           int z=i+1;
           System.out.println("Comenzado: "+Thread.currentThread().getName()+","
                   + "i="+z); 
           //Un hilo esta temporalmenet en pausa mientras lo demas van trabajando 
          //Thread.yield();
       }   
       System.out.println("Termina thread " + Thread.currentThread().getName()); 
   }
   
}
