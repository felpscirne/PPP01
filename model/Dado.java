import java.util.Random;

public class Dado {
    private Random random;

    public Dado() {
        this.random = new Random();
    }

    /**
     * Rola um dado de n lados.
     *
     * @param lados O número de lados do dado.
     * @return Um número aleatório entre 1 e o número de lados.
     */
    public int rolar(int lados) {
        return random.nextInt(lados) + 1; // Gera um número entre 1 e lados
    }
}