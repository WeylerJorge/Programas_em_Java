import java.util.Scanner;
import java.util.*;

/*
QUESTÃO 3 PROVA - WEYLER JORGE DOS SANTOS SILVA. 

Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de código, idade, sexo (M/F) e salário.

Faça a consistência para que a idade não possa ser menor do que 18 nem maior do que 75.Se ficar fora desse intervalo deve-se mostrar uma mensagem de erro e pedir novamente a idade do pesquisado.

Faça um algoritmo que informe: a) a média de idade do grupo; b) o maior e o menor salário do grupo; c) Número de homens com mais de 40 anos. Encerre a entrada de dados quando for digitada o código negativo.

*/

public class questao3_prova
{   
   public static void main (String[] args)
   {
      Scanner leia = new Scanner(System.in);
            //variáveis atribuidas
      double salario;
      char sexo;
      int idade, media, maior=0, menor=9999999,aux;
      
      System.out.println("Digite sua idade:");
      idade = leia.nextInt();
      
      
            //verificando a idade
      do{
         
         if(idade < 18 || idade > 80)
         {
            System.out.println("Idade invalida!! Digite novamente:");
            aux = leia.nextInt();
            idade = aux;
         }
      
      }while(idade<18 && idade>80 );
      
      System.out.println("\n" + "Digite o seu sexo: " + "\n");
      System.out.println("\n" + "(M) Masculino " + "\n");
      System.out.println("\n" + "(F) Feminino " + "\n");
      sexo=leia.next().charAt(0);
      
      if(sexo=='f'|| sexo=='F'){
         System.out.println();
      }
      if(sexo=='m'|| sexo=='M'){
         System.out.println();
      }
      
            System.out.println("\n" + "Digite seu salário" + "\n");
      salario=leia.nextDouble();
       
       media = idade/2;    
         
   }
}