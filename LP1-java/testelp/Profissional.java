package testelp;

public class Profissional {
    public String nome;
    private Double salario;
    public String funcao;
    private int cargahoraria;

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public int getCargaHoraria() {
        return cargahoraria;
    }

    public void setCargaHoraria(int cargahoraria){
        this.cargahoraria = cargahoraria;
    }
}
