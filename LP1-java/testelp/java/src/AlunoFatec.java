
public class AlunoFatec {
    public String nome;
    public String curso;
    public int semestre;
    public String materiapreferida;

    public static void main(String[] args) {

        AlunoFatec estudante = new AlunoFatec();
        estudante.nome = "Lidia";
        estudante.curso = "Banco de Dados";
        estudante.semestre = 2;
        estudante.materiapreferida = "ela não sabe";

    
    	System.out.println(estudante.nome + " esta matriculada no curso de " + estudante.curso + 
    			" no " + estudante.semestre + " e sua matéria preferida " + 
    			estudante.materiapreferida );
    	
}
}