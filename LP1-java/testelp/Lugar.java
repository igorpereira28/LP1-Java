package testelp;

public class Lugar {
    private String nome;
    private String cidade;
    private String pais;
    private String estado;
    private String comochegar;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getComoChegar(){
        return this.comochegar;
    }

    public void setComoChegar(String comochegar){
        this.comochegar = comochegar;
    }

}
