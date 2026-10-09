package ejercicio2.pkg3;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    int numero_multas = 0;
    int velocidadActual = 0;
    boolean automatico;
    tipoCom tipoCombustible;
    tipoA tipoAutomóvil;
    tipoColor color;

    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomóvil, int númeroPuertas, int cantidadAsientos, int velocidadMáxima,boolean automatico, tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.automatico = automatico;
        this.numero_multas = numero_multas;
    }    
    String getMarca() {
        return marca;
    }    
    int getModelo() {
        return modelo;
    }
    int getMotor() {
        return motor;
    }    
    boolean getAutomatico() {
        return automatico;
    }   
    
    int getNumero_multas(){
        return numero_multas;
    }
    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }    
    tipoA getTipoAutomóvil() {
        return tipoAutomóvil;
    }    
    int getNúmeroPuertas() {
        return númeroPuertas;
    }    
    int getCantidadAsientos() {
        return cantidadAsientos;
    }    
   int getVelocidadMáxima() {
        return velocidadMáxima;
    }
    tipoColor getColor() {
        return color;
    }
    int getVelocidadActual() {
        return velocidadActual;
    }    
    void setMarca(String marca) {
        this.marca = marca;
    }
    void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }   
    
    void setNumero_multas(int numero_multas){
        this.numero_multas = numero_multas;
    }
    void setModelo(int modelo) {
        this.modelo = modelo;
    }    
    void setMotor(int motor) {
        this.motor = motor;
    }
    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomóvil = tipoAutomóvil;
    }
    void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }
    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }
    void setColor(tipoColor color) {
        this.color = color;
    }  
    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    void acelerar(int incrementoVelocidad, int velocidadMáxima) {
        if (velocidadActual + incrementoVelocidad < velocidadMáxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
                if(velocidadActual>velocidadMáxima){
                    numero_multas = numero_multas + 1;
                }
        
        }         
        else {System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }
    void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) > 0) {velocidadActual = velocidadActual - decrementoVelocidad;
        }
        else { 
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    void frenar() {
        velocidadActual = 0;
    }
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    
    void determinar_si_tiene_multas(){
            if (numero_multas > 0) {
            }
            }

    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Automatico = " + automatico);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomóvil);
        System.out.println("Número de puertas = " + númeroPuertas);
        System.out.println("Cantidad de asientos = " +cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMáxima);
        System.out.println("Color = " + color);
    }
}
