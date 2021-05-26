import java.util.*;
public class TesteCondicao
{
   public static void main (String[] args)
   {
      Scanner leia = new Scanner (System.in);
   
      int num;
   
      System.out.println("Selecione uma atividade: " + "\n");
      System.out.println("--1 ---------- não (X>3) " + "\n");
      System.out.println("--2 ---------- (X<1) e não(B>D) " + "\n");
      System.out.println("--3 ---------- NÃO (X>3) ou (C>B) " + "\n");
      System.out.println("--4 ---------- Ver se um pessoa é maior de 18. " + "\n");
      System.out.println("--5 ---------- Verificar se um número é ímpar ou par. " + "\n");
      System.out.println("--6 ---------- Escolher itens de uma tabela. " + "\n");
      System.out.println("--7 ---------- Ver se um pessoa é maior de 18. " + "\n");
      System.out.println("--8 ---------- Verificar se um número é ímpar ou par. " + "\n");
      System.out.println("--9 ---------- Escolher itens de uma tabela. " + "\n");
      System.out.println("--10 ---------- Ver se um pessoa é maior de 18. " + "\n");
        
      num=leia.nextInt();    
        
      if (num == 1){
      
         System.out.println("\n" + "Você selecionou a atividade 1!" + "\n");
         ex01();
      }else{
         if (num == 2){
         
            System.out.println("\n" + "Você selecionou a atividade 2!" + "\n");
            ex02();
         }else{
            if (num == 3){
            
               System.out.println("\n" + "Você selecionou a atividade 3!" + "\n");
               ex03();
            }         
         }
      }
   }
   
   public static void ex01()
   {
      Scanner leia = new Scanner (System.in);
      
      //variavel utilizada
      int x;
      
      x = 3;  
      
      //condicao para verificar
      if (!(x>3))
      {
         System.out.println("Verdadeiro" + "\n");
      }
      else{
         System.out.println("Falso" + "\n");
      }
   }  
   
   public static void ex02()
   {
      Scanner leia = new Scanner (System.in);
      
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
   public static void ex03()
   {
      Scanner leia = new Scanner (System.in);
      
      //variáveis utilizadas
      int num;
      double item1, item2, item3, item4, item5;
      
      //atribuindo valores aos itens
      item1 = 30.00;
      item2 = 35.50;
      item3 = 20.50;
      item4 = 10.00;
      item5 = 30.00;
      
      
      //tabela de itens
      System.out.println("**Tabela de Itens: **" + "\n");
      System.out.println("1 - Hambúrguer.........R$30,00 " + "\n");
      System.out.println("2 - Cheeseburguer......R$35,50 " + "\n");
      System.out.println("3 - Fritas.............R$20,50 " + "\n");
      System.out.println("4 - Refrigerante.......R$10,00 " + "\n");
      System.out.println("5 - Milk-shake.........R$30,00 " + "\n\n");
      
      //solicitando o numero do item
      System.out.println("Digite um número: " + "\n");
      num=leia.nextInt();    
      
      //condicoes para selecao do produto
      if (num==1)
      {
         System.out.println("\n"+"1 - Hambúrguer-------R$" + item1);
      }
      else{
         if (num==2)
         {
            System.out.println("\n"+"2 - Cheeseburguer-------R$" + item2);
         }
         else{
            if (num==3)
            {
               System.out.println("\n"+"3 - Fritas---------R$" + item3);
            }
            else{
               if (num==4)
               {
                  System.out.println("\n"+"4 - Refrigerante------R$" + item4);
               }
               else{
                  if (num==5)
                  {
                     System.out.println("\n"+"5 - Milk-shake--------R$" + item5);
                  }
                  //condicao para verificar se foi digitado um código válido
                  else{
                     System.out.println("\n"+"CÓDIGO INVÁLIDO" + "\n");
                  }
               } 
            }
         }
      }
   }
}
