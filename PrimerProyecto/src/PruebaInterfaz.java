import javax.swing.*;

public class PruebaInterfaz {
    public static void main(String[] args) {
        String edadS = JOptionPane.showInputDialog("Introduce tu edad");
        int edad = Integer.parseInt(edadS);
        String respuesta = edad >= 18 ? "Usted es mayor de edad" :
                "Usted es menor de edad";
        JOptionPane.showMessageDialog(null, respuesta);



    }
}
