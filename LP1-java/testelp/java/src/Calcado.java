
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
            return "O t�nis ficou certinho";
        }
        else if (getNum() < this.numpe){
            return "O t�nis ficou apertado";
        }
        else{
            return "O t�nis ficou largo";
        }
    }
    
    public static void main(String[] args) {

        Calcado chuteira = new Calcado();
        chuteira.marca = "Adidas";
        chuteira.setNum(42);
        chuteira.cor = "Verde";
        chuteira.setLoja("Oscar");
        chuteira.numpe = 41;

    
    	System.out.println("Vieram comprar um t�nis e foi escolhido da marca " + chuteira.marca
    			+ " n�mero " + chuteira.getNum() + " da cor " + chuteira.cor + " aqui na " + 
    			chuteira.getLoja() + ". O n�mero do p� do cliente era " + chuteira.numpe +
    			" ent�o " + chuteira.calcartenis());
}

}