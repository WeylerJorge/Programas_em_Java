import java.util.Scanner;//classe para ler o teclado

public class ExercicioLetraC

{  
   public static void main (String[] args)
   {
   
   Scanner leia = new Scanner (System.in);
   //declarando variaveis
    double x,y;
     
     System.out.println("Insira o valor de X");
     x=leia.nextInt();
     System.out.println("Insira o valor de Y");
     y=leia.nextInt();
     
     if (x>y){
      System.out.println("X é maior que Y");
     }
     else if (y>x){
      System.out.println("Y é maior que X");
     }
     else if(x==y){
      System.out.println("X é igual a Y");
     }
     else{
      System.out.println("ERRO");
     }

    
   }//fim main()
}//fim classe