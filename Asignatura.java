public class Asignatura {
    //atributos
    private String nombre;
    private String clave;
    private Integer creditos;
    private String semestre;
    private String nivelForm;

    
   //métodos
   Asignatura(){}

   Asignatura(String nombre, String clave, Integer creditos, String semestre, String nivelForm){
      setNombre(nombre);
      setClave(clave);
      setCreditos(creditos);
      setSemestre(semestre);
      setNivelForm(nivelForm);
   }
 

   ///setter y getter
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }

   public String getNombre() {
       return nombre;
   }

   public void setClave(String clave) {
       this.clave = clave;
   }

   public String getClave() {
       return clave;
   }

   public void setCreditos(Integer creditos) {
       this.creditos = creditos;
   }

   public Integer getCreditos() {
       return creditos;
   }

   public void setSemestre(String semestre) {
       this.semestre = semestre;
   }

   public String getSemestre() {
       return semestre;
   }

   public void setNivelForm(String nivelForm) {
       this.nivelForm = nivelForm;
   }

   public String getNivelForm() {
       return nivelForm;
   }

  @Override
  public String toString() {
      return "Nombre " + getNombre() + "\n" + " Clave: "+getClave()+ "\n" + " Creditos " +  getCreditos() + "\n" + " Semestre: "+getSemestre() + "\n" + " Nivel de formacion: "+getNivelForm();
  }


}