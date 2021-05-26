import java.util.Scanner;
public class ExercicioNumero5

{  
   public static void main (String[] args)
   {
      Scanner leia = new Scanner (System.in);
   //declarando variaveis
      double professores,portugues,resultado,porcentagem;
    
      System.out.println("\n---------------------------------------------------------");
      System.out.println("CALCULANDO PROFESSORES");
      System.out.printf("%s%n%n","---------------------------------------------------------");
    
      System.out.println("Quantos professores tem nessa escola?");
      professores=leia.nextDouble();
      System.out.println("Qual a porcentagem de professores que ensinam português nessa escola?");
      portugues=leia.nextDouble();
      
      //descobre o número de professores que dão aulas de português.
      porcentagem=professores*(portugues/100);
      //subtrai o numero de professores que dão aulas de português do número TOTAL de professores da escola.
      resultado=professores-porcentagem;
      
      //script para aguardar pressionar a tecla enter para prosseguir com a operação.
      while(true) {
         String input = leia.nextLine();
         if( !input.equals("") ) {}
         else {
                     //aperte enter para continuar(OPERAÇÕES)
            System.out.println("\n---------------------------------------------------------");
            System.out.println("PRESSIONE ENTER PARA CONTINUAR PARA MOSTRAR O RESULTADO");
            System.out.printf("%s%n","---------------------------------------------------------");
            leia.nextLine();
            break;
         }
      }
      
      System.out.printf("O número de professores que ensinam outras matérias é: %2.0f%n",resultado);
    
   }//fim main()
}//fim classe