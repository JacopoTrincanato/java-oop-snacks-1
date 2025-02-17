package snack3;

public class RegistroStudenti {

    // attributi
    private Studente[] registro;

    // costruttore
    RegistroStudenti() {
        registro = new Studente[0];
    }

    // metodo per aggiungere gli studenti

    // metodo per stampare gli studenti
    public void stampaStudente() {
        System.out.println(registro);
    }
}
