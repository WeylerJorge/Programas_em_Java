public class exercicio7
{  
   public static void main (String[] args)
   {         
                  //variáveis atribuidas
      int quociente, unidade, dezena, centena, milhar, aux, i=0, cont=0;
         
      for(i=10000; i<=99999; i++)
      {
         quociente=i;
         milhar=quociente/1000;
         centena=quociente%100;
         dezena=centena/10;
         unidade=centena%10;
         aux=unidade*10+dezena;
         if(milhar == aux)
         {
         System.out.println("\n" + i + " é palindromo!" +"\n");
         cont++;
         }
      }
      System.out.println("\n" + "A quantidade de palindromos nessa faixa é:  " + cont +"\n");
         
   }      
}