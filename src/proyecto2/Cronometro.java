/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;



import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *Esta clase representa un cronómetro
 * 
 */
public class Cronometro implements Runnable {
    
    private int segundos;
    private boolean corriendo;
    private boolean pausado;
    private MontículoB mont;
    
    
    public Cronometro(MontículoB montl) {
        this.segundos = 0;
        this.corriendo = true;
        this.pausado = false;
        this.mont = mont;

        
    }

    public int getSegundos() {
        return segundos;
    }


    @Override
/**
 * En este método se ejecuta cuando se inicia el hilo del cronómetro.
 Se cuenta los segundos transcurridos y realiza acciones cada 1800 segundos (30 minutos).
 Si el cronómetro está pausado, no incrementa los segundos.
 Si el montículo no está vacío después de 150 segundos (2min y medio), elimina el mínimo (libera la impresora) y muestra un mensaje.
 */
    public void run() {
        while (corriendo) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!pausado) {
                segundos++;
                //System.out.println("Cronómetro: " + segundos + " segundos");
               
                if (segundos % 150 ==0 && !mont.isEmpty()){
                    NodoDoc doc_liberado = mont.DeleteMin(); // liberar impresora
                    JOptionPane.showMessageDialog(null, "IMPRESION COMPLETADO --> "+"Doc: " + doc_liberado.getNombreDoc()  );
                    doc_liberado.setColadeImpr(false);
                }
            }
        }
    }
/**
 * Este método se encarga de detener el cronómetro
 */
    public void detener() {
        this.corriendo = false;
    }
/**
 * Este método se encarga de paisar el cronómetro.
 */
    public void pausar() {
        this.pausado = true;
    }
/**
 * Este método se encarga de reanudar el cronómetro
 */
    public void reanudar() {
        this.pausado = false;
    }
}

   
    
    
    

