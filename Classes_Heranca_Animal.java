
public class Animal {
    private float tamanho;
    private String cor;

    public Animal(float tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void comer() {
        System.out.println("O animal está comendo.");
    }
}


public class Cavalo extends Animal {
    private String raca;

    public Cavalo(float tamanho, String cor, String raca) {
        super(tamanho, cor);
        this.raca = raca;
    }

    public void fugir() {
        System.out.println("O cavalo está fugindo.");
    }
}


public class Leao extends Animal {
    private boolean juba;

    public Leao(float tamanho, String cor, boolean juba) {
        super(tamanho, cor);
        this.juba = juba;
    }

    public void cacar() {
        System.out.println("O leão está caçando.");
    }
}
