package javalp;

import java.util.ArrayList;

public class Carro {
	
	public String car;
	public int tabela;
	private String placa;
	
    public Carro(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public int getTabela(){
        return tabela;
    }

    public void setTabela(int tabela){
        this.tabela = tabela;
    }

	public static void main(String[] args) {
		ArrayList<Carro> car = new ArrayList<>();
		car.add("Uno");
		car.add("Gol");
		System.out.println("Temos dois carros, que são: " + car.toString());
	}
	
	
	'if car.toString() == "Uno"{
			'System.out.println("Temos dois carros, que são: " + car.toString());
	}

