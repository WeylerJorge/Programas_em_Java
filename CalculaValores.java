import java.util.Scanner;//classe para ler o teclado

public class CalculaValores

{  
   public static void main (String[] args)
   {
   //LETRA A e B
   System.out.println("LETRA A e LETRA B");
   
   Scanner leia = new Scanner (System.in);
   //declarando variaveis
    boolean a,b;
   //letra a
    a=2>3;
    System.out.println("Resultado letra a="+a);
    
   //letra b
    b=4==4;
    System.out.println("Resultado letra b="+b);
    
       //aperte enter para continuar
   System.out.println("\n---------------------------------------------------------");
   System.out.print("PRESSIONE ENTER PARA CONTINUAR PARA AS PROXIMAS OPERACOES");
   System.out.println("\n---------------------------------------------------------");
          leia.nextLine();
          
     double x,y;
     
     System.out.println("Insira o valor de X");
     x=leia.nextInt();
     System.out.println("Insira o valor de Y");
     y=leia.nextInt();
        System.out.printf("%s%n","---------------------------------------------------------");
     
     if (x>y){
      System.out.println("X é maior que Y");
      System.out.printf("%s%n","---------------------------------------------------------");
     }
     else if (y>x){
      System.out.println("Y é maior que X");
      System.out.printf("%s%n","---------------------------------------------------------");
     }
     else if(x==y){
      System.out.println("X é igual a Y");
      System.out.printf("%s%n","---------------------------------------------------------");
     }
     else{
      System.out.println("ERRO");
     }

       //aperte enter para continuar(OPERAÇÕES)
   System.out.println("\n---------------------------------------------------------");
   System.out.println("PRESSIONE ENTER PARA CONTINUAR PARA AS PROXIMAS OPERACOES");
   System.out.printf("%s%n%n%n","---------------------------------------------------------");
          leia.nextLine();
          
     double x1,y1,A,resultado1,resultado2;
    
     System.out.println("Insira o valor de X");
     x1=leia.nextInt();
     System.out.println("Insira o valor de Y");
     y1=leia.nextInt();
     System.out.println("Insira o valor de A");
     A=leia.nextInt();
     
     resultado1=Math.pow(x1,2)-Math.pow(y1,3);
     resultado2=Math.pow(x1,A+4);
     
     
     if (resultado1>resultado2){
      System.out.println("Resultado1 é maior que Resultado2");
     }
     else{
      System.out.println("Resultado1 é menor ou igual que Resultado2");
     }
     
   }//fim main()
}//fim classe