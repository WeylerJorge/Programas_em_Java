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
      System.out.println("Qual a porcentagem de professores que ensinam portugu�s nessa escola?");
      portugues=leia.nextDouble();
      
      //descobre o n�mero de professores que d�o aulas de portugu�s.
      porcentagem=professores*(portugues/100);
      //subtrai o numero de professores que d�o aulas de portugu�s do n�mero TOTAL de professores da escola.
      resultado=professores-porcentagem;
      
      //script para aguardar pressionar a tecla enter para prosseguir com a opera��o.
      while(true) {
         String input = leia.nextLine();
         if( !input.equals("") ) {}
         else {
                     //aperte enter para continuar(OPERA��ES)
            System.out.println("\n---------------------------------------------------------");
            System.out.println("PRESSIONE ENTER PARA CONTINUAR PARA MOSTRAR O RESULTADO");
            System.out.printf("%s%n","---------------------------------------------------------");
            leia.nextLine();
            break;
         }
      }
      
      System.out.printf("O n�mero de professores que ensinam outras mat�rias �: %2.0f%n",resultado);
    
   }//fim main()
}//fim classe