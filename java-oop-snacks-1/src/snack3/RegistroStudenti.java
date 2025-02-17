package snack3;

public class RegistroStudenti {

    // attributi
    private Studente[] registro;

    // costruttore
    RegistroStudenti() {
        registro = new Studente[0];
    }

    // metodo per aggiungere uno studente
    public void aggiungiStudente() {
        System.out.println(registro);
    }
}
