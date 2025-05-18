import java.util.Scanner;
public class Numerator{
    public static void main(String[] args){
    Interfaz();
    }

    public static void Interfaz() {
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
            Juego();
        }else if(inicio==0){
            System.out.println("Saliendo de Numerator...");
        }
        scanner.close();
    }
    public static void Juego(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivine el numero entre 0 y 50");
        int numero = (int)(Math.random() * 50);
        int adivinanza = scanner.nextInt();
        int intento=1;
        while(adivinanza!=numero&&intento!=5){
        if(numero<adivinanza){
            System.out.println("Muy grande!!!");
        }else if(numero>adivinanza){
            System.out.println("Muy poquito!!!!");
        }
        intento++;
        adivinanza=scanner.nextInt();
        }
        if(intento==5&&adivinanza!=numero){
            System.out.println("Perdio");
        //GameOver
        }else{
            fin();
        }
        scanner.close();
        }

public static void fin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("FELICIDADES, HAS GANADO!!!");
        System.out.println("dele al 1 para volver a jugar");
        System.err.println("dele al 0 para salir");
        int FinalEleccion= scanner.nextInt();
        if(FinalEleccion==1){
            Juego();
        }else if(FinalEleccion==0){
            System.out.println("se acabó el juego");
        }
scanner.close();
}
}