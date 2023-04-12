package personagem;

public class Personagem {
    private double nivelAtaque;
    private double nivelDefesa;
    private double capacidadeEvolucao;
    private double poder;

    public Personagem(double nivelAtaque, double nivelDefesa, double capacidadeEvolucao) {
        if (nivelAtaque < 0 || nivelAtaque > 10) {
            throw new IllegalArgumentException("Nível de ataque precisa valer entre 0 e 10");
        }
        if (nivelDefesa < 0 || nivelDefesa > 10) {
            throw new IllegalArgumentException("Nível de defesa precisa valer entre 0 e 10");
        }
        if (capacidadeEvolucao < 0 || capacidadeEvolucao > 10) {
            throw new IllegalArgumentException("Capacidade de evolução precisa valer entre 0 e 10");
        }
        this.nivelAtaque = nivelAtaque;
        this.nivelDefesa = nivelDefesa;
        this.capacidadeEvolucao = capacidadeEvolucao;
        this.poder = 0.45 * nivelAtaque + 0.35 * nivelDefesa + 0.2 * capacidadeEvolucao;
    }
    
    public void imprimePoder() {
        if (this.eEspecial()) {
        	System.out.printf("O poder deste personagem é de %.2f (personagem especial).", poder);
        } else {
        	System.out.printf("O poder deste personagem é de %.2f.", poder);;
        }
    }

    public boolean eEspecial() {
        return poder >= 8;
    }
}