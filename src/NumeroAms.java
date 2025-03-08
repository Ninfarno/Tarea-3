public class NumeroAms {

    public boolean esNumeroAms(int a){
        int digito = 0;
        int suma = 0;
        int copia = a;
        int cantidad = cuantosNumeros(a);
        while(a > 0){
            digito = a % 10;
            suma += (int)Math.pow((double)digito, (double)cantidad);
            a /= 10;
        }
        return suma == copia;
    }

    private int cuantosNumeros(int a){
        int contador = 0;
        while(a > 0){
            a /= 10;
            contador++;
        }
        return contador;
    }

    public boolean esNumeroAm(String numero){
        //Si el numero recibido es null\vacio inprimira
        if (numero == null || numero.trim().isEmpty()) {
            System.out.printf("El número %.2f es NULL", numero);
            return false;
        }
        //Creo que no podra llegar a ejecutarse este if
        //El enter solo salta la linea

        numero = numero.trim();

        char [] digitos = numero.toCharArray();
        int suma = 0;
        for(int i = 0; i < digitos.length; i++){
            double digito = Double.valueOf(String.valueOf(digitos[i]));

            suma += Math.pow(digito, (double)digitos.length);
        }

        return String.valueOf(suma).equals(numero);
    }
}
