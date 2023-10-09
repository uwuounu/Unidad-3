package práctica3.fibonacci;
import java.util.Scanner;
public class Práctica3Fibonacci {

    public static void main(String[] args) {      
        
        int cero=0, uno=1, fibonacci;  //Variables
       
        System.out.println("***********  FIBONACCI ***********");
        
        Scanner lectura = new Scanner (System.in);       
        //Preguntamos cuantos numeros quiere ver
        System.out.println("¿Cuantos numeros deseas ver?");
        int numero = lectura.nextInt();
        lectura.close();
       
        System.out.println("Serie Fibonacci de "+numero+" numeros es:");              
       
        //Inicia Ciclo For
        for (int i = 1; i <= numero; i++) {
        System.out.println(cero);
        
        fibonacci = cero + uno;  //Valores que se mostrarán
        cero = uno;
        uno = fibonacci;
        }
    }
}

    
    

