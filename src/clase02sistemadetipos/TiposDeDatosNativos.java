package clase02sistemadetipos;

public class TiposDeDatosNativos {
    // TipoDeDato variable = valor;
    // TipoDeDato variable;
    /*
        Las variables en Java Se Declaran en cameCase;
        Ejemplo:   yoSoyUnaVariableEnCamelCase
    */

    public static void main(String[] args) {
        // tipo de dato char
        char miChar = 'a';
        System.out.println(miChar);

        //tipo de dato boolean
        boolean esMayor = true;
        boolean esMenor = false;
        System.out.println(esMayor);
        System.out.println(esMenor);
        
        //tipo de datos int   
        int edad = 200;
        System.out.println(edad);
        
        //tipo de dato flotante (float)
        float precio = 150f;
        System.out.println(precio);
        
        // tipo de dato decimal
        double resultadoConsulta = 10.50;
        System.out.println(resultadoConsulta);
        
        
        // IMPORTANTE DESDE JAVA 11 EN ADELANTE
        // Podemos declarar Variables de la palabra reservada (var)
        var nombreVariable = "Hola Mundo"; // tipo String
        var miChar2 = 50; // tipo char
        var edad1 = 50; // tipo int
        var monto = 50f; // tipo float
        var consulta2 = 120000.5; // tipo double
        System.out.println(nombreVariable);
        System.out.println(miChar2);
        System.out.println(edad1);
        System.out.println(monto);
        System.out.println(consulta2);
   
    }

}
