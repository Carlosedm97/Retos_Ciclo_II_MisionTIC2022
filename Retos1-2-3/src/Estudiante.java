public class Estudiante {
    private String nombre;
    private int edad;
    private String programa;
    private String tipo_etnia;

    public Estudiante(String nom, int ed, String pro, String etnia) {
        this.nombre = nom;
        this.edad = ed;
        this.programa = pro;
        this.tipo_etnia = etnia;
    }
    
    @Override
    public String toString(){
        return "\n\tNombre: "+this.nombre+"\n\tEdad : "+this.edad+ " anios" + "\n\tPrograma: "+this.programa+"\n\tEtnia: "+this.tipo_etnia;
    }
}
