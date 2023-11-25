/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *Esta clase contiene funciones temporales  para la manipulación de datos.
 * @author SamanthaR
 */
public class FuncionesTEMP {
/**
 * Este método  se encarga de leer los datos de un archivo CSV los cargar en una tabla hash.
    Si el archivo no existe, se crea un nuevo archivo y se devuelve una nueva tabla hash vacía.
    Si el archivo existe, se leen los datos y se cargan en la tabla hash.
 * @return HashTable que contiene los datos leídos del archivo CSV.
 */
    public static HashTable ReadCSV(){
        String line;
        String Path = "test\\Data.csv";
        boolean isUt = false;
        String Usuarios= "";
        File file = new File(Path);
        
        try{
            if (!file.exists()){
                file.createNewFile();
                return new HashTable();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        if (line.equals("usuario, tipo")){
                            isUt = true;
                            continue;
                        }
                        if (isUt){
                            Usuarios += line +"\n";
                            
                        }
                     
                    }}
           JOptionPane.showMessageDialog(null, "Lectura EXITOSA!");
            br.close();
            
            }}catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        HashTable table = new HashTable();
        if (!"".equals(Usuarios)){
           String []  UsersR = Usuarios.split("\n");
            for (int i = 0; i < UsersR.length; i++) {
                String [] Clientes_Tipo = UsersR[i].split(", ");
                table.insertar(Clientes_Tipo[0], Clientes_Tipo[1]);
            }
        
        }
            return table;
            }
/**
 * Este método  es usado para escribir los datos de una tabla hash en un archivo CSV.
 Si la tabla hash tiene al menos un elemento, se recorre y se escriben los datos de los usuarios en el archivo.
 @param usuariosR La tabla hash que contiene los datos de los usuarios a escribir en el archivo.
 */
        public static void WriteCSV(HashTable usuariosR){
            String Usuarios_Tipo = "usuario, tipo";
            if (usuariosR.contador>=1){
                
                for (int i = 0; i < usuariosR.tamano; i++) {
                    if (usuariosR.usuarios[i] != null){
                        Usuario aux =usuariosR.usuarios[i].getFirst();
                        while(aux!= null){
                                 Usuarios_Tipo +="\n" + aux.getName()+ ", " + aux.getTipo();
                                  aux = aux.getNext();
                        }
                    }
                    
                    
                    
                }
            }
            try{
            PrintWriter pw = new PrintWriter("test\\Data.csv"); 
            pw.print(Usuarios_Tipo);
            pw.close(); // cerrar txt
            JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente! adios!");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            
            
        }
/**
 * En este método   se valida el nombre de usuario.
    Primero comprueba si el nombre de usuario está en blanco o contiene caracteres especiales no permitidos.
    Si el nombre de usuario es válido, devuelve verdadero. Si no es válido, muestra un mensaje de error y devuelve falso.
    @param nombreUsuario El nombre de usuario a validar.
    @return boolean Indica si el nombre de usuario es válido o no.
 */
         public static  boolean Validar (String nombreUsuario){
           
        if (nombreUsuario.isBlank() ||nombreUsuario.contains("@" ) || nombreUsuario.contains(" ") || nombreUsuario.contains("/")|| nombreUsuario.contains("-") || nombreUsuario.contains("*")) {
            JOptionPane.showMessageDialog(null,"Caracteres especiales no permitidos: @ ,/, - ,*\n Revise que no haya dejado ningun espacio");
             return false;
    
        
    }else{
            return true;
        }
}
         /**
 * En este método   se valida el tipo de documento
    Verifica que el tipo de doc  corresponda con los formatos permitidos para este programa
    
    @param formato el tipo de documento ingresado por el usuario
    @return boolean Si es válido, devuelve true. Si no es válido, muestra un mensaje de error y devuelve false.
 */
         public static boolean ValidarFormato(String formato){
             if(!(formato.equalsIgnoreCase("Pdf")||formato.equalsIgnoreCase("Docx")||formato.equalsIgnoreCase("OFORM")||(formato.equalsIgnoreCase("XLSX")||formato.equalsIgnoreCase("PPTX")||formato.equalsIgnoreCase("HTML")||formato.equalsIgnoreCase("ODT")))){
                 JOptionPane.showMessageDialog(null, "Formatos permitidos: Pdf,Docx,OFORM, XLSX,PPTX,HTML,ODT");
                 return false;
             }
             return true;
         }
  
      
    }

