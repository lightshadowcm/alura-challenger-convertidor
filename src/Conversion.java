import java.util.Scanner;

public class Conversion {
    public static void conversiones(byte opc, ConsultarApi consulta, Scanner lectura){
        System.out.print("Ingrese el monto a convertir: ");

        var monto = lectura.nextDouble();

        String moneda ="";
        String convertir ="";

        switch (opc){
            case 1:
                moneda = "USD";
                convertir = "DOP";
                break;
            case 2:
                moneda = "DOP";
                convertir = "USD";
                break;
            case 3:
                moneda = "USD";
                convertir = "MXN";
                break;
            case 4:
                moneda = "MXN";
                convertir = "USD";
                break;
            case 5:
                moneda = "USD";
                convertir = "BRL";
                break;
            case 6:
                moneda = "BRL";
                convertir = "USD";
                break;
        }
        try{
            Monedas monedas6 = consulta.buscarModedas(moneda,convertir,monto);
            System.out.println("El valor: $" + monto + " " +monedas6.toString());
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finazilando aplicacion");
        }
    }
}
