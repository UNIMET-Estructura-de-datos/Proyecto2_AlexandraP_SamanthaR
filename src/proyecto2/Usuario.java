/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Samantha Rojas, Alexandra Padrón
 */
public class Usuario {
    private String name;
    //private int prioridad;
    private String tipo;
    private ListaDocs DocList;
    private Usuario next;
    

/**
 *  Constructor para crear un nuevo Usuario.
 * @param name El nombre del usuario.
 * @param tipo El tipo de usuario.
 */
    public Usuario(String name, String tipo) {
        this.name = name;
        this.tipo = tipo; //constructor de cero
        this.DocList = new ListaDocs();
        this.next = null;
    }
/**
 *  Método para obtener la lista de documentos del usuario.
 * @return La lista de documentos del usuario.
 */
    public ListaDocs getDocList() {
        return DocList;
    }
/**
 * Método para establecer la lista de documentos del usuario.
* @param DocList La nueva lista de documentos del usuario.
 */
    public void setDocList(ListaDocs DocList) {
        this.DocList = DocList;
    }
/**
 *  Método para obtener el siguiente Usuario.
 * @return El siguiente Usuario.
 */
    public Usuario getNext() {
        return next;
    }
/**
 * Método para establecer el siguiente Usuario.
 * @param next El nuevo siguiente Usuario.
 */
    public void setNext(Usuario next) {
        this.next = next;
    }
/**
 * Constructor para crear un Usuario vacío.
 */
    public Usuario() {
    }
/**
 * Método para obtener el nombre del usuario.
 * @return El nombre del usuario.
 
 */
    public String getName() {
        return name;
    }
/**
 * Método para establecer el nombre del usuario.
 * @param name El nuevo nombre del usuario. 
 */
    public void setName(String name) {
        this.name = name;
    }

/**
 * Método para obtener el tipo de usuario.
 * @return El tipo de usuario. 
 */  

    public String getTipo() {
        return tipo;
    }
/**
 *  Método para establecer el tipo de usuario.
 * @param tipo El nuevo tipo de usuario. 
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

}
