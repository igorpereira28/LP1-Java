
public class InstrumentoMusical {
    public String nome;
    private double preco;
    private String comprador;
    public String instrumento;
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getComprador(){
        return comprador;
    }
    
    public void setComprador(String comprador){
        this.comprador = comprador;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setInstrumentoo(String instrumento){
        this.instrumento = instrumento;
    }

    public void tocarinstrumento(){
        
    }
    
    public String compra(){
    	if (getComprador() == "m�e") {
    		return "sua m�e";
    	}
    	else if (getComprador() == "pai") {
    		return "seu pai";
    	}
    	else {
    		return "foi ele(a) mesmo";
    	}
    }
    
    public static void main(String[] args) {

        InstrumentoMusical music = new InstrumentoMusical();
        music.nome = "Iara";
        music.instrumento = "Viol�o";
        music.setPreco(596.32);
        music.setComprador("pai");

    
    	System.out.println(music.nome + " tem o instrumento " + music.instrumento + ", que quem comprou foi "
    			+ music.compra() + " e custou " + music.getPreco());
}
}
