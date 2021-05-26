import java.util.Scanner;
import java.util.*;

/*
QUEST�O 2 PROVA - WEYLER JORGE DOS SANTOS SILVA. 

Um posto est� vendendo combust�veis com a seguinte tabela de descontos: �lcool: at� 10 litros sem desconto,at� 20 litros, desconto de 3% por litro e acima de 20 litros, desconto de 5% por litro; 
Gasolina: at� 10 litros sem desconto,at� 20 litros, desconto de 4% por litro e acima de 20 litros, desconto de 6% por litro. 
Escreva um programa que o usuario escolhera o tipo de combust�vel (A-Alcool ou  G gasolina), o n�mero de litros vendidos,  e dever� imprima o nome do combust�vel e o valor a ser pago pelo cliente. 

OBS:Considere que o pre�o do litro da gasolina � R$ 4.50 e o pre�o do litro do �lcool � R$ 3.40.

*/
public class questao2_prova
{   
   public static void main (String[] args)
   {
      Scanner leia = new Scanner(System.in);
            //vari�veis atribuidas
            
      double litros, total, desconto;
      char letra;
     
            //solicitando o tipo de combustivel
      System.out.println("\n" + "Digite o combustivel a ser abastecido: " + "\n");
      System.out.println("\n" + "(A) �lcool ---- Pre�o: R$3,40L" + "\n");
      System.out.println("\n" + "(G) Gasolina -- Pre�o: R$4,50L" + "\n");
      letra=leia.next().charAt(0);
      //solicitando a quantidade de combustivel em litros
      System.out.println("\n" + "Digite a quantidade de combustivel em litros: " + "\n");
      litros=leia.nextDouble();
      
            //condi��o
      if (letra == 'a' || letra == 'A')
      {
         if(litros<=10)
         {
            System.out.println("\n"+"Infelizmente voc� n�o obteve desconto."+"\n");
            total = 3.40 * litros;
            System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 3.40,"\n");
            System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 3.40) - total));
            System.out.printf("\n"+"Voc� tem que pagar: ------------|R$%1.2f.%n" ,total);
         }else if(litros>10 && litros <= 20)
         {
            System.out.println("\n"+"Voc� obteve um desconto de 3%."+"\n");
            desconto = 3.40 - (3.40*0.03);
            total = desconto * litros;
            System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 3.40,"\n");
            System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 3.40) - total));
            System.out.printf("\n"+"Voc� tem que pagar: ------------|R$%1.2f.%n" ,total);
         }else if(litros>20)
         {
            System.out.println("\n"+"Voc� obteve um desconto de 5%."+"\n");
            desconto = 3.40 - (3.40*0.05);
            total = desconto * litros;
            System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 3.40,"\n");
            System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 3.40) - total));
            System.out.printf("\n"+"Voc� tem que pagar: ------------|R$%1.2f.%n" ,total);
         }else
         {
            System.out.println("\n"+"Selecione a quantidade de litros v�lida." + "\n");
         }
      }      
      else
      {
         if (letra == 'g' || letra == 'G')
         {
            if(litros<=10)
            {
               System.out.println("\n"+"Infelizmente voc� n�o obteve desconto."+"\n");
               total = 4.50 * litros;
               System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 4.50,"\n");
               System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 4.50) - total));
               System.out.printf("\n"+"Voc� tem que pagar: ------------|R$%1.2f.%n" ,total);
            }else if(litros>10 && litros <= 20)
            {
               System.out.println("\n"+"Voc� obteve um desconto de 4%."+"\n");
               desconto = 4.50 - (4.50*0.04);
               total = desconto * litros;
               System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 4.50,"\n");
               System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 4.50) - total));
               System.out.printf("\n"+"Voc� tem que pagar: ------------|R$%1.2f.%n" ,total);
            }else if(litros>20)
            {
               System.out.println("\n"+"Voc� obteve um desconto de 6%."+"\n");
               desconto = 4.50 - (4.50*0.06);
               total = desconto * litros;
               System.out.printf("\n"+"Valor sem desconto: ------------|R$%1.2f.%n" , litros * 4.50,"\n");
               System.out.printf("\n"+"Desconto: ----------------------|-R$%1.2f.%n" , ((litros * 4.50) - total));
               System.out.printf("\n"+"Voc� tem que pagar: ------------|R$%1.2f.%n" ,total);
            }else
            {
               System.out.println("\n"+"Selecione a quantidade de litros v�lida." + "\n");
            }
         }      
         else
         {
            System.out.println("Selecione uma v�lida. ");
         }
      }          
   }
}