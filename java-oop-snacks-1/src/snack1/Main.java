package snack1;

public class Main {
    public static void main(String[] args) {

        // creo un nuovo studente
        Studente studente = new Studente("Jacopo", "Trincanato", 23);

        // mando a schermo la stringa concatenata
        System.out.println(studente.stringaConcatenata());
    }
}
