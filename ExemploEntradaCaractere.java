import java.io.IOException;//classe para ler caractere

public class ExemploEntradaCaractere
{  
   public static void main (String[] args) throws IOException
   {
   
   //declarando variaveis
    char c;
    
    //entrada de dados
    System.out.println("Digite um caractere:");//lendo um caractere
    c= (char)System.in.read(); //tentar ler um caractere
    
    //saida de dados
    System.out.println("Valor atual de c:"+c);
    
   }//fim main()
}//fim classe