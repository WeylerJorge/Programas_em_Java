import java.util.*;
public class ExerciciosEmUmSoArquivo
{
   public static void main (String[] args)
   {
      Scanner leia = new Scanner (System.in);
   
      int num;
   
      System.out.println("Selecione uma atividade: " + "\n");
      System.out.println("--1 ---------- Ver se um pessoa ? maior de 18. " + "\n");
      System.out.println("--2 ---------- Verificar se um n?mero ? ?mpar ou par. " + "\n");
      System.out.println("--3 ---------- Escolher itens de uma tabela. " + "\n");
        
      num=leia.nextInt();    
        
      if (num == 1){
      
         System.out.println("\n" + "Voc? selecionou a atividade 1!" + "\n");
         ex01();
      }else{
         if (num == 2){
         
            System.out.println("\n" + "Voc? selecionou a atividade 2!" + "\n");
            ex02();
         }else{
            if (num == 3){
            
               System.out.println("\n" + "Voc? selecionou a atividade 3!" + "\n");
               ex03();
            }         
         }
      }
   }
   public static void ex01()
   {
      Scanner leia = new Scanner (System.in);
      
      //variavel utilizada
      int idade;
      
      //solicitando a idade
      System.out.println("Digite sua idade: " + "\n");
      idade=leia.nextInt();    
      
      //condicao para verificar a idade
      if (idade >=18)
      {
         System.out.println("Voc? ? maior de idade!" + "\n");
      }
      else{
         if (idade < 18)
         {
            System.out.println("Voc? n?o ? maior de idade!" + "\n");
         }
         else{
            System.out.println("Algo de errado n?o est? certo!" + "\n");
         }
      }  
   }
   public static void ex02()
   {
      Scanner leia = new Scanner (System.in);
      
      //vari?veis atribuidas
      int num;
      
      //solicitando um numero para verifica??o
      System.out.println("Digite um n?mero: " + "\n");
      num=leia.nextInt();    
      
      //condi??o para verificar se ? impar ou par
      if (num%2==0){
         System.out.println("Seu n?mero "+ num +" ? par!" + "\n");
      }
      else{
         System.out.println("Seu n?mero " + num + " ? ?mpar!" + "\n");
      }  
   }
   public static void ex03()
   {
      Scanner leia = new Scanner (System.in);
      
      //vari?veis utilizadas
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
      System.out.println("1 - Hamb?rguer.........R$30,00 " + "\n");
      System.out.println("2 - Cheeseburguer......R$35,50 " + "\n");
      System.out.println("3 - Fritas.............R$20,50 " + "\n");
      System.out.println("4 - Refrigerante.......R$10,00 " + "\n");
      System.out.println("5 - Milk-shake.........R$30,00 " + "\n\n");
      
      //solicitando o numero do item
      System.out.println("Digite um n?mero: " + "\n");
      num=leia.nextInt();    
      
      //condicoes para selecao do produto
      if (num==1)
      {
         System.out.println("\n"+"1 - Hamb?rguer-------R$" + item1);
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
                  //condicao para verificar se foi digitado um c?digo v?lido
                  else{
                     System.out.println("\n"+"C?DIGO INV?LIDO" + "\n");
                  }
               } 
            }
         }
      }
   }
}
