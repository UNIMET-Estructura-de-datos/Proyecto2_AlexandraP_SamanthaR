/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

/**
 *
 * @author Samantha
 */
public class NodoDoc {
    private NodoDoc next;
    private String nombreDoc;
    private String TipoDOC;
    private String priorityU;
    private boolean ColadeImpr;
    private int tamaño ; 
    private int EtiquetaTiempo; //clave
/**
* Constructor para crear un nuevo NodoDoc.
* @param nombreDoc El nombre del documento.
* @param TipoDOC El tipo de documento.
* @param tamaño El tamaño del documento.
* @param priorityU La prioridad del usuario.
 
 */
    public NodoDoc( String nombreDoc, String TipoDOC, int tamaño,String priorityU) {
        this.next = null;
        this.nombreDoc = nombreDoc;
        this.TipoDOC = TipoDOC;
        this.tamaño = tamaño;
        this.priorityU = priorityU;
        this.EtiquetaTiempo =0;
        ColadeImpr = false;
    }
    /**
     * Método para establecer la prioridad final.
     * @param min El nodo mínimo.
     * @param DocSelected El documento seleccionado.
     * @param segundos Los segundos.
     */

    public void FinalPriority(NodoDoc min, NodoDoc DocSelected, int segundos ){
    if (DocSelected.priorityU.equals("prioridad_alta")){
        this.EtiquetaTiempo = min.getEtiquetaTiempo() - 1;
    }else if (DocSelected.priorityU.equals("prioridad_media")){
        this.EtiquetaTiempo = segundos / 2;
    }else if (DocSelected.priorityU.equals("prioridad_baja")){
        this.EtiquetaTiempo = segundos;
    }
    }
/**
 *  Método para verificar si está en la cola de impresión.
 * @return Verdadero si está en la cola de impresión, falso en caso contrario.
 */
    public boolean isColadeImpr() {
        return ColadeImpr;
    }
/**
 * Método para establecer si está en la cola de impresión.
 * @param ColadeImpr Verdadero si está en la cola de impresión, falso en caso contrario.
 */
    public void setColadeImpr(boolean ColadeImpr) {
        this.ColadeImpr = ColadeImpr;
    }
/**
 * Método para obtener el siguiente NodoDoc.
 * @return El siguiente NodoDoc.
 */
    public NodoDoc getNext() {
        return next;
    }
/**
 *  Método para establecer el siguiente NodoDoc.
 * @param next El nuevo siguiente NodoDoc.
 */
    public void setNext(NodoDoc next) {
        this.next = next;
    }
/**
 * Método para obtener el nombre del documento.
 * @return El nombre del documento.
 */
    public String getNombreDoc() {
        return nombreDoc;
    }
/**
 * Método para establecer el nombre del documento.
 * @param nombreDoc El nuevo nombre del documento.
 */
    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }
/**
 * Método para obtener el tipo de documento.
 * @return El tipo de documento.
 */
    public String getTipoDOC() {
        return TipoDOC;
    }
/**
 * Método para establecer el tipo de documento.
 * @param TipoDOC El nuevo tipo de documento.
 */
    public void setTipoDOC(String TipoDOC) {
        this.TipoDOC = TipoDOC;
    }
/**
 * Método para obtener el tamaño del documento.
 * @return El tamaño del documento
 */
    public int getTamaño() {
        return tamaño;
    }
/**
 * Método para establecer el tamaño del documento.
 * @param tamaño El nuevo tamaño del documento.
 */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
/**
 * Método para obtener la etiqueta de tiempo.
 * @return La etiqueta de tiempo.

 */
    public int getEtiquetaTiempo() {
        return EtiquetaTiempo;
    }
/**
 *  Método para establecer la etiqueta de tiempo.
 * @param EtiquetaTiempo La nueva etiqueta de tiempo.
 */
    public void setEtiquetaTiempo(int EtiquetaTiempo) {
        this.EtiquetaTiempo = EtiquetaTiempo;
    }
/**
 * Método para obtener la prioridad del usuario.
 * @return La prioridad del usuario.
 */
    public String getPriorityU() {
        return priorityU;
    }
/**
 * * Método para establecer la prioridad del usuario.
 * @param priorityU La nueva prioridad del usuario.
 */
    public void setPriorityU(String priorityU) {
        this.priorityU = priorityU;
    }
    
    
}
