package testelp;

public class Calcado {
    public String marca;
    private String cor;
    public String modelo;
    private int tamanho;
    public String loja;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor(){
        return  cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }


}
