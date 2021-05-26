import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class segunda_Lista_Exercicios {

   static Scanner leia = new Scanner(System.in);
        
   public static void main(String[] args){
      int sel;
      
      System.out.println(" _______________________________________________");
      System.out.println("*         Selecione a atividade entre 1 e 10:    *");
      System.out.println("|1 - Par ou Ímpar?                               |");
      System.out.println("|2 - Aprovado ou Reprovado?                      |");
      System.out.println("|3 - Estados Físicos da água.                    |");
      System.out.println("|4 - Valor de X.                                 |");
      System.out.println("|5 - Maior em C, Menor em A e Intermediário em B |");
      System.out.println("|6 - X é divisível por Z e por Y?                |");
      System.out.println("|7 - 3025                                        |");
      System.out.println("|8 - Lista de Nomes                              |");
      System.out.println("|9 - Número Palíndromos                          |");
      System.out.println("|10 - Conta de água SANEAGO                      |");
      System.out.println("*________________________________________________*"+"\n");
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
         case 7:
            ex07();
            break;
         case 8:
            ex08();
            break;
         case 9:
            ex09();
            break;
         case 10:
            ex10();
            break;
             
         default:
            System.out.println("Digite SOMENTE números inteiros entre 1 e 10");
            break;
      }
   }
   
   public static void ex01()
   {
      
               //variáveis atribuidas
      int num;
      
      //solicitando um numero para verificação
      System.out.println("Digite um número: " + "\n");
      num=leia.nextInt();    
      
      //condição para verificar se é impar ou par
      if (num%2==0){
         System.out.println("Seu número "+ num +" é par!" + "\n");
      }
      else{
         System.out.println("Seu número " + num + " é ímpar!" + "\n");
      }  
   }
   
   public static void ex02()
   {
      
            //variáveis atribuidas
      double nota1, nota2, nota3, cal;
      String nome;
      
            //solicitando a primeira nota
      System.out.println("\n" + "Digite a sua primeira nota: " + "\n");
      nota1=leia.nextDouble();
            //solicitando a segunda nota
      System.out.println("\n" + "Digite a sua segunda nota: " + "\n");
      nota2=leia.nextDouble();
            //solicitando a terceira nota
      System.out.println("\n" + "Digite a sua terceira nota: " + "\n");
      nota3=leia.nextDouble();
            //solicitando o nome do sujeito
      System.out.println( "\n" + "Digite o seu nome: " + "\n");
      nome=leia.next();
      leia.nextLine();
      
      cal = (nota1+nota2+nota3)/3;
      System.out.println("\n" + nome + " sua média foi de: " + cal + "\n");
      
      //condicao
      if(cal >= 6 )
      {
         System.out.println( "\n" + " Você foi aprovado " + "\n");
      }
      else{
         if (cal < 6)
         {  System.out.println( "\n" + " Você foi reprovado " + "\n");
         }
         else{
            System.out.println( "\n" + " Insira um valor válido!!! " + "\n");
         }
      }
   }
   public static void ex03()
   {
      
            //variáveis atribuidas
      int temp, calculo;
      
            //solicitando a primeira nota
      System.out.println("\n" + "Digite a temperatura da água: " + "\n");
      temp=leia.nextInt();
      leia.nextLine();
            //condição
      if (temp >= 100)
      {
         System.out.println("\n"+"Estado físico: Vaporização");
      }
      else{
         if (temp <= 0)
         {
            System.out.println("\n"+"Estado físico: Solidificação");
         }
         else{
            if (temp > 0 && temp <= 1)
            {
               System.out.println("\n"+"Estado físico: Fusão");
            }
                  //condicao para verificar se foi digitado um código válido
            else{
               System.out.println("\n"+"CÓDIGO INVÁLIDO" + "\n");
            }
            
         }
      }
   }
   
   public static void ex04()
   {
      
            //variáveis atribuidas
      double x, y;
      
            //solicitando o valor de x
      System.out.println("\n" + "Digite o valor de X: " + "\n");
      x=leia.nextInt();
      leia.nextLine();
            //condição
      if (x < 0)
      {
         y = Math.pow(x,2) + 4;
         System.out.println(" O resultado de Y = " + x + " ^2 + 4 é: " + y);
      }
      else{
         if (x > 0)
         {
            y = Math.pow(x,3) - 3;
            System.out.println(" O resultado de Y = " + x + " ^3 - 3 é: " + y);
         }                 //condicao para verificar se foi digitado um código válido
         else{
            System.out.println("\n"+"CÓDIGO INVÁLIDO" + "\n");
         }
            
      }
   }
   public static void ex05()
   {
      
            //variáveis atribuidas
      int a, b, c, cal=0;
      
            //solicitando o valor de x
      System.out.println("\n" + "Digite o valor de a: " + "\n");
      a=leia.nextInt();
      System.out.println("\n" + "Digite o valor de b: " + "\n");
      b=leia.nextInt();
      System.out.println("\n" + "Digite o valor de c: " + "\n");
      c=leia.nextInt();
      
            //condição
      if (a > b)
      {
         cal = a;
         a=b;
         b=cal;
      }
      
      if (a > c)
      {
         cal=a;
         a=c;
         c=cal;
      }   
         
      if (b > c)
      {
         cal=b;
         b=c;
         c=cal;
      }  
      System.out.println("Valor de A : " + a);                
      System.out.println("Valor de B : " + b);   
      System.out.println("Valor de C : " + c);            
   }

   public static void ex06()
   {
      
            //variáveis atribuidas
      int x, y, z, restoy, restoz;
      
            //solicitando o valor de x
      System.out.println("\n" + "Digite o valor de x: " + "\n");
      x=leia.nextInt();
      System.out.println("\n" + "Digite o valor de y: " + "\n");
      y=leia.nextInt();
      System.out.println("\n" + "Digite o valor de z: " + "\n");
      z=leia.nextInt();
      
      restoy = x % y;
      restoz = x % z;
      
      
      
            //condição
      if (restoy == 0 && restoz != 0)
      {
         System.out.println("O numero é divisivel por Y mas não por Z");
      }
      else{
         if (restoz == 0 && restoy != 0)
         {
            System.out.println("O numero é divisivel por Z mas não por Y");
         }     
         else{
            if (restoz != 0 && restoy != 0)
            {
               System.out.println("O numero não é divisivel por Z e nem por Y");
            }    
            else{
               if (restoz == 0 && restoy == 0)
               {
                  System.out.println("O numero é divisivel por Z e por Y");
               }          //condicao para verificar se foi digitado um código válido
               else{
                  System.out.println("\n"+"CÓDIGO INVÁLIDO" + "\n");
               }
            }
         }
      }
   }
   public static void ex07()
   {
      
            //variáveis atribuidas
      int numero, n1, n2, n3, n4, aux, cal1, cal2, som, cal;
      
            //solicitando o valor de x
      System.out.println("\n" + "Digite um numero de 4 algarismos: " + "\n");
      numero=leia.nextInt();
      
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
      if (numero>999 && numero<=9999 && cal==numero)
      {
         System.out.println("\n" + "O NUMERO "+ numero +" POSSUI TAL CARACTERISTICA: " + "\n");
      }      
      else
      {
         System.out.println("\n" + "O NUMERO "+ numero +" NÃO POSSUI TAL CARACTERISTICA: " + "\n");
      }          
   } 
   public static void ex08()
   {
      
            //variáveis atribuidas
      int numero;
      
            //solicitando o valor de x
      System.out.println("\n" + "Digite um dos seguintes números: "+"\n");
      System.out.println("\n" + "*------221---Bernardo------*"+"\n");
      System.out.println("\n" + "*------211---Eustáquio-----*"+"\n");
      System.out.println("\n" + "*------311---Luiz----------*"+"\n");
      System.out.println("\n" + "*------312---Mário---------*"+"\n");
      System.out.println("\n" + "*------332---Artur---------*"+"\n");
      numero=leia.nextInt();
      
            //condição
      if (numero == 221)
      {
         System.out.println("\n"+" Você selecionou o Bernardo. ");
      }
      else{
         if (numero == 211)
         {
            System.out.println("\n"+" Você seleciono o Eustáquio.");
         } 
         else{
            if (numero == 311)
            {
               System.out.println("\n"+" Você selecionou o Luiz.");
            }    
            else{
               if (numero == 312)
               {
                  System.out.println("\n"+" Você selecionou o Mário. ");
               }     
               else{
                  if (numero == 332)
                  {
                     System.out.println("\n"+" Você selecionou o Artur. ");
                  }       //condicao para verificar se foi digitado um código válido
                  else{
                     System.out.println("\n"+"CÓDIGO INVÁLIDO" + "\n");
                  }
               
               }         
            } 
         }
      }
   }
   public static void ex09()
   {
      
            //variáveis atribuidas
      int numero, quociente, unidade, dezena, centena, milhar, aux;
      
            //solicitando o valor de x
      System.out.println("\n" + "Digite um numero de 5 algarismos: " + "\n");
      numero=leia.nextInt();
      
            //condição
      if (numero>=10000 && numero<=99999)
      {
         quociente=numero;
         milhar=quociente/1000;
         centena=quociente%100;
         dezena=centena/10;
         unidade=centena%10;
         aux=unidade*10+dezena;
         
         if(milhar == aux)
         {
            System.out.println("\n"+ numero + " é palindromo. " + "\n");
         }
         
         else
         {
            System.out.println("\n"+ numero + " não é palindromo: " + "\n");
         }
      }      
      else
      {
         System.out.println("\n" + "O NUMERO "+ numero +" NÃO ESTÀ NA FAIXA!! " + "\n");
      }          
   }
   public static void ex10()
   {
      
            //variáveis atribuidas
            
      double taxa, consumo;
      char letra;
     
            //solicitando o valor de x
      System.out.println("\n" + "Digite o tipo da sua conta: " + "\n");
      System.out.println("\n" + "(I) Industrial " + "\n");
      System.out.println("\n" + "(C) Comercial " + "\n");
      System.out.println("\n" + "(R) Residencial " + "\n");
      letra=leia.next().charAt(0);
      System.out.println("\n" + "Digite o seu consumo de água em metros cubos: " + "\n");
      consumo=leia.nextDouble();
      
            //condição
      if (letra == 'r' || letra == 'R')
      {
         taxa = 75 + 3.50 * consumo;
         System.out.println("\n"+"Você tem que pagar:  " + taxa +"\n");
         
      }      
      else
      {
         if (letra == 'c' || letra == 'C')
         {
            if (consumo <= 80)
            {
               taxa = 500;
               System.out.println("Você tem que pagar: " + taxa);
            }
            else
            {
               taxa = 500 + (consumo - 80) * 5.50;
               System.out.println("Você tem que pagar: " + taxa);
            }
         }
         if(letra == 'i' || letra == 'I')
         {
            if (consumo <= 100)
            {
               taxa = 800;
               System.out.println("Você tem que pagar: " + taxa);
            }
            else
            {
               taxa = 800 + (consumo - 100) * 8.00;
               System.out.println("Você tem que pagar: " + taxa);
            }
         }
         else
         {
            System.out.println("Digite um valor válido. ");
         }
      }          
   }
}