package testelp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class AlunoFatecSJC {

    public String nome;
    private String curso;
    private String semestre;
    private String disciplina;
    private double cargahoraria;

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    private ArrayList <String> disciplinas = new ArrayList<>();{
        this.disciplinas.add("Engenharia de Software");
        this.disciplinas.add("Linguagem de Programação");
        this.disciplinas.add("Laboratório");
    }

    public int getCargaHoraria(){
        return horario;
    }

    public void setCargaHoraria(int cargahoraria){
        this.cargahoraria = cargahoraria;
    }

}