import java.util.Scanner;

public class atv9 {

        public static void main(String args[]){
            
        //variaveis
        double tempf;
        double tempc;
        Scanner teclado = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Insira a temperatura em Faregheth ");
        tempf = teclado.nextDouble();
        teclado.close();

        //Processamento em dados
        tempc = 5*((tempf-32)/9);

        //Saida de dados

        System.out.print("A temperatura em Celsius é "+ tempc +"");




        
    }
}
