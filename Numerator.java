import java.util.Scanner;
public class Numerator{
    public static void main(String[] args){
    
    }

    public static void Interfaz(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMERATOR 2");
        System.out.println("MAS NUMERATOR QUE NUNCA");
        System.out.println("Presione 1 para continuar");
        System.out.println("Presione 0 para salir");
        int inicio=scanner.nextInt();
        while(inicio!=1 && inicio!=0) {
            System.out.println("Ingrese un comando valido");
            inicio=scanner.nextInt();
        }
        if(inicio==1){
            //Función del Juego
        }else if(inicio==0){
            System.out.println("Saliendo de Numerator...");
        }
        scanner.close();
    }
}