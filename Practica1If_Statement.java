package practica1.if_statement;
import java.util.Scanner; 
public class Practica1If_Statement {
    
    public static void main(String[] args) {

    System.out.println("INGRESA UN NUMERO Y TE DIGO SI ES PAR O IMPAR");
        
    Scanner leerNumero = new Scanner(System.in);
        System.out.println("Ingresalo aquí: ");
        int numero = leerNumero.nextInt();
        leerNumero.close();
        
        if (numero%2 == 0){
        System.out.println("Es un numero par");
    }else {
        System.out.println("Es un numero impar");
          }
    }
}
 
