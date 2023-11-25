/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import proyecto2.Interfaces.Ventana1;

/**
 * Clase principal del proyecto.
 * Crea un montículo binario, una tabla hash de usuarios registrados y un cronómetro.
 * Luego crea una nueva ventana y la hace visible.
 * @author Samantha Rojas, Alexandra Padrón.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    MontículoB mont=new MontículoB (0);
    HashTable UsuariosRegistrados = FuncionesTEMP.ReadCSV();
    Cronometro timer = new Cronometro(mont);
    Ventana1 ventana= new Ventana1(mont,UsuariosRegistrados,timer);
    ventana.setVisible(true);


   
    }
    
}
