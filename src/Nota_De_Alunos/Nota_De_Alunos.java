
package Nota_De_Alunos;

import javax.swing.*;

public class Nota_De_Alunos {

    public static void main(String[] args) {
        
        double[] notaAlunos = new double [9];
         
        double soma = 0;
        double med = 0;
        double div = 0;
        int acima = 0;
        int abaixo = 0;
        double naMedia = 0;
        
        for(int i=0; i<notaAlunos.length; i++){
         
            notaAlunos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do "+(i+1)+"° aluno."));
            System.out.println("Nota: " + notaAlunos[i]);
        }     
            
        for(int i=0; i<notaAlunos.length; i++){
            soma = soma+notaAlunos[i];
            med = soma/9;
            div = med*9/100;
        }
            
        for(int i=0; i<notaAlunos.length; i++){
                
            double media1 = med+div;                  
            if (notaAlunos[i] > media1){
               acima=acima+1;
            }
            
            double media2 = med-div;
            if(notaAlunos[i] < media2){
               abaixo=abaixo+1;
            }
        }    
        
            System.out.println();
            System.out.println("Soma Notas da Turma: " + soma);
            System.out.println("Média da Turma: "+ med);
            System.out.println("Quant. Notas Acima: "+ acima);
            System.out.println("Quant. Notas Media: "+naMedia);
            System.out.println("Quant. Notas Abaixo: "+ abaixo+"\n");
        
         
    }
    
}
