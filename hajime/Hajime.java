package hajime;
import java.util.Scanner;
        
public class Hajime{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float peso, altura, imc;
        String nome;
        
        System.out.print("Qual é seu nome: ");
        nome = ent.nextLine();
        System.out.print("Digite seu Peso: ");          
        peso = ent.nextFloat();
        System.out.print("Digite sua Altura: ");
        altura = ent.nextFloat(); 
        imc = peso/(altura*altura);
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu IMC é: " + imc );
        
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } 
        else if(18.5 < imc && imc <= 25){
            System.out.println("Peso normal");
        }
        else if(25 < imc && imc <= 30){
            System.out.println("Gordinho");
        }
        else if(30 < imc && imc <= 35){
            System.out.println("Mó Gordão KKKKK");
        }
        else if(35 < imc && imc <= 40){
            System.out.println("dentre os 5 gordos que eu conheço, você é 4 deles");
        }
        else if (imc > 40){
            System.out.println("dentre os 5 gordos que eu conheço, você é 4 deles");
        }
        
    }
    
}
