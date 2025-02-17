package snack2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // creo un nuovo conto bancario
        ContoBancario conto = new ContoBancario(0);

        // testo il deposito denaro
        System.out.println(conto.depositaDenaro(new BigDecimal(2000)));

        System.out.println(conto.prelevaDenaro(new BigDecimal(1000)));

    }

}
