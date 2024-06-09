//A pangram is a sentence that contains every single letter of the alphabet at least once.
 //For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 //because it uses the letters A-Z at least once (case is irrelevant).
//Given a string, detect whether or not it is a pangram. Return True if it is,
//False if not. Ignore numbers and punctuation.



public class Pangram {
    static String pangram1 = "the quick brown fox jumps over the lazy dog.";
    static String pangram2 = "You shall not pass!";

    public boolean check(String sentence) {
        // Convertir la oración a minúsculas para una comparación sin distinción entre mayúsculas y minúsculas
        sentence = sentence.toLowerCase();

        // Crear un array de booleanos para marcar la presencia de cada letra del alfabeto
        boolean[] letrasPresentes = new boolean[26]; // Un índice para cada letra del alfabeto (0=a, 1=b, ..., 25=z)

        // Recorrer la oración carácter por carácter
        for (char c : sentence.toCharArray()) {
            // Si el carácter es una letra entre 'a' y 'z', marcar su presencia en el array
            if (c >= 'a' && c <= 'z') {
                letrasPresentes[c - 'a'] = true;
            }
        }

        // Verificar si todas las letras del alfabeto están presentes en el array
        for (boolean letraPresente : letrasPresentes) {
            if (!letraPresente) {
                return false; // Si falta alguna letra del alfabeto, devolver false
            }
        }

        return true; // Todas las letras del alfabeto están presentes en la oración
    }

    // Método main para ejecutar el programa
    public static void main (String[] args) {
        Pangram pangram = new Pangram();
        // Llamamos al método check con la oración pangram1 y pangram2, y mostramos los resultados
        boolean resultado1 = pangram.check(pangram1);
        boolean resultado2 = pangram.check(pangram2);
        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);
    }
}