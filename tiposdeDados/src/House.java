public class House {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public House(String nome, int idade, double peso, double altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }
    //getters

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    //setters

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calculaIMC(){
        return this.peso / Math.pow(this.altura, 2);
    }
}
