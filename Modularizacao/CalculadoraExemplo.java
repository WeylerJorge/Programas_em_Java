import java.io.IOException;
import java.util.Scanner;
public class CalculadoraExemplo
{  private static Scanner leia = new Scanner (System.in);
   public static void main (String[] args) throws IOException
   {
   
      Scanner leia = new Scanner (System.in);
   
      int op;
      char c;
      do
      {
         menu();
         System.out.println("\n"+"Escolha:"+"\n");
         op= leia.nextInt();
         switch (op)
         {
            case 1:
               somaValores();
               break;
            case 2:
               subtraiValores();
               break;
            case 3:
               multiplicaValores();
               break;
            case 4:
               divideValores();
               break;
            case 5:
               mediaValores();
               break;
         }
         if (op!=9){
            System.out.println("Voc� escolheu sair...Tecle <Enter> para continuar!");
            c= (char)System.in.read(); 
         }
      } while (op!=9);  
   }
   public static void menu() {
      System.out.println("Calculadora:" + "\n");
      System.out.println("1 - Adi��o");
      System.out.println("2 - Subtra��o");
      System.out.println("3 - Multiplica��o");
      System.out.println("4 - Divis�o");
      System.out.println("5 - M�dia");
      System.out.println("9 - Sair do sistema");
   }
   public static void somaValores () {
      System.out.println("Voc� selecionou soma!");
      int a,b;
      double soma;
      System.out.println("Digite o primeiro valor:");
      a= leia.nextInt();
      System.out.println("Digite o segund valor:");
      b= leia.nextInt();
      soma=a+b;
      System.out.println("A soma de "+a+" + "+b+ " e igual a "+soma);
   }
   public static void subtraiValores () {
      System.out.println("Voc� selecionou subtra��o!");
      //declarando variaveis
      int a,b;
      double sub;
    //entrada de dados
      System.out.println("Digite o primeiro valor: ");
      a=leia.nextInt();
      System.out.println("Digite o segundo valor: ");
      b=leia.nextInt();
      sub=a-b;
    //saida de dados
      System.out.printf("A subtra��o de "+a+" - "+b+" igual a "+sub);
   }
   public static void multiplicaValores () {
      System.out.println("Voc� selecionou multiplica��o!");
         //declarando variaveis
      int a,b;
      double mult;
    //entrada de dados
      System.out.println("Digite o primeiro valor: ");
      a=leia.nextInt();
      System.out.println("Digite o segundo valor: ");
      b=leia.nextInt();
      mult=a*b;
    //saida de dados
      System.out.printf("A multiplica��o de "+a+" X "+b+" igual a "+mult);
   } 
   public static void divideValores () {
      System.out.println("Voc� selecionou divis�o!");
      //declarando variaveis
      int a,b;
      double div;
    //entrada de dados
      System.out.println("Digite o valor de A: ");
      a=leia.nextInt();
      System.out.println("Digite o valore de B: ");
      b=leia.nextInt();
      div=(double)a/b;
    //saida de dados
      System.out.printf("A divis�o de "+a+" / "+b+" igual a "+div);
   }
   public static void mediaValores(){
      System.out.println("Voc� selecionou m�dia!");  
   //declarando variaveis
      int a,b;
      double m;
    //entrada de dados
      System.out.println("Digite o primeiro valor: ");
      a=leia.nextInt();
      System.out.println("Digite o segundo valor: ");
      b=leia.nextInt();
      m=(a+b)/2.0;
    //saida de dados
      System.out.printf("A media de "+a+" e "+b+" igual a "+m);
   }

}
