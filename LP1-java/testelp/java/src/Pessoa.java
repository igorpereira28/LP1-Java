class Pessoa{
    public String nome;
    public int idade;
    public String sexo;
    private double altura;
    private double peso;


    public double getAltura(){
        return altura;
    }

    public void setAltura(final double Altura) {
        altura = Altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(final double Peso) {
        peso = Peso;
    }

    public void getNome() {
        System.out.printf(this.nome);
    }


    public String alturamaisvelho(){
        if (this.idade <= 21){
            return " ainda vai crescer mais";
        }
        else{
            return " ainda pode crescer, mas ser� mais dificil";
        }
}

    public String genero(){
        if (this.sexo == "m"){
            return " � do sexo masculino";
        }
        else if (this.sexo == "f"){
            return " � do sexo feminino";
        }
        else{
            return " e n�o quer declarar seu sexo";
        }
    }
    public String maioridade(){
        if (this.idade <= 18){
           return " ja � maior de idade";
        }
        else{
            return " n�o � maior de idade";
        }
}
    
    
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Yuri";
        pessoa.idade = 25;
        pessoa.sexo ="m";
        pessoa.setAltura(1.69);
        pessoa.setPeso(65);

        pessoa.alturamaisvelho();

        pessoa.genero();

        pessoa.maioridade();

        System.out.println(pessoa.nome + " ja tem " + pessoa.idade + pessoa.genero() +
        " tem " + pessoa.getAltura() + " de altura e pesa " + pessoa.getPeso() + "kg, sendo assim " + 
        pessoa.nome + pessoa.alturamaisvelho() + " e " + pessoa.maioridade());        
    }
}


