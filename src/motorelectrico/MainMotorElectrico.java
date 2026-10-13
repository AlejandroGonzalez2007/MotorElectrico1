package motorelectrico;

public class MainMotorElectrico {
    static void main() {
        MotorElectrico motor1 = new MotorElectrico();

        motor1.encender();

        motor1.ajustarVelocidad(80);

        motor1.mostrarEstado();

        motor1.apagar();

        motor1.mostrarEstado();
    }
}
