
public class Lugar {
    public String nome;
    public String cidade;
    public String pa�s;
    private String custo;
    private String comovai;

    public Lugar(String nome, String cidade, String pa�s){
        this.nome = nome;
        this.cidade = cidade;
        this.pa�s = pa�s;
    }

    public Lugar() {
		// TODO Auto-generated constructor stub
	}

	public String getCusto(){
        return custo;
    }

    public void setCusto(String Custo){
        custo = Custo;
    }

    public String getComovai(){
        return comovai;
    }

    public void setComovai(String Comovai){
        comovai = Comovai;
    }
    
    
    public static void main(String[] args) {

        Lugar turismo = new Lugar();
        turismo.nome = "Monumento Hokage";
        turismo.cidade = "Konoha";
        turismo.pa�s = "Pa�s do Fogo";
        turismo.setCusto("sentimental");
        turismo.setComovai("nos sonhos");

    
    	System.out.println(turismo.nome + " esta localizado na vila de " + turismo.cidade + 
    			" dentro do " + turismo.pa�s + ", o custo para chegar la � " + 
    			turismo.getCusto() + " sendo possivel chegar " + turismo.getComovai());

}

}