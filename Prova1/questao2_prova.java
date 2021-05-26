import java.util.Scanner;
import java.util.*;

/*
QUESTÃO 2 PROVA - WEYLER JORGE DOS SANTOS SILVA. 

Um posto está vendendo combustíveis com a seguinte tabela de descontos: Álcool: até 10 litros sem desconto,até 20 litros, desconto de 3% por litro e acima de 20 litros, desconto de 5% por litro; 
Gasolina: até 10 litros sem desconto,até 20 litros, desconto de 4% por litro e acima de 20 litros, desconto de 6% por litro. 
Escreva um programa que o usuario escolhera o tipo de combustível (A-Alcool ou  G gasolina), o número de litros vendidos,  e deverá imprima o nome do combustível e o valor a ser pago pelo cliente. 

OBS:Considere que o preço do litro da gasolina é R$ 4.50 e o preço do litro do álcool é R$ 3.40.

*/
public class questao2_prova
{   
   public static void main (String[] args)
   {
      Scanner leia = new Scanner(System.in);
            //variáveis atribuidas
            
      double litros, total, desconto;
      char letra;
     
            //solicitando o tipo de combustivel
      System.out.println("\n" + "Digite o combustivel a ser abastecido: " + "\n");
      System.out.println("\n" + "(A) Álcool ---- Preço: R$3,40L" + "\n");
      System.out.println("\n" + "(G) Gasolina -- Preço: R$4,50L" + "\n");
      letra=leia.next().charAt(0);
      //solicitando a quantidade de combustivel em litros
      System.out.println("\n" + "Digite a quantidade de combustivel em litros: " + "\n");
      litros=leia.nextDouble();
      
            //condição
      if (letra == 'a' || letra == 'A')
      {
         if(litros<=10)
         {
            System.out.println("\n"+"Infelizmente você não obteve desconto."+"\n");
            total = 3.40 * litros;
            System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 3.40,"\n");
            System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 3.40) - total));
            System.out.printf("\n"+"Você tem que pagar: ------------|R$%1.2f.%n" ,total);
         }else if(litros>10 && litros <= 20)
         {
            System.out.println("\n"+"Você obteve um desconto de 3%."+"\n");
            desconto = 3.40 - (3.40*0.03);
            total = desconto * litros;
            System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 3.40,"\n");
            System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 3.40) - total));
            System.out.printf("\n"+"Você tem que pagar: ------------|R$%1.2f.%n" ,total);
         }else if(litros>20)
         {
            System.out.println("\n"+"Você obteve um desconto de 5%."+"\n");
            desconto = 3.40 - (3.40*0.05);
            total = desconto * litros;
            System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 3.40,"\n");
            System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 3.40) - total));
            System.out.printf("\n"+"Você tem que pagar: ------------|R$%1.2f.%n" ,total);
         }else
         {
            System.out.println("\n"+"Selecione a quantidade de litros válida." + "\n");
         }
      }      
      else
      {
         if (letra == 'g' || letra == 'G')
         {
            if(litros<=10)
            {
               System.out.println("\n"+"Infelizmente você não obteve desconto."+"\n");
               total = 4.50 * litros;
               System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 4.50,"\n");
               System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 4.50) - total));
               System.out.printf("\n"+"Você tem que pagar: ------------|R$%1.2f.%n" ,total);
            }else if(litros>10 && litros <= 20)
            {
               System.out.println("\n"+"Você obteve um desconto de 4%."+"\n");
               desconto = 4.50 - (4.50*0.04);
               total = desconto * litros;
               System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 4.50,"\n");
               System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 4.50) - total));
               System.out.printf("\n"+"Você tem que pagar: ------------|R$%1.2f.%n" ,total);
            }else if(litros>20)
            {
               System.out.println("\n"+"Você obteve um desconto de 6%."+"\n");
               desconto = 4.50 - (4.50*0.06);
               total = desconto * litros;
               System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 4.50,"\n");
               System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 4.50) - total));
               System.out.printf("\n"+"Você tem que pagar: ------------|R$%1.2f.%n" ,total);
            }else
            {
               System.out.println("\n"+"Selecione a quantidade de litros válida." + "\n");
            }
         }      
         else
         {
            System.out.println("Selecione uma válida. ");
         }
      }          
   }
}