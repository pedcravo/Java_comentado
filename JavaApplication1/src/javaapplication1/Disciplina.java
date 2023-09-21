package javaapplication1;

public class Disciplina {                                                       //classe Disciplina
    String titulo;                                                              //variavel "titulo"
    int cargaHoraria;                                                           //variavel "cargaHoraria"
    
    public Disciplina(){
    
    }
    
    public Disciplina(String titulo, int cargaHoraria){                         //construtor
        this.titulo = titulo;                                                   //link variavel para poder ser chamada depois
        this.cargaHoraria = cargaHoraria;
    }

}
