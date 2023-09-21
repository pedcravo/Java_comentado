/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author alunolab06
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                                    //main
      
        Aluno obj01 = new Aluno();                                              //chama construtor "Aluno()", da classe Aluno, para atribuir valores
        obj01.nome = "Vini";                                                    //atribuicao de valor para "nome" na classe Aluno
        obj01.nota01 = 9;                                                       //atribuicao de valor para "nota01" na classe Aluno
        obj01.nota02 = 8;                                                       //atribuicao de valor para "bota02" na classe aluno
        
        Aluno obj02 = new Aluno("Rosalen", 7, 8);                               //atribuicao de valor para obj02 na classe Aluno por meio do construtor "Aluno(String nome, float nota01, float nota02)"
        
        if(obj01.calcularMedia() >= 7){
            System.out.println("AP");                                           //print
        }
        else{                                                                   //else
            System.out.println("SC / VCP");                                     //print
        }
        System.out.println("" + obj01.calcularIdade());
        
        Disciplina disc01 = new Disciplina("POO", 800);                         //link com Disciplina
        obj02.d = disc01;                                                       //declara obj02.d = Disciplina
        
        System.out.println("Qual eh a disciplina do " + obj02.nome + "?");      //print
        System.out.println(obj02.d.titulo);                                     //print
    }
}














