/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import javax.swing.JOptionPane;

/**
 *
 * @author Samantha
 */
public class HashTable {
        public ListaUsers[] usuarios;
        public int tamano;
        public int contador;
        
        public HashTable(){
            this.usuarios = new ListaUsers[99];
            this.tamano = 99;
            this.contador = 0;
            for (int i = 0; i < tamano; i++) {
                usuarios[i] = null;
            }
        }
/*
Esta función calcula un valor hash para una cadena de entrada.
El valor hash se calcula sumando el valor ASCII de cada carácter en la cadena,
más el producto de la posición del carácter y un valor constante.
Finalmente, el valor hash se toma módulo 98 antes de devolverlo.    
@param usuario La cadena de entrada para la cual calcular el valor hash.
*/

        public int hash(String usuario){
            int hash = 0;
            int pos = 17;
            for (int i = 0; i < usuario.length(); i++) {
                int h = (int) usuario.charAt(i);
                hash += h + pos*i;
            }
            
            return hash%98;
        }
 /**
  * Este método inserta un nuevo usuario en la tabla hash.
    Primero, calcula el índice hash para el usuario.
    Si el índice hash está vacío, crea una nueva lista de usuarios en ese índice y agrega el usuario a la lista.
    Si el índice hash ya contiene una lista de usuarios, verifica si el usuario ya existe en la lista.
    Si el usuario no existe en la lista, lo agrega al final de la lista.
    En ambos casos, incrementa el contador de usuarios.
  * @param user
  * @param tipos 
  */       
        public void insertar(String user, String tipos){
            int index = hash(user);
            if(this.usuarios[index] == null){
                this.usuarios[index] = new ListaUsers();
                this.usuarios[index].InsertarFinal(user, tipos);
                contador++;
            }else{
                if(this.usuarios[index].Buscar(user)== null){
                this.usuarios[index].InsertarFinal(user, tipos);
                contador++;}
}

            }
        
/**
 * Este método elimina un usuario de la tabla hash.
 Primero, calcula el índice hash para el usuario.
 Si el índice hash está vacío, muestra un mensaje indicando que no hay usuarios con ese nombre.
 Si el índice hash contiene una lista de usuarios, intenta eliminar el usuario de la lista.
 Si el usuario se elimina correctamente, decrementa el contador de usuarios y muestra un mensaje indicando que el usuario se eliminó correctamente.
 * @param user 
 */        
        public void eliminar(String user){
            int index = hash(user);
            if(this.usuarios[index] == null){
                JOptionPane.showMessageDialog(null, "No hay usuarios con ese nombre");
            }else{
                this.usuarios[index].delete(user);
                contador--;
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente!");
}
            }
 /**
  * Este método inserta un nuevo documento en la lista de documentos de un usuario en la tabla hash.
 Primero, calcula el índice hash para el usuario.
 Si el índice hash está vacío, muestra un mensaje indicando que no hay usuarios con ese nombre.
 Si el índice hash contiene una lista de usuarios, busca al usuario en la lista.
 Si el usuario existe, inserta el nuevo documento en la lista de documentos del usuario.
  * @param usuario
  * @param nombreDoc
  * @param TipoDOC
  * @param tamaño
  * @param Priority 
  */
        public void insertar_documento(String usuario, String nombreDoc, String TipoDOC, int tamaño,String Priority){
            int index = hash(usuario);
            if(this.usuarios[index] == null){
                System.out.println("No hay usuarios con ese nombre");
            }else{
                Usuario user = this.usuarios[index].Buscar(usuario);
                user.getDocList().InsertarFinal(nombreDoc, TipoDOC, tamaño, Priority);
}

        }
/**
 * Este método elimina un documento de la lista de documentos de un usuario en la tabla hash.
 Primero, calcula el índice hash para el usuario.
 Si el índice hash está vacío, muestra un mensaje indicando que no hay usuarios con ese nombre.
 Si el índice hash contiene una lista de usuarios, busca al usuario en la lista.
 Si el usuario existe, intenta eliminar el documento de la lista de documentos del usuario.

 * @param usuario
 * @param nombreDoc 
 */
        public void eliminar_documento(String usuario, String nombreDoc){
            int index = hash(usuario);
            if(this.usuarios[index] == null){
                System.out.println("No hay usuarios con ese nombre");
            }else{
                Usuario user = this.usuarios[index].Buscar(usuario);
                user.getDocList().delete(nombreDoc);
}
        }
/**
 *  Este método busca un documento en la lista de documentos de un usuario en la tabla hash.
 Primero, calcula el índice hash para el usuario.
 Si el índice hash está vacío, muestra un mensaje indicando que no hay usuarios con ese nombre y devuelve null.
 Si el índice hash contiene una lista de usuarios, busca al usuario en la lista.
 Si el usuario existe, busca el documento en la lista de documentos del usuario y lo devuelve. 

 * @param usuario
 * @param titulo
 * @return 
 */
        public NodoDoc buscar_doc(String usuario, String titulo){
            int index = hash(usuario);
            if(this.usuarios[index] == null){
                System.out.println("No hay usuarios con ese nombre");
                return null;
            }else{
                Usuario user = this.usuarios[index].Buscar(usuario);
                NodoDoc doc = user.getDocList().search(titulo);
                
                return doc;
}
        }
        
        
/**
 *Este método verifica si un usuario existe en la tabla hash.
 Primero, calcula el índice hash para el usuario.
 Si el índice hash está vacío, muestra un mensaje indicando que no hay usuarios con ese nombre y devuelve false.
 Si el índice hash contiene una lista de usuarios, verifica si el usuario existe en la lista y devuelve el resultado
 * @param Usuario
 * @return 
 */       
        public boolean containsHT (String Usuario){
             int index = hash(Usuario);
             if(this.usuarios[index] == null){
                
                return false;
            }else{
                return this.usuarios[index].Contains(Usuario);
          
                
}
        
        
        }
/**
 * Este método busca un usuario en la tabla hash.
 Primero, calcula el índice hash para el usuario.
 Si el índice hash está vacío, muestra un mensaje indicando que no hay usuarios con ese nombre y devuelve null.
 Si el índice hash contiene una lista de usuarios, busca al usuario en la lista y lo devuelve.
 * @param NameUser
 * @return 
 */
        
        public Usuario buscar_User (String NameUser){
            int index = hash(NameUser);
            if(this.usuarios[index] == null){
                System.out.println("No hay usuarios con ese nombre");
                return null;
            }else{
                return this.usuarios[index].Buscar(NameUser);
        }
       
        
        }
/**
 * Este método recorre la tabla hash y devuelve una cadena que representa a todos los usuarios en la tabla.
 Para cada índice en la tabla hash, si el índice no está vacío, 
 * llama al método mostrar del objeto usuarios en ese índice y agrega el resultado a la cadena de salida.
 * @param most
 * @return 
 */
    public String mostrar(String most){
        for (int i = 0; i < this.tamano; i++) {
            if (this.usuarios[i]!= null){
                most =this.usuarios[i].mostrar(most);
            }
        }
        return most;
    }


}

