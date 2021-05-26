import java.util.Scanner;//classe para ler o teclado

public class CalcularVolume

{  
   public static void main (String[] args)
   {
   Scanner leia = new Scanner (System.in);
   //declarando variaveis
    double diametro, pi, raio, area, volume;
    pi=3.14;
    
    //calculando a área
    System.out.println("CALCULANDO A AREA DE UMA ESFERA");
    System.out.print("Digite o diametro da esfera: ");
    diametro=leia.nextInt();
    raio=diametro/2;
    System.out.println("O raio da esfera é: " +raio);
    area=4 * pi * Math.pow(raio,2);
    System.out.println("A área da esfera é: " +area);
    
    //calculando o volume
    System.out.println("CALCULANDO O VOLUME DE UMA ESFERA");
    System.out.println("O raio da esfera é: " +raio);
    volume=(4 * pi * Math.pow(raio,3))/3;
    System.out.printf("Valor de volume:%1.2f.%n" ,volume);

    
   }//fim main()
}//fim classe