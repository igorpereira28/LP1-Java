package testelp;

public class Pessoa {
    public String nome;
    private int idade;
    public Double altura;
    public Double peso;

    public void setNome(String nome){
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade
    }

    public void setAltura(double altura){
        this.altura = altura
    }

    public Double getPeso(){
        return peso;
    }

    public void setPeso(Double peso){
        this.peso = peso;
    }


}
