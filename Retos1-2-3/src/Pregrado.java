public class Pregrado extends Estudiante{
    public String cantidad_creditos;

    public Pregrado(String nom, int ed, String pro, String etnia, String cantcre){
    super(nom,ed,pro,etnia);
    this.cantidad_creditos = cantcre;
    }
    @Override
    public String toString(){
        String output = "\n\tEstudiante Pregrado " + super.toString() + "\n\tCreditos aprobados: " + cantidad_creditos;
        return output;
    }
}
