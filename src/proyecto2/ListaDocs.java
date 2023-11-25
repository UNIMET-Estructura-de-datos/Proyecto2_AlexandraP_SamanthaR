/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;
//siempre comprobar si una lista esta vacia para cada metodo

/**
 *Esta clase representa una lista de documentos.
  Cada documento en la lista es representado por un nodo (NodoDoc)
 */
public class ListaDocs {

    private NodoDoc first;
    private NodoDoc last;
    private int size;

    public ListaDocs() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    

    public boolean isEmpty() {
        return first == null;
    }
/**
 *En este método se  insertar un nuevo nodo al final de la lista.
 También crea un nuevo nodo con los datos proporcionados y lo añade al final de la lista.
 Si la lista está vacía, el nuevo nodo se convierte en el primer y último nodo de la lista.
 
 * @param NombreD
 * @param tipoD
 * @param tamaño
 * @param priorityU 
 */
    public void InsertarFinal(String NombreD, String tipoD, int tamaño, String priorityU) {
        NodoDoc nuevo = new NodoDoc(NombreD, tipoD,tamaño, priorityU); //aqui estoy creando el nodo como tal, aun no lo inserto en la lista
        if (isEmpty()) {
            first = nuevo;
            last = nuevo;
        } else {
            NodoDoc aux = last;
            aux.setNext(nuevo); // al siguiente del lastnodo se le agrega el nuevo, y el last termina siendo igual al nuevo, ya que se convierte en el ultimo
            last = nuevo;
        }
        size += 1;
    }
 /**
  * Este método  se encarga de eliminar el último nodo de la lista.
    Si la lista está vacía, muestra un mensaje indicando que la lista está vacía.
    Si la lista no está vacía, recorre la lista hasta el final y elimina el último nodo.
  */
    public void deleteEnd(){
        if (isEmpty()){
            System.out.println("Su lista esta vacía");
        }else{
        NodoDoc paux = first;
        NodoDoc prev = paux;
        while (paux.getNext() != null){
            prev = paux;
            paux = paux.getNext();
            
        }
       prev.setNext(null);
       last = prev;
       size -=1;
    }}
    
/**
 *Este método se encarga de imprimir los nombres de los documentos en la lista.
 Si la lista no está vacía, recorre la lista e imprime el nombre de cada documento.
 Si la lista está vacía, muestra un mensaje indicando que la lista está vacía.
 */
    public void Print() {
        if (!isEmpty()) {
            NodoDoc aux = first;
            
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getNombreDoc()+ " ");
                aux = aux.getNext();
            }

        } else {
            System.out.println("La lista esta vacía");
        }
    }
/**
 * Este método  es para eliminar el primer nodo de la lista.
Si la lista no está vacía, elimina el primer nodo de la lista.
Si la lista está vacía, muestra un mensaje indicando que la lista está vacía.
 
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
 * Obtiene el primer nodoo de la lista.
   @return El primer nodo de la lista. 
 */ 
    public NodoDoc getFirst() {
        return first;
    }
/**
 * Establece el primer nodo de la lista.
 * @param first nodo a establecer.
 
 */
    public void setFirst(NodoDoc first) {
        this.first = first;
    }
/**
 * * Obtiene el último nodo de la lista.
   * @return El último nodo de la lista.
 */
    public NodoDoc getLast() {
        return last;
    }
/**
 * * Establece el último nodo de la lista.
   * @param last nodo a establecer.
 */
    public void setLast(NodoDoc last) {
        this.last = last;
    }
/**
 * Obtiene el tamaño de la lista.
 * @return El tamaño de la lista.
 */
    public int getSize() {
        return size;
    }

/**
 
Establece el tamaño de la lista.
@param size, tamaño de la lista , nro entero.
 */
    public void setSize(int size) {
        this.size = size;
    }
/**
 * Este método  se encarga de eliminar un nodo de la lista por su título.
Si el primer nodo de la lista tiene el título buscado, se elimina el primer nodo.
Si no, recorre la lista hasta encontrar un nodo con el título buscado y lo elimina.
@param titulo El título del documento a eliminar.
 * @param titulo 
 */
 public void delete(String titulo){
    NodoDoc aux = this.getFirst();
    if (aux.getNombreDoc().equals(titulo)){
        this.DeleteFirst();
    } else {
        while(aux.getNext() != null && !aux.getNext().getNombreDoc().equals(titulo)){
            aux = aux.getNext();
        }
        if(aux.getNext() != null){
            aux.setNext(aux.getNext().getNext());
        }
    }
}
   
/**
 * Este método se encarga de buscar un nodo en la lista por su título.
Si la lista está vacía, devuelve null.
Si el primer nodo de la lista tiene el título buscado, devuelve el primer nodo.
Si no, recorre la lista hasta encontrar un nodo con el título buscado o hasta llegar al final de la lista.
@param titulo El título del documento a buscar.
@return NodoDoc que contiene el documento con el título buscado, o null si el documento no se encuentra en la lista
 
 */         
   public NodoDoc search(String titulo){
    NodoDoc aux = this.getFirst();
    if (isEmpty()){
        return null;
    } 
    if (aux.getNombreDoc().equals(titulo)){
        return this.getFirst();
    }
    while(aux != null && !aux.getNombreDoc().equals(titulo)){
        aux = aux.getNext();
    }
    if (aux != null && aux.getNombreDoc().equals(titulo)) {
        return aux;
    } else {
        return null; // Devuelve null si el documento no se encuentra
    }
}
}
            
    

