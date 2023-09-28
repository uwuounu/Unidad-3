package practica2.cajero_automatico;
import java.util.Scanner;
public class Practica2Cajero_Automatico {

    public static void main(String[] args) {
        Scanner leerConsulta = new Scanner(System.in);

        double saldo= 11588.66;
        
        
        System.out.println("CAJERO AUTOMATICO");
        System.out.println("Consultas disponibles:");      
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar Dinero");
        System.out.println("3. Retirar dinero");
        
        System.out.println("Ingresa el numero de la opcion que deseas realizar:");
        int opcion = leerConsulta.nextInt();
               
        switch (opcion){
          case 1:               
            System.out.println("Tu saldo es:$ "+saldo);
            break;
            
          case 2:
            System.out.println("Ingresa cantidad a depositar:");  
            double deposito = leerConsulta.nextDouble(); 
            double nuevoSaldo=saldo + deposito;
            System.out.println("Tu  nuevo saldo es: "+nuevoSaldo);
            break;  
            
         case 3:
            System.out.println("Ingresa la cantidad a retirar");
            double retiro = leerConsulta.nextDouble();
            if (saldo >= retiro){
            saldo -= retiro;        
            double cantidadRetirada=saldo - retiro;
            System.out.println("Retiro exitoso");
            System.out.println("Tu saldo actual es: $"+cantidadRetirada);
            }else{
            System.out.println("NO tienes suficiente saldo");
            
            }
            break;
            
         case 4:
           System.out.println("Opcion no validad");
           default:
           System.out.println("Ingresa una opción valida");}
        
           
    }
}   
        
   
    

