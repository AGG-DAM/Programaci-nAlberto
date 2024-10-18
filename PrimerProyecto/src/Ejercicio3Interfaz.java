import javax.swing.*;

public class Ejercicio3Interfaz {
    public static void main(String[] args) {
        String edadS = JOptionPane.showInputDialog("Introduce tu edad");
        int edad = Integer.parseInt(edadS);

        JOptionPane.showMessageDialog(null, "El año que viene tu edad sera "+ (edad+1));

    }
}
