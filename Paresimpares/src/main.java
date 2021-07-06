
import java.util.Scanner;


public class main {
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        int suma, i, numero;
        int pares = 0, impares = 0;
        
        System.out.print("Ingresa el numero: ");
        numero = entrada.nextInt();
        
        for(i = 0; i <= numero; i++){
            if( i % 2 == 0){
                pares = pares + i;
            }else{
                impares = impares + i;
            }
           
        }
        System.out.println("Suma de pares: " + pares);
        System.out.println("Suma de impares: " + impares);
        
        
    }
}
