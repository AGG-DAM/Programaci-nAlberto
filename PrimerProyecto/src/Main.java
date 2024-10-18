public class Main {
    public static void main(String[] args) {
        boolean condicion = true;
        char caracter = 'A';
        byte numeroByte = 127;
        short numeroShort = 32767;
        int numeroInt = 32768;
        long numeroLong = 9223372036854775807L;
        float numeroFloat = 123.456f;
        double numeroDouble = 123.456;
        String  cadena = "Mi cadena de texto";



        System.out.println("Hola mundo ");
        System.out.println("Imprime booleano " + condicion);
        System.out.println("Imprime caracter " + caracter);
        System.out.println("Imprime numeroByte " + numeroByte);
        System.out.println("Imprime numeroShort " + numeroShort);
        System.out.println("Imprime numeroInt " + numeroInt);
        System.out.println("Imprime numeroLong " + numeroLong);
        System.out.println("Imprime numeroFloat " + numeroFloat);
        System.out.println("Imprime numeroDouble " + numeroDouble);
        System.out.println("Imprime cadena " + cadena);
        System.out.println("Imprime cuantos caracteres tiene la cadena "+ cadena.length());
        System.out.println("Imprime el quinto caracter "+ cadena.charAt(5));
        System.out.println("Imprime substring desde el caracter 5 al final "+ cadena.substring(5));
        System.out.println("Imprime substring desde el caracter 5 al 8 "+ cadena.substring(5,8));
        String  s = "Hola ";
        String  s2= "Mundo";
        String result = s.concat(s2);
        String s3 = s + s2;
        System.out.println(result);
        System.out.println(s3);
        int salida = s.indexOf("la");
        System.out.println("Con el parametro s.indexOf me da la posicion de la primera letra de esa cadena "+ salida);
        System.out.println("Prueba caracte\bres de escape retroceso");
        System.out.println("Prueba caracteres\r de escape  retorno de carro ");
        System.out.println("Prueba cara\tcteres\t de\t escape tabulador ");
        System.out.println("Prueba caracteres\n de escape salto de linea");
        System.out.println("Prueba caracteres\f de escape salto de pagina, no funciona");
        System.out.println("\\Prueba caracte\"res\" de \'escape\' caracteres especiales que no deja poner");

    }
}