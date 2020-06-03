
public class Profissional {
    public String nome;
    private double salario;
    private String funcao;
    public int tempodetrabalho;
    public int dias_semana;

    public Profissional(String nome, int tempodetrabalho, int dias_semana){
        this.nome = nome;
        this.tempodetrabalho = tempodetrabalho;
        this.dias_semana = dias_semana;
    }
    
    public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getFuncao(){
        return funcao;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }


    public int cargahoraria(){
        return this.tempodetrabalho * this.dias_semana;
    }
    
    public int mensal() {
    	return this.cargahoraria() * 4;
    }
    
    public int anual() {
    	return this.mensal() * 12;
    }
    
    public static void main(String[] args) {

        Profissional trabalhador = new Profissional();
        trabalhador.nome = "Agnaldo";
        trabalhador.setSalario(8000);
        trabalhador.setFuncao("Gestor");
        trabalhador.tempodetrabalho = 8;
        trabalhador.dias_semana = 5;

    
    	System.out.println(trabalhador.nome + " têm o cargo de " + trabalhador.getFuncao() + 
    			" e recebe " + trabalhador.getSalario() + " trabalhando " + 
    			trabalhador.tempodetrabalho + " horas por dia e " + trabalhador.dias_semana +
    			" dias na semana, totalizando " + trabalhador.cargahoraria() + " semanais " +
    			trabalhador.mensal() + " horas mensais e " + trabalhador.anual() + " horas anuais.");

}
}