import java.util.Scanner;
public class Registro {
    private Estudiante[] estudiantes;
    private int limite;

    public Registro() {
        this.estudiantes = new Estudiante[100];
        this.limite=0;
    }
    
    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes[limite] = estudiante;
        this.limite++;
    }
    
    public void listarEstudiantes(){
        System.out.println("***Listado de estudiantes***");
        for(int i=0;i<limite;i++){
            System.out.println(this.estudiantes[i]);
        }
    }
    
    public int procesarComandos(String comando){
        String[] comandoArr = comando.split("&");
        int opcion = Integer.parseInt(comandoArr[0]);
        
        switch (opcion) {
            case 1:{
                    String estudiante = comandoArr[1];
                    String nombre = comandoArr[2];
                    int edad = Integer.parseInt(comandoArr[3]);
                    String programa = comandoArr[4];
                    String tipo_etnia = comandoArr[5];
                    String cantcre = (comandoArr[6]);
                    
                    if(estudiante.equals("Pregrado")){
                        Pregrado pregrado1 = new Pregrado(nombre, edad, programa, tipo_etnia, cantcre);
                        this.agregarEstudiante(pregrado1);
                    }
                    else{
                        String modalidad = comandoArr[6];
                        Posgrado posgrado1 = new Posgrado(nombre, edad, programa, tipo_etnia, modalidad);
                        this.agregarEstudiante(posgrado1);
                    }
            }
            break;
            case 2:{
            listarEstudiantes();
            }
            break;
            case 3:{
            break;
            }
        }
        return opcion;
    }
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        Registro registro = new Registro();
        int opcion; 
        do {
            System.out.println();
            String entrada = sc.nextLine();
            opcion = registro.procesarComandos(entrada);
        } while(opcion != 3);
    }    
}

