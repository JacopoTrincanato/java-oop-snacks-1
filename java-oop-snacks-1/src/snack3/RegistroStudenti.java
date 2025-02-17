package snack3;

import java.util.ArrayList;

public class RegistroStudenti {

    // attributi
    private ArrayList<Studente> registro;

    // costruttore
    RegistroStudenti() {
        registro = new ArrayList<Studente>();
    }

    // metodo per aggiungere gli studenti
    public String aggiungiStudente(Studente studente) {
        registro.add(studente);
        return "Lo studente " + studente.stringaConcatenata() + " è stato aggiunto al registro";
    }

    // metodo per stampare gli studenti
    public void stampaStudente() {
        System.out.println(registro);
    }
}
