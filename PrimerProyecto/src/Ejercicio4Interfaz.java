import javax.swing.*;

public class Ejercicio4Interfaz {
    public static void main(String[] args) {
        String añoActualS = JOptionPane.showInputDialog("Introduce el año actual");
        int añoActual = Integer.parseInt(añoActualS);
        String añoNacimientoS = JOptionPane.showInputDialog("Introduce el año de nacimiento");
        int añoNacimiento = Integer.parseInt(añoNacimientoS);
        JOptionPane.showMessageDialog(null,"Esta es la edad que tienes " + (añoActual-añoNacimiento));
    }
}
