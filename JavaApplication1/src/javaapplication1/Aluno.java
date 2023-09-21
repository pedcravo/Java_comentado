package javaapplication1;

import java.util.Calendar;                                                      //importar calendario

public class Aluno{                                                             //classe Aluno
    String nome;                                                                //variavel "nome"
    int idade;                                                                  //variavel "idade"
    float nota01, nota02;                                                       //variavel "nota01" e "nota02"
    
    Disciplina d;                                                               //cria variavel "d" para ser usada como conexao com Disciplina
    
    float calcularMedia(){                                                      //funcao para calcular a media, valor float
        return (nota01+nota02)/2;                                               //retorna para o usuario o resultado da equacao
    }
    
    int calcularIdade(){                                                        //funcao para calcular a idade, valor int
        Calendar c = Calendar.getInstance();                                    //link com o calendario importado, nome do calendario vira c
        
        int anoAtual = c.get(Calendar.YEAR);                                    //declara variavel tendo   como igual ao ano atual
        int anoNascimento = 2000;                                               //declara variavel tendo como valor
        
       return anoAtual - anoNascimento;                                         //retorna para o usuario o resultado da equacao
    }

    public Aluno(){                                                             //contrutor vazio
    }

    public Aluno(String nome, float nota01, float nota02){                      //construtor
        this.nome = nome;                                                       //iguala o nome do construtor a variavel nome da classe Aluno
        this.nota01 = nota01;                                                   //iguala o nota01 do construtor a variavel nota01 da classe Aluno
        this.nota02 = nota02;                                                   //iguala o nota02 do construtor a variavel nota02 da classe Aluno
    }
 
}
