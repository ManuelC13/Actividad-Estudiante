import java.util.ArrayList;

public class ControladorAsignatura{
    ArrayList <Asignatura> asigList;
    VistaAsignatura vista;
    Asignatura obj1;
    
    ControladorAsignatura(VistaAsignatura vista){
         asigList =  new ArrayList<Asignatura>();
         this.vista=vista;
         
    }

    public void addAsignatura(){
        obj1 = new Asignatura(vista.SolicitarNombreAsig(),vista.solicitarClave(),vista.SolicitarCreditos(), vista.SolicitarSemestre(), vista.SolicitarNivelForm());
        asigList.add(obj1); 
    }

    public ArrayList<Asignatura> obtenerAsignaturas(){
        return asigList;
    }
//aqui llego
    public Asignatura obtenerAsignatura(String nombre){
         Integer indiceAsig=buscarAsig(nombre);
         if (indiceAsig != -1) {
            return asigList.get(indiceAsig);
           } else {
            return null;
          }
    }


    public boolean borrarAsignatura(String clave){ 

        Integer indiceAsig=buscarAsig(clave);
        if (indiceAsig != -1) {
            asigList.remove((int)indiceAsig);
            return true;
        } else {
            return false;
        }
}


   private Integer buscarAsig(String clave){
    for (int i = 0; i < asigList.size(); i++) {
        if (clave == asigList.get(i).getClave()) {            
            return i;
        }
    }
    return -1;  ///si no hay asignatura
   }

   public boolean modificarNombreAsig(String clave){
        Integer indiceAsig=buscarAsig(clave);
        if (indiceAsig != -1) {
          vista.imprimirNombreAsig(asigList.get(indiceAsig).getNombre());
          asigList.get(indiceAsig).setNombre(vista.SolicitarNombreAsig());            
           return true;
        } else {
           return false;
        }
   }

   public boolean modificarCreditos(String clave){
    Integer indiceAsig=buscarAsig(clave);
    if (indiceAsig != -1) {
      vista.imprimirCreditos(asigList.get(indiceAsig).getCreditos());
      asigList.get(indiceAsig).setCreditos(indiceAsig);            
       return true;
    } else {
       return false;
    }
}

public boolean modificarSemestreAsig(String clave){
    Integer indiceAsig=buscarAsig(clave);
    if (indiceAsig != -1) {
      vista.imprimirSemestre(asigList.get(indiceAsig).getSemestre());
      asigList.get(indiceAsig).setSemestre(vista.SolicitarSemestre());            
       return true;
    } else {
       return false;
    }
}


    public void MenuAsignatura(){

        Integer opcion=0,aux=0;

        while (opcion != 6) {
             switch (vista.Menu()) {
                 case 1:
                     addAsignatura();
                     break;
                 case 2:
                     aux = vista.pedirClave();
                     vista.imprimeInfodeBorrado(borrarAsignatura(null));
                     break;  
                 case 3:
                      MenuModificarAsig(); 
                      break;
                 case 4:
                      vista.imprimirInfoTotal(asigList); 
                      break;
                 case 5:
                      aux = vista.pedirClave();
                      vista.imprimirInfoAsig(obtenerAsignatura(null));
                      break;     
                 case 6:
                     opcion = 6;
                     break;
             }
         }
    }

   private void MenuModificarAsig(){
            Integer opcion=0,aux=0;

            while (opcion != 4) {
                 switch (vista.MenuModificarAsig()) {
                     case 1:
                         aux = vista.pedirClave();
                         vista.imprimeInfoActualizacion(modificarNombreAsig(null));
                         break;
                     case 2:
                         aux = vista.pedirClave(); 
                         vista.imprimeInfoActualizacion(modificarCreditos(null));
                        break;
                     case 3:
                         aux = vista.pedirClave(); 
                         vista.imprimeInfoActualizacion(modificarSemestreAsig(null));
                         break;    
                     case 4:
                         opcion = 4;
                         break;
                 }
            }
  } 

}
