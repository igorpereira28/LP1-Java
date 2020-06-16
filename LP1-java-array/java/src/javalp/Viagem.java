package javalp;

import java.util.ArrayList;

public class Viagem {


		public static void main(String[] args) {
			ArrayList<String> pais = new ArrayList<String>();
			pais.add("Brasil");
			pais.add("Estados Unidos");
			System.out.println(pais.toString());
		}

}


public class Lugar {
    public String nome;
    private String local;

    public Lugar(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }


    public  String getLocal(){
        return this.local;
    }

    public  String getNome(){
        return this.nome;
    }


}
