import java.util.Scanner;
import java.util.*;

/*
QUEST�O 3 PROVA - WEYLER JORGE DOS SANTOS SILVA. 

Foi feita uma pesquisa entre os habitantes de uma regi�o. Foram coletados os dados de c�digo, idade, sexo (M/F) e sal�rio.

Fa�a a consist�ncia para que a idade n�o possa ser menor do que 18 nem maior do que 75.Se ficar fora desse intervalo deve-se mostrar uma mensagem de erro e pedir novamente a idade do pesquisado.

Fa�a um algoritmo que informe: a) a m�dia de idade do grupo; b) o maior e o menor sal�rio do grupo; c) N�mero de homens com mais de 40 anos. Encerre a entrada de dados quando for digitada o c�digo negativo.

*/

public class questao3_prova
{   
   public static void main (String[] args)
   {
      Scanner leia = new Scanner(System.in);
            //vari�veis atribuidas
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
      
            System.out.println("\n" + "Digite seu sal�rio" + "\n");
      salario=leia.nextDouble();
       
       media = idade/2;    
         
   }
}