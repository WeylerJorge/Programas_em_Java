import java.util.Scanner;
public class Exercicio03_Condicao

//Exercicio03

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      //vari�veis utilizadas
      int num;
      double item1, item2, item3, item4, item5;
      
      //atribuindo valores aos itens
      item1 = 30.00;
      item2 = 35.50;
      item3 = 20.50;
      item4 = 10.00;
      item5 = 30.00;
      
      
      //tabela de itens
      System.out.println("Tabela de Itens: " + "\n");
      System.out.println("1 - Hamb�rguer.........R$30,00 " + "\n");
      System.out.println("2 - Cheeseburguer......R$35,50 " + "\n");
      System.out.println("3 - Fritas.............R$20,50 " + "\n");
      System.out.println("4 - Refrigerante.......R$10,00 " + "\n");
      System.out.println("5 - Milk-shake.........R$30,00 " + "\n\n");
      
      //solicitando o numero do item
      System.out.println("Digite um n�mero: " + "\n");
      num=leia.nextInt();    
      
      //condicoes para selecao do produto
      if (num==1)
      {
      System.out.println("\n"+"1 - Hamb�rguer-------R$" + item1);
      }
      if (num==2)
      {
      System.out.println("\n"+"2 - Cheeseburguer-------R$" + item2);
      }
      if (num==3)
      {
      System.out.println("\n"+"3 - Fritas---------R$" + item3);
      }
      if (num==4)
      {
      System.out.println("\n"+"4 - Refrigerante------R$" + item4);
      }
      if (num==5)
      {
      System.out.println("\n"+"5 - Milk-shake--------R$" + item5);
      }
      //condicao para verificar se foi digitado um c�digo v�lido
      if (num<1 || num>5)
      {
         System.out.println("\n"+"C�DIGO INV�LIDO" + "\n");
      }
            
   
   }

}