import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        String palabraSecreta = "inteligencia";
        int intentoMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;
        boolean letraCorrecta = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Inicio de logica de programacion
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }

        // Bucle while para recorrer las opciones digitadas por el usuario
        while (!palabraAdivinada && intentos < intentoMaximos) {
            System.out.println("Palabra por adivinar: "+ String.valueOf(letrasAdivinadas)+ " (" + palabraSecreta.length()+ " letras)");
            System.out.println("Introduce una letra por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i]=letra;
                    letraCorrecta = true;
                }
            } //Fin del for palabraSecreta

            if (!letraCorrecta){
                intentos++;
                System.out.println("Letra Incorrecta, vuelve a probar, te quedan "+ (intentoMaximos-intentos));
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades has adivinado: "+palabraSecreta);
            } 
        }//Fin del while

        if (!palabraAdivinada){
            System.out.println("No has podido adivinar");
        }

        scanner.close();

    }
}
