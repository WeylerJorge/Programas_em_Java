import java.util.Scanner;
import java.util.*;

/*
QUEST�O 1 PROVA - WEYLER JORGE DOS SANTOS SILVA. 

Fa�a um menu com repeti��o (utilizando os comandos do .... while e o comando switch ...case  para que o usu�rio escolha dentre as SEGUINTES OP��ES:

1 - o programa dever� escrever: abacaxi.

2- o programa dever� escrever: morango.

3 - o programa dever� escrever: amora.

9 - o programa dever� sair do programa.

*/

public class questao1_prova {
    
   public static void menu(){
      System.out.println(" ______________________________________________________");
      System.out.println("*           Selecione a op��o desejada:                 *");
      System.out.println("|1 - Abacaxi.                                           |");
      System.out.println("|2 - Morango.                                           |");
      System.out.println("|3 - Amora.                                             |");
      System.out.println("|9 - Sair do programa.                                  |");
      System.out.println("*_______________________________________________________*"+"\n");
   }

   public static void abacaxi(){
      System.out.println("\n"+"Voc� Selecionou Abacaxi");
   }
    
   public static void morango(){
      System.out.println("\n"+"Voc� Selecionou Morango.");
   }
    
   public static void amora(){
      System.out.println("\n"+"Voc� selecionou Amora.");
   }
    
   public static void sair(){
      System.out.println("\n"+"Saindo do programa...");
      System.exit(0);
   }
    
   public static void main(String[] args) {
      int opcao;
      Scanner entrada = new Scanner(System.in);
        
      do{
         menu();
         opcao = entrada.nextInt();
            
         switch(opcao){
            case 1:
               abacaxi();
               break;
                
            case 2:
               morango();
               break;
                
            case 3:
               amora();
               break;
                
            case 9:
               sair();
               break;
            
            default:
               System.out.println("Op��o inv�lida.");
         }
      } while(opcao > 18 && opcao < 75);
   }
}