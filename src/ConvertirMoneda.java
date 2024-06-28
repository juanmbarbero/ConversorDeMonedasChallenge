import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta,
                                 Scanner lectura){
            double cantidad;
            double cantidadConvertida;

            Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para el dia de hoy es\n1"+monedaBase+ " = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Por favor ingrese la cantidad de "+ monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = " +cantidadConvertida + " " + monedas.target_code());
    }
    //Barbero, Juan Marcelo - Challenge Conversor Alura
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {
        System.out.println("Por favor ingrese el código de la moneda Base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa la moneda a la que desea convertir");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
