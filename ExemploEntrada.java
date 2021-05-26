import java.util.Scanner;//classe para ler o teclado

public class ExemploEntrada
{  
   public static void main (String[] args)
   {
      //entrada de dados
      Scanner leia = new Scanner (System.in);
      
      //declaracoes de variaveis
      int a;//variavel a para inserir um valor inteiro(int)
      double b;//variavel b para inserir um valor booleano(double)
      String nome;//variavel nome para inserir uma palavra string
      String linha;//variavel linha para inserir um texto string
      
      //entrada de dados
      System.out.println("Informe um valor para a:");
      a= leia.nextInt();//le o valor de a
      System.out.println("Informe um valor para b:");
      b= leia.nextDouble();//le o valor de b
      System.out.println("Informe um valor para nome:");
      nome= leia.next();//le o valor de nome
      leia.nextLine();//limpa o buffer de entrada
      System.out.println("Informe uma linha: ");
      linha= leia.nextLine();//le o valor de linha
      
      //saida de dados
      System.out.println("Valor de a:"+a+".");
      System.out.printf("Valor de b:%4.2f.%n",b);
      System.out.printf("%s%s%s%n","Valor de nome: ",nome,".");
      System.out.printf("valor de linha:"+linha);
      //fim
   }
}