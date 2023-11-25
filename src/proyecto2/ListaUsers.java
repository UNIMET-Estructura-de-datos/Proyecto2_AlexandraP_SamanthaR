/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import javax.swing.JOptionPane;

/**
 *Esta clase representa una lista de usuarios.
 * Cada usuario en la lista es representado por un objeto Usuario.
 */
public class ListaUsers {
    private Usuario first;
    private Usuario last;
    private int size;

    public ListaUsers() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
/**
 * Método para obtener el primer usario de la lista 
 * @return el usario que está de primero en la lista.
 */
    public Usuario getFirst() {
        return first;
    }
/**
 * Método que establece  el primer usuario de la lista.
 * @param first el usuario que se establecerá en la lista.
 */
    public void setFirst(Usuario first) {
        this.first = first;
    }
/**
 * Método para obtener el último usuario de la lista.
 * @return Usuario que es el último usuario en la lista.
 */
    public Usuario getLast() {
        return last;
    }
/**
 *  Este método  establece el último usuario de la lista.
 * @param last El usuario que se establecerá como el último en la lista.
 */
    public void setLast(Usuario last) {
        this.last = last;
    }
/**
 * Método para obtener el tamaño de la lista.
 * @return int que es el tamaño de la lista (número de usuarios).
 */
    public int getSize() {
        return size;
    }
/**
 * Método para obtener el tamaño de la lista.
 * @param size 
 */
    public void setSize(int size) {
        this.size = size;
    }

    
/**
 * Método para comprobar si la lista está vacía.
 * @return boolean que indica si la lista está vacía (true) o no (false).
 */
    public boolean isEmpty() {
        return first == null;
    }
/**
 * Este método se usa para insertar un nuevo usuario al final de la lista.
 * También crea un nuevo usuario con los datos proporcionados y lo añade al final de la lista.
 * Si la lista está vacía, el nuevo usuario se convierte en el primer y último usuario de la lista.
 * @param Name El nombre del usuario.
 * @param tipo El tipo del usuario.
 */
    public void InsertarFinal(String Name ,String tipo) {
        Usuario nuevo = new Usuario(Name, tipo); //aqui estoy creando el nodo como tal, aun no lo inserto en la lista
        if (isEmpty()) {
            first = nuevo;
            last = nuevo;
        } else {
            Usuario aux = last;
            aux.setNext(nuevo); // al siguiente del lastnodo se le agrega el nuevo, y el last termina siendo igual al nuevo, ya que se convierte en el ultimo
            last = nuevo;
        }
        size += 1;
    }
/**
 * En este método  se  elimina el último usuario de la lista.
 * Si la lista está vacía, muestra un mensaje indicando que la lista está vacía.
 * Si la lista no está vacía, recorre la lista hasta el final y elimina el último usuario.
 */
    public void deleteEnd(){
        
        if(isEmpty()){
            System.out.println("Su lista esta vacía");
        }else{
        Usuario paux = first;
        Usuario prev = paux;
        while (paux.getNext() != null){
            prev = paux;
            paux = paux.getNext();
            
        }
       prev.setNext(null);
       last = prev;
       size -=1;
    }}
    
/**
 * Este método se encarga de  imprimir los nombres y tipos de los usuarios en la lista.
 * Si la lista no está vacía, recorre la lista e imprime el nombre y tipo de cada usuario.
 * Si la lista está vacía, muestra un mensaje indicando que la lista está vacía.
 */
    public void Print() {
        if (!isEmpty()) {
            Usuario aux = first;
            
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getName()+ " " +"TIPO: "+ aux.getTipo());
                aux = aux.getNext();
            }

        } else {
            System.out.println("La lista esta vacía");
        }
    }
/**
 * Método para eliminar el primer usuario de la lista.
 * Si la lista no está vacía, elimina el primer usuario de la lista.
 * Si la lista está vacía, muestra un mensaje indicando que la lista está vacía.
 */
    public void DeleteFirst() {
        if (!isEmpty()) {
            first = first.getNext();
            size -= 1;
        } else {
            System.out.println("La lista esta vacía");
        }
    }
/**
 * Este método se usa para verificar si un usuario está en la lista.
 * @param Usuario El nombre del usuario a buscar.
 * @return boolean que indica si el usuario está en la lista (true) o no (false).
 */
      public boolean Contains(String Usuario){
        if (isEmpty()){
            return false;
        }else{
          
            Usuario paux = first;
            for (int i = 0; i < size; i++) {
             
                if (paux.getName().equalsIgnoreCase(Usuario) ){
                    
                    return true;
                }
                paux = paux.getNext();
            }
        }
        
        return false;
    }
/**
 * Este método  es para buscar un usuario en la lista.
 * @param User El nombre del usuario a buscar.
 * @return Usuario que contiene los datos del usuario buscado, o null si el usuario no se encuentra en la lista.
 */      
        public Usuario Buscar(String User){
      if (isEmpty()){
          System.out.println("La lista esta vacía");
      
      }else{
          Usuario aux = first;
         
          for (int i = 0; i < size; i++) {
              if (aux.getName().equalsIgnoreCase(User) ){
                    
                    return aux;
                }
              aux = aux.getNext();
          }
    
      }
            System.out.println("usuario bien");
            return null;
      
                }
/**
 * Método para eliminar un usuario de la lista.
 * @param usuario El nombre del usuario a eliminar.
 */       
        public void delete(String usuario){
            Usuario aux = this.getFirst();
            if (aux.getName().equals(usuario)){
                this.DeleteFirst();
            }
               
            while(aux.getNext()!= null && !aux.getNext().getName().equals(usuario)){
                aux = aux.getNext();
            }
            if(aux.getNext() != null){
                aux.setNext(aux.getNext().getNext());
            }
        }
/**
 * * Método para mostrar los nombres de todos los usuarios en la lista.
 * @param most String inicial que se añadirá a la lista de nombres de usuario.
 * @return String que contiene los nombres de todos los usuarios en la lista.
 */
    public String mostrar(String most){
        Usuario usuario = this.first;
        while(usuario!= null){
            most+= usuario.getName() + "\n";
            usuario = usuario.getNext();
        }
        return most;
            
    }
    
}
