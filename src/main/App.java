package main;
public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for (int i = 0; i < arrayOrdenado.length; i++) {
            if( num == arrayOrdenado[i]){
               return 1; 
            }
        }
        return  0;
    }
    
    public static int maior(int[] arrayDesordenado){
        int maximo = arrayDesordenado[0];
        for (int index = 0; index < arrayDesordenado.length; index++) {
            if(maximo < arrayDesordenado[index]){
                maximo = arrayDesordenado[index];
            }
        }
        return maximo;
    }
    

   public static Integer parMaisProximo(Integer[][] pares){
       return 1;
    }





 }

