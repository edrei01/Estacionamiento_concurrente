
package estacionamiento;

import javafx.scene.shape.Rectangle;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Run extends Thread{
    Lugares l = new Lugares(20);
    Recurso r = new Recurso();
    Rectangle r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,index;
    
    Semaphore semA = new Semaphore(1);
    
    Run(Rectangle r1, Rectangle r2, Rectangle r3, Rectangle r4, Rectangle r5, Rectangle r6, Rectangle r7, Rectangle r8, Rectangle r9, Rectangle r10, Rectangle r11, Rectangle r12, Rectangle r13, Rectangle r14, Rectangle r15, Rectangle r16, Rectangle r17, Rectangle r18, Rectangle r19, Rectangle r20, Rectangle index) {
        this.r1=r1; this.r2=r2; this.r3=r3; this.r4=r4; this.r5=r5; this.r6=r6; this.r7=r7;
        this.r8=r8; this.r9=r9; this.r10=r10; this.r11=r11; this.r12=r12; this.r13=r13;
        this.r14=r14; this.r15=r15; this.r16=r16; this.r17=r17; this.r18=r18;
        this.r19=r19; this.r20=r20; this.index=index;
    }
    @Override
    public void run(){
        try {
            Thread.currentThread().sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int x=1; x<=100; x++){
            Auto a = new Auto(l, r1, r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,index, r, semA);
            a.start();
            try {
                Thread.currentThread().sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
