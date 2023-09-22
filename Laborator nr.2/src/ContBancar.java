import java.util.function.BinaryOperator;

public class ContBancar {
    private double sold;

    public ContBancar() {
        this.sold = 0.0;
    }
    public void depunere(double suma) {
        if (suma > 0) {
            sold += suma;
            System.out.println("Depunere efectuata cu succes");
        } else {
            System.out.println("Depunerea nu este suficienta");
        }
    }
        public void afisareSold (){
            System.out.println("Soldul dumnevoastra este "+sold+" de lei");
        }

    }

