package ejercicio2.pkg1;
/**
 *
 * @author santiagobaquero
 */
public class Persona {
    String nombre; // Atributo que identifica el nombre de una persona
    String apellido; // Atributo que identifica el apellido de una persona
    String númeroDocumentoIdentidad;/* Atributo que identifica el número de documento de identidad de una persona */
    int añoNacimiento; /* Atributo que identifica el año de nacimiento de una persona */ 
    String PaisNacimiento; //pais de nacimiento de una persona 
    char género; // genero de una persona
    
    //metodo constructor de una persona
    Persona(String nombre, String apellido, String númeroDocumentoIdentidad, int añoNacimiento, String PaisNacimiento, char género) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.PaisNacimiento = PaisNacimiento;
        this.género=género;
                
    }
    
    //Método que imprime en pantalla los datos de una persona
    
     void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de nacimiento = " + PaisNacimiento);
        System.out.println("género = " + género);
        System.out.println();
    }
}
