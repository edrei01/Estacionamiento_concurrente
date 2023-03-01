package estacionamiento;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.concurrent.Semaphore;


public class Recurso{
    Semaphore semA;
    Label contEspera;
    Rectangle r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,index;
    Lugares l;
    int contador = 0;

    
    public void cajon(Rectangle r1, Rectangle r2, Rectangle r3, Rectangle r4, Rectangle r5, Rectangle r6, Rectangle r7, Rectangle r8, Rectangle r9, Rectangle r10, Rectangle r11, Rectangle r12, Rectangle r13, Rectangle r14, Rectangle r15, Rectangle r16, Rectangle r17, Rectangle r18, Rectangle r19, Rectangle r20, Rectangle index, Label contEspera, Semaphore semA, int dir, Lugares l) throws InterruptedException{
        semA.acquire();
        index.setFill(Color.GREEN);
        l.push(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, index);
        semA.release();
    }
    
    
}
