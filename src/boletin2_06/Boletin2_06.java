package boletin2_06;

import java.util.Scanner;

public class Boletin2_06 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        float ptarifa, ppagado, descuento;
        System.out.println("Introduce el precio original");
        ptarifa= teclado.nextFloat();
        System.out.println("Introduce el precio pagado");
        ppagado= teclado.nextFloat();
        descuento= 100-(100*(ppagado/ptarifa));
        System.out.println("Su descuento es de "+descuento+"%");
    }
    
}
