package motorelectrico;

public class MotorElectrico {
    private boolean estado;
    private int velocidad;

    public void setEstado(){
        this.estado=estado;
    }
    public void setVelocidad(){
        this.velocidad=velocidad;
    }

    public void encender() {
        estado = true;
    }

    public void apagar() {
        estado = false;
        velocidad = 0;
    }

    public void ajustarVelocidad(int nuevaVelocidad) {
        if (estado == true) {
            if (nuevaVelocidad >= 0 && nuevaVelocidad <= 100) {
                velocidad = nuevaVelocidad;
                System.out.println("Velocidad ajustada correctamente.");
            }
        }
    }

    public void mostrarEstado() {
        if (estado == true) {
            System.out.println("Estado: Encendido");
        } else {
            System.out.println("Estado: Apagado");
        }
        System.out.println("Velocidad: " + velocidad);
    }
}
