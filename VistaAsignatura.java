import java.util.ArrayList;
import java.util.Scanner;

public class VistaAsignatura{
    private  Scanner lectura;
    
    public Integer Menu(){

        lectura= new Scanner(System.in);
 
        System.out.println("Menú");
        System.out.println("1-Agregar asignatura");
        System.out.println("2-Eliminar asignatura");
        System.out.println("3-Modificar asignatura");
        System.out.println("4-Desplegar Lista");
        System.out.println("5-Desplegar asignatura");
        System.out.println("6-Salir");
        System.out.print("Opción :");
        return lectura.nextInt();
     }
 
     public Integer pedirClave(){
         
         lectura = new Scanner(System.in);
         System.out.println("Clave de asignatura: ");
         return lectura.nextInt();
 
     }

     public Integer MenuModificarAsig(){

        lectura= new Scanner(System.in);
 
        System.out.println("Menú-Modificación");
        System.out.println("1-Nombre asignatura");
        System.out.println("2-Clave de asignatura");
        System.out.println("3-Cantidad de creditos");
        System.out.println("4-Semestre al que pertenece");
        System.out.println("5-Nivel de formacion");
        System.out.println("6-Salir");
        System.out.print("Opción :");
        return lectura.nextInt();
     }

     public void MsgNoRegistro(){ 
         System.out.println("No se encuentra la asignatura");  
           }

    public void MsgEliminacionExitosa(){
        System.out.println("Asignatura eliminada correctamente");  
    }       

    public void MsgModificacionExitosa(){
        System.out.println("Modificación existosa");  
    }

    public String SolicitarNombreAsig(){
        System.out.println("Escribe nombre de la asignatura: ");  
       lectura= new Scanner(System.in);
       lectura.useDelimiter("\n");
       return lectura.next();
    } 

    public String solicitarClave(){
        System.out.println("Escribe la clave de la asignatura: ");  
       lectura= new Scanner(System.in);
       return lectura.next();
    }

    public Integer SolicitarCreditos(){
        System.out.println("Escribe los creditos que otorga: ");  
        lectura= new Scanner(System.in);
        return lectura.nextInt();
    } 

    public String SolicitarSemestre(){
        System.out.println("Escribe el semestre de la asignatura: ");  
        lectura= new Scanner(System.in);
        return lectura.next();
    } 

     public String SolicitarNivelForm(){
        System.out.println("Escribe el nivel de formacion al que pertenece: ");  
        lectura= new Scanner(System.in);
        return lectura.next();
    } 


    public void imprimirNombreAsig(String nombre){
       System.out.println("Nombre de la asignatura " + nombre);
   }

   public void imprimirClave(String clave){
       System.out.println("Clave de asignatura " + clave);
    }

    public void imprimirCreditos(int creditos){
       System.out.println("Creditos que otorga: " + creditos);
   }

   public void imprimirSemestre(String semestre){
       System.out.println("Semestre a la que pertenece: " + semestre);
   }

   public void imprimirNivelForm(String nivelForm){
       System.out.println("Nivel de formacion: " + nivelForm);
   }

   public void MsgError()
   {
       System.out.println("Error");
   }

   public void imprimirInfoAsig(Asignatura obj1)
   {
      if (obj1 != null) {
         System.out.println("El nombre de la asignatura es  " + obj1.getNombre());
         System.out.println("La clave de la asignatura es  " + obj1.getClave());
         System.out.println("Los creditos que otorga son  " + obj1.getCreditos());
         System.out.println("Pertenece al semestre  " + obj1.getSemestre());
         System.out.println("Pertenece al nivel de formacion  " + obj1.getNivelForm());
         
         } 
      else
         {
            System.out.println("Error");
         }
   }

   public void imprimirInfoTotal(ArrayList<Asignatura> asignaturas)
   {
    asignaturas.forEach(System.out::println);
   }

   public void imprimeInfodeBorrado(boolean e){
       if (e) {
           MsgEliminacionExitosa();
       } else {
           MsgNoRegistro();
       }
   }

   public void imprimeInfoActualizacion(boolean e){
         if (e) {
            MsgModificacionExitosa();
        } else {
            MsgError();
        }

   }

}