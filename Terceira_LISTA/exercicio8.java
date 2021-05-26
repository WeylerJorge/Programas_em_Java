public class exercicio8
{  
   public static void main (String[] args)
   {         
                  //variáveis atribuidas
      int soma, aux, qtde=0,media,soma2;
      soma=0;
      media=0;
      
      for(int x=1000; x <= 9999; x++)
      {
         soma = (x/100) + (x%100);
         aux = (int)Math.pow(soma,2);
         if (aux==x)
         {
            System.out.println(x + " possui essa caracteristica!");
            qtde++;
            soma=soma+x;
         }
      }
      media = soma/qtde;
      System.out.println(qtde+" números possuem essa característica.");
      System.out.println("A média destes numeros é: " + media);          
   }      
}