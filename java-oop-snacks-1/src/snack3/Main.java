package snack3;

public class Main {
    public static void main(String[] args) {
        // creo uno studente
        Studente studenteUno = new Studente("Jacopo", "Trincanato", 23);

        // creo un registro
        RegistroStudenti registroStudenti = new RegistroStudenti();

        // aggiungo lo studente al registro
        registroStudenti.aggiungiStudente(studenteUno);

        // verifico che lo abbia aggiunto
        registroStudenti.stampaStudente();
    }
}
