import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class Lista_Exercicios_Comandos_de_Repeticao_faca {

   static Scanner leia = new Scanner(System.in);
        
   public static void main(String[] args){
      int op;
      
      do {
         menu();
         op=leia.nextInt();
               switch(op){
         case 1:
            ex01();
            break;
         
         case 2:
            ex02();
            break;
            
         case 3:
            ex03();
            break;
            
         case 4:
            ex04();
            break;
         case 5:
            ex05();
            break;
         case 6:
            ex06();
            break;
             
         default:
            System.out.println("Digite SOMENTE números inteiros entre 1 e 6");
            break;
      }     
      }while (op!=6);
   }
   
   public static void menu()
   {
      
      System.out.println(" ________________________________________________________");
      System.out.println("*           Selecione a atividade entre 1 e 7:           *");
      System.out.println("|1 - 1 ao 10 com For.                                   |");
      System.out.println("|2 - 10 ao 1 com For.                                   |");
      System.out.println("|3 - Números impares.                                   |");
      System.out.println("|4 - Número fatorial.                                   |");
      System.out.println("|5 - Fibonacci                                          |");
      System.out.println("|6 - Quantos e quais numeros possuem tal caracteristica?|");
      System.out.println("*________________________________________________________*"+"\n");
   }
   
   public static void ex01()
   {
      //variáveis atribuidas
      int i;
      
      //repeticao
      for(i =1; i<=10;i++)
      {
       System.out.println(i);
      }
      
   }
   
   public static void ex02()
   {      
      //variáveis atribuidas
      int i;
      
      //repeticao
      for(i =10; i>=1;i--)
      {
       System.out.println(i);
      }
   }
   
   public static void ex03()
   {
      int num, impar;
      
      System.out.println("\n" + "Escreva um número impar: " + "\n");
      num=leia.nextInt();
      
      
      for (impar = 1; impar <= num; impar+=2)
      {
         System.out.println("\n" + impar + "\n");    
      }
   }
   
   public static void ex04()
   {
      int num, aux, cal=1;
      
      System.out.println("\n" + "Escreva um número: " + "\n");
      num=leia.nextInt();
      
      for (aux = 1; num >= aux; aux++)
      {
         System.out.println(aux);
         cal=cal*(aux);   
      }
      System.out.println("\n"+ "!" + num + " = " + cal +"\n");
   }
   
   public static void ex05()
   {
      //Declarando as variáveis.
      int aux1, aux2,aux3,num,cont;
      //Atribuindo os valores.
      aux1 = 1;
      aux2 = 1;
      
      System.out.println("Digite um numero maior que 2");
      num=leia.nextInt();
      if(2<num)
      {
         System.out.println(aux1);
         System.out.println(aux2);
         cont = 2;
         
         for(cont=1; cont<num; cont++){
            aux3=aux1+aux2;
            System.out.println(aux3);
            aux1 = aux2;
            aux2 = aux3;
         }
      }
      else{
         System.out.println("Insira um valor maior que 2.");
      }
            
            
   }

   public static void ex06()
   {
      int soma, aux, qtde=0;
      
      for(int x=1000; x <= 9999; x++)
      {
         soma = (x/100) + (x%100);
         aux = (int)Math.pow(soma,2);
         if (aux==x)
         {
            System.out.println(x);
            qtde++;
         }
      }
      System.out.println(qtde+" números possuem essa característica.");
         
   }
}