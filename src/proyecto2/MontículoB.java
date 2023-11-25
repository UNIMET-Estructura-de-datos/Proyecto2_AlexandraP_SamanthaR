/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Samantha
 */

public class MontículoB {

    private NodoDoc[] heap;
    private int numElem;//Cantidad de elementos del Heap

    //Constructor para crear Heap vacio
/**
 * Constructor para crear Heap vacío.
 * @param maxsize El tamaño máximo del Heap.

 */
    public MontículoB(int maxsize) {
        this.numElem = 0;
        heap = new NodoDoc[maxsize];
    }
/**
* Constructor para crear Heap a partir de un arreglo de números.
* @param arr El arreglo de números.
 */
    public MontículoB(NodoDoc[] arr) {
        this.numElem = arr.length;
        //Se recibe el arreglo y se asigna al heap
        heap = arr;

    }
/**
 * Método para verificar si el Heap está vacío.
 * @return Verdadero si el Heap está vacío, falso en caso contrario.
 */
    public boolean isEmpty(){
        return numElem == 0;
    }
 /**
  * Método para obtener el Heap.
  * @return El Heap.
  */
    public NodoDoc[] getHeap() {
        return heap;
    }
/**
 * Método para establecer el Heap.
 * @param heap El nuevo Heap.
 */
    public void setHeap(NodoDoc[] heap) {
        this.heap = heap;
    }
/**
 * Método para obtener el número de elementos en el Heap.
 * @return El número de elementos en el Heap.
 */
    public int getNumElem() {
        return numElem;
    }
/**
* Método para establecer el número de elementos en el Heap.
* @param numElem El nuevo número de elementos en el Heap. 
 */
    public void setNumElem(int numElem) {
        this.numElem = numElem;
    }
/**
  * Método para insertar un nuevo nodo en el Heap.
  * @param dato El nuevo nodo a insertar.
 */
    public void insert(NodoDoc dato) {
        if (numElem == heap.length) {
            NodoDoc[] actual_lleno = heap;
            heap = new NodoDoc[(numElem +1 )* 2]; // aumenta la capacidad del arreglo
            for (int i = 0; i < numElem; i++) {
                heap[i] = actual_lleno[i];
            }
        }
    
    int posActual = numElem;
    //Se inserta el elemento en el arreglo
    heap[posActual] = dato ;
    //Incrementa el contador
    numElem++;
        
    while (heap[posActual].getEtiquetaTiempo()< heap[PosPadre(posActual)].getEtiquetaTiempo()) {         
                Intercambia(posActual, PosPadre(posActual));
    }
}
/**
 * Método para obtener el mínimo elemento del Heap.
 * @return El mínimo elemento del Heap. Si el Heap está vacío, retorna -1.
 */
public int getMin() {
         if (heap.length == 0) {
             return -1;}
        return heap[0].getEtiquetaTiempo();
    }
    
    //Elimina el menor elemento del Min-Heap y lo retorna
/**
 *Método para eliminar el menor elemento del Min-Heap y retornarlo.
 * @return El menor elemento del Min-Heap. Si el MinHeap está vacío, retorna null.

 */
public NodoDoc DeleteMin() {
        if (numElem == 0) {
            
            return null;
        } else {
        
        NodoDoc menor = heap[0];
        heap[0] = heap[numElem - 1];
        DownHeap(0);
        numElem--;
        return menor;
}
  
    }
/**
 * Método para mover el elemento en la posición dada hacia abajo en el Heap.
 * @param posmin La posición del elemento a mover hacia abajo.
 */    
    public void DownHeap (int posmin){
        boolean esMonticulo;
        int hijo;
        esMonticulo = false;
        while ((posmin < numElem / 2) && !esMonticulo) {
            // determina el índice del hijo menor
            if (PosHijoIzq(posmin) == (numElem - 1)) // único descendiente
            {
                hijo = PosHijoIzq(posmin);
            } else {
                if (heap[PosHijoIzq(posmin)].getEtiquetaTiempo()< (heap[PosHijoDer(posmin)].getEtiquetaTiempo())) { //Aqui tambien use como prioridad el tamaño
                    hijo = PosHijoIzq(posmin);
                } else {
                    hijo = PosHijoDer(posmin);
                }
            }
            // compara raiz con el menor de los hijos
            if (heap[hijo].getEtiquetaTiempo()<(heap[posmin]).getEtiquetaTiempo()) {
                Intercambia(posmin,hijo);
                posmin = hijo;
                /* continua por la rama de claves mínimas */
            } else {
                esMonticulo = true;
            }
        }
    }
    
   
    
/**
 * Método para intercambiar dos elementos en el Heap.
 * @param a La posición del primer elemento.
 * @param b La posición del segundo elemento.
 */
    private void Intercambia(int a, int b) {
        NodoDoc aux = heap[a];
        heap[a] = heap[b];
        heap[b] = aux;
    }
 /*
 * Método para mostrar el arreglo del Heap.
 */   
    public void showArray() {
        System.out.println("--Inicio--");
        for (int i = 0; i < numElem; i++) {
            System.out.print(heap[i].getNombreDoc() + "|");
        }
        System.out.println();
        System.out.println("--Fin--");
    }
/**
 * Método para imprimir el árbol del Heap.
 * @param str La cadena de texto donde se imprimirá el árbol.
 * @return La cadena de texto con el árbol impreso.
 */
    public String printTree(String str) {
        for (int i = 0; i < Math.ceil(numElem/2); i++) {
            try{
                str +=(" PADRE : " + heap[i].getNombreDoc());
            }catch(Exception e) {
                str+= "\n";
            }
            
            try{
                str += (" HIJO IZQ : " + heap[PosHijoIzq(i)].getNombreDoc());
            }catch(Exception e) {
                str +="\n";
            }
            
            try{
                str += (" HIJO DER :" + heap[PosHijoDer(i)].getNombreDoc());
            }catch(Exception e) {
                str += "\n";
            }
               
        }
        return str;
    }


 /**
  * Método para eliminar un documento del Heap.
  * @param doc El documento a eliminar.
  */       
    public void eliminar_doc(NodoDoc doc){
        NodoDoc min = this.DeleteMin();

        if (min !=null && (!min.getNombreDoc().equals(doc.getNombreDoc()) ||  min.getEtiquetaTiempo() != doc.getEtiquetaTiempo())){
            eliminar_doc(doc);  
            this.insert(min);
                }
                    
        }
                
/**
  * Método para mostrar el Heap.
    * @param str La cadena de texto donde se mostrará el Heap.
    * @return La cadena de texto con el Heap mostrado.

 */    
    public String mostrar(String str){
        
        NodoDoc doc = this.DeleteMin();
        if(doc != null){
            str+= doc.getNombreDoc() + "\n";
            str = mostrar(str);
            this.insert(doc);}
        return str;
    }   
    

    /**
 *Función que retorna la posición del padre de un elemento del montículo en específico.
 * Complejidad O(1)
 * @param i posición del elemento del cual se quiere ubicar el padre.
 * @return posición del padre
 */
public int PosPadre(int i)
{
return (i - 1)/ 2;
}
/**
 *Función que retorna la posición del hijo izquierdo de un elemento del montículo en específico.
 * Complejidad O(1)
 * @param i posición del elemento del cual se quiere ubicar el hijo izquierdo
 * @return posición del hijo izquierdo
 */
public int PosHijoIzq(int i)
{
return (2 * i + 1);
}
/**
 *Función que retorna la posición del hijo derecho de un elemento del montículo en específico.
 * Complejidad O(1)
 * @param i posición del elemento del cual se quiere ubicar el hijo derecho.
 * @return posición del hijo derecho
 */
public int PosHijoDer(int i){
return (2 * i + 1) + 1;
}
}
