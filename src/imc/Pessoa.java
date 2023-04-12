package imc;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    public double calculaIMC() {
        return peso / (altura * altura);
    }
    
    public String retornaCategoriaIMC() {
        double imc = calculaIMC();
        if (imc < 18.5) {
            return "Abaixo do peso normal.";
        } else if (imc < 24.9) {
            return "Peso normal.";
        } else if (imc < 29.9) {
            return "Excesso de peso.";
        } else if (imc < 34.9) {
            return "Obesidade classe I.";
        } else if (imc < 39.9) {
            return "Obesidade classe II.";
        } else {
            return "Obesidade classe III.";
        }
    }
}