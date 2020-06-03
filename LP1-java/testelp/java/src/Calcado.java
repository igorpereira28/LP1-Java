
public class Calcado {
    public String marca;
    private int num;
    public String cor;
    private String loja;
    public int numpe;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public String getLoja(){
        return loja;
    }

    public void setLoja(String loja){
        this.loja = loja;
    }
    

    public String calcartenis(){
        if (getNum() == this.numpe){
            return "O tênis ficou certinho";
        }
        else if (getNum() < this.numpe){
            return "O tênis ficou apertado";
        }
        else{
            return "O tênis ficou largo";
        }
    }
    
    public static void main(String[] args) {

        Calcado chuteira = new Calcado();
        chuteira.marca = "Adidas";
        chuteira.setNum(42);
        chuteira.cor = "Verde";
        chuteira.setLoja("Oscar");
        chuteira.numpe = 41;

    
    	System.out.println("Vieram comprar um tênis e foi escolhido da marca " + chuteira.marca
    			+ " número " + chuteira.getNum() + " da cor " + chuteira.cor + " aqui na " + 
    			chuteira.getLoja() + ". O número do pé do cliente era " + chuteira.numpe +
    			" então " + chuteira.calcartenis());
}

}