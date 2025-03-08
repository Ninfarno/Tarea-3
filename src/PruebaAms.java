import java.util.Scanner;

public class PruebaAms {
    public static void main(String[] args) {
        Scanner scannerr = new Scanner(System.in);

        //Ingresa Variable entera
        int a;
        System.out.printf("Numero: ");
        a = scannerr.nextInt();

        NumeroAms num = new NumeroAms();
        System.out.println(num.esNumeroAms(a));

        // Recibir un número como String y verificar si es un número Armstrong
        System.out.printf("Numero como texto: ");
        String numeroTexto = scannerr.next();
        //Nota: Buscar como hacer que el scanner escanee hasta que detecte un enter
        System.out.println(num.esNumeroAm(numeroTexto));

        //Pregunta archivo con extencion y analiza con obtenerExtencion()
        System.out.printf("Introduce el nombre de un archivo (con extensión): ");
        String archivo = scannerr.next();
        System.out.println(obtenerExtension(archivo));
    }

    //Obtiene la extencion del archivo anterior
    public static String obtenerExtension(String archivo) {
        if (archivo == null || archivo.trim().isEmpty()) {
            return "El archivo no tiene nombre.";
        }

        //Elimina espacios en blanco
        archivo = archivo.trim();

        //Busca el punto de archivo
        int indexPunto = archivo.lastIndexOf('.');

        if (indexPunto == -1 || indexPunto == archivo.length() - 1) {
            return "El archivo no tiene extensión.";
        }

        //obtien la extencion
        String extension = archivo.substring(indexPunto + 1);

        //Determina si la extencion es valida o no
        if (extension.length() == 3) {
            return "La extensión del archivo es: " + extension;
        } else {
            return "La extensión del archivo no tiene un formato válido (debe ser de 3 letras).";
        }
    }
}