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
public class Hilos {
    public static void main(String[] args) {
        MiHilo1 H1 =new MiHilo1();
        Thread h1 = new Thread(H1);
        //dar nombre por hilo
        h1.setName("Hilo1");
        
        MiHilo1 H2 =new MiHilo1();
        Thread h2 = new Thread(H2);
        //dar nombre por hilo
        h2.setName("Hilo2");
        
        MiHilo1 H3 =new MiHilo1();
        Thread h3 = new Thread(H3);
        //dar nombre por hilo
        h3.setName("Hilo3");
        
        
        h1.start();
        h2.start();
        h3.start();
    }
            
    
}
