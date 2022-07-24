import java.util.ArrayList;
import java.util.Arrays;

public class Obra {
   public ArrayList<Integer> clases(ArrayList<Integer> categorias){
   ArrayList<Integer> unicos = new ArrayList<>();
   for (int elem:categorias){
       if(!unicos.contains(elem)){
           unicos.add(elem);
       }
   }
   return unicos;
   }
   
   public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obrasFaltantes, ArrayList<Integer> categorias, int categoria){
   ArrayList<Integer> obrasFaltan = new ArrayList<>();
   
   for(int elem:obrasFaltantes){
       if(categorias.get(elem).equals(categoria)){
       obrasFaltan.add(elem);
       }
   }
   return obrasFaltan;
   }
   
   public ArrayList<Integer> noTengo(ArrayList<Integer> listaA, ArrayList<Integer> listaB){
   ArrayList<Integer> listaC = new ArrayList<>();
   
   for(int elem:listaA){
       if(listaB.contains(elem)){
       }
       else{
       listaC.add(elem);
       }
   }
   return listaC;
   }
   
   public Integer puedoCambiar(ArrayList<Integer> museoA, ArrayList<Integer> museoB){
   Integer resultado1 = 0;
   Integer resultado2 = 0;
   Integer resultado3 = 0;
   
   for (int elem:museoA){
       if(museoB.contains(elem)){
       }
       else{
       resultado1++;
       }
    }
   for (int elem2:museoB){
       if(museoA.contains(elem2)){
       }
       else{
       resultado2++;
       }
    }
    if(resultado1<resultado2){
      resultado3 = resultado1;
    }
    else{
      resultado3 = resultado2;
    }
   return resultado3;
   }
}
