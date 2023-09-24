public class ControlEscolar {
    public static void main(String[] args) {

    VistaEstudiante vistaEst = new VistaEstudiante();
     ControladorEstudiante Estudiantes = new ControladorEstudiante(vistaEst);
     Estudiantes.MenuEstudiante(); 

    VistaAsignatura vistaAsig = new VistaAsignatura();
     ControladorAsignatura Asignatura = new ControladorAsignatura(vistaAsig);
     Asignatura.MenuAsignatura(); 

    }
}