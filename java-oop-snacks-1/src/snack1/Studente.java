package snack1;

public class Studente {

    // attributi
    public String nome;
    public String cognome;
    public int eta;

    // costruttore
    Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // metodo che restituisca la stringa concatenata
    public String stringaConcatenata() {
        return this.nome + ' ' + this.cognome + ',' + ' ' + this.eta + " anni";
    }
}
