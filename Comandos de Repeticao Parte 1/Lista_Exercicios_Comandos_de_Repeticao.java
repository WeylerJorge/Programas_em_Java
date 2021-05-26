import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class Lista_Exercicios_Comandos_de_Repeticao {

   static Scanner leia = new Scanner(System.in);
        
   public static void main(String[] args){
      int sel;
      
      System.out.println(" ______________________________________________________");
      System.out.println("*           Selecione a atividade entre 1 e 7:          *");
      System.out.println("|1 - 1 ao 10 com While.                                 |");
      System.out.println("|2 - 10 ao 1 com While.                                 |");
      System.out.println("|3 - Números impares.                                   |");
      System.out.println("|4 - Número fatorial.                                   |");
      System.out.println("|5 - Fibonacci                                          |");
      System.out.println("|6 - Quantos e quais numeros possuem tal caracteristica?|");
      System.out.println("*_______________________________________________________*"+"\n");
      sel = leia.nextInt();
      //entrada de dados
      
      switch(sel){
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
   }
   
   public static void ex01()
   {
      
               //variáveis atribuidas
      int num=1;
      
      //repeticao
      while(num<=10)
      {
         System.out.println("\n" + num + "\n");
         num+=1;
      }
      
   }
   
   public static void ex02()
   {
      
               //variáveis atribuidas
      int num=10;
      
      //repeticao
      while(1 <= num)
      {
         System.out.println("\n" + num + "\n");
         num-=1;
      }
   }
   
   public static void ex03()
   {
      int num=0, impar=1;
      
      System.out.println("\n" + "Escreva um número impar: " + "\n");
      num=leia.nextInt();
      
      
      while (impar <= num)
      {
         System.out.println("\n" + impar + "\n");
         impar+=2;      
      }
   }
   
   public static void ex04()
   {
      int num, aux=1, cal=1;
      
      System.out.println("\n" + "Escreva um número: " + "\n");
      num=leia.nextInt();
      
      while (num >= aux)
      {
         System.out.println(aux);
         cal=cal*(aux);
         aux++;      
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
         while(cont<num){
            aux3=aux1+aux2;
            System.out.println(aux3);
            cont++;//cont = cont+1; cont+=1;
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
            //variáveis atribuidas
      int numero, n1, n2, n3, n4, aux, cal1, cal2, som, cal, cont;
      
      numero=1000;
      cont=0;
      
      while(numero <= 9999){
       
         n1=numero/1000;
         aux=numero%1000;
         n2=aux/100;
         aux=aux%100;
         n3=aux/10;
         n4=aux%10;
      
         cal1=(n1*10) + n2;
         cal2=(n3*10) + n4;
         som=cal1+cal2;
         cal=(int)Math.pow(som,2);
      
            //condição
         if (cal==numero)
         {
            System.out.println("\n" + "O NUMERO "+ numero +" POSSUI TAL CARACTERISTICA: " + "\n");
            cont++;
         }      
         numero++;
      }
       System.out.println("\n" + "Existem "+ cont + " numeros com tais caracteristicas." +"\n");            
   }
}