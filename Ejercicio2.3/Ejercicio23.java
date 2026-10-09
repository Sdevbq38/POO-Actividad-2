package ejercicio2.pkg3;
/**
 *
 * @author santiagobaquero
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, 3, tipoCom.DIESEL, tipoA.EJECUTIVO, 5, 6, 250, true, tipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        
        auto1.acelerar(20, 250);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
    }
    
}
