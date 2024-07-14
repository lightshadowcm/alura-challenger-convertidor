import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarApi consulta = new ConsultarApi();
        System.out.println("*******************************************");
        System.out.println("Bienvenido a tu conversor de confianza");


        byte opc = 0;
        do {
            menu();
            opc = lectura.nextByte();
            if(opc>=1 && opc <= 6){
                Conversion conversiones = new Conversion();

             Conversion.conversiones(opc,consulta,lectura);
            } else if (opc == 7) {
                System.out.println("**********************************");
                System.out.println("Saliendo del programa...");
            }else {
                System.out.println("**********************************");
                System.out.println("Opcion no valida, intente nuevamente.");
            }

        }while(opc != 7);
    }


    public static void menu(){
        System.out.println("**********************************");
        System.out.println("\n1) Dolar = Peso dominicano");
        System.out.println("2) Peso dominicano = Dolar");
        System.out.println("3) Dolar = Peso mexicano");
        System.out.println("4) Peso mexicano = Dolar");
        System.out.println("5) Dolar = Real brasileño");
        System.out.println("6) Real brasileño = Dolar");
        System.out.println("7) Salir");
        System.out.println("Elije la opcion que deseas: ");
        System.out.println("**********************************");
    }



}
