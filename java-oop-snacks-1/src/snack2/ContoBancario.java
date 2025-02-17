package snack2;

import java.math.BigDecimal;

public class ContoBancario {

    // attributi
    public int numeroConto;
    public BigDecimal saldo;

    // costruttore
    ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = new BigDecimal(0);
    }

    // metodo per depositare denaro
    public String depositaDenaro(BigDecimal sommaDepositata) {
        saldo = saldo.add(sommaDepositata);
        return "Hai depositato " + sommaDepositata + " euro sul tuo conto. Il tuo saldo aggiornato è: "
                + saldo + " euro";
    }

    // metodo per prelevare denaro
    public String prelevaDenaro(BigDecimal sommaPrelevata) {
        saldo = saldo.subtract(sommaPrelevata);
        return "Hai prelevato " + sommaPrelevata + " euro sul tuo conto. Il tuo saldo aggiornato è: "
                + saldo + " euro";
    }

}
