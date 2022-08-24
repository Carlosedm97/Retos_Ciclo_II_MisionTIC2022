public class Posgrado extends Estudiante{
   public String modalidad;
   
   public Posgrado(String nom, int ed, String pro, String etnia, String mod){
   super(nom,ed,pro,etnia);
   this.modalidad = mod;
   }
   @Override
   public String toString(){
        String output = "\n\tEstudiante Posgrado" + super.toString() + "\n\tModalidad: " + modalidad;
        return output;
    }
}

