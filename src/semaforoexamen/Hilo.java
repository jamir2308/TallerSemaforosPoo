/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semaforoexamen;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JUAN
 */
public class Hilo extends Thread{
    
    @Override
    public void run(){
       
        esperar(3);
    }
    
    public void esperar(int seg){
         try {
            Thread.sleep(seg*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
