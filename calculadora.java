import java.util.Scanner;
// Sou lindo!
public class calculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("1 - somar");
		System.out.println("2 - subtrair");
		System.out.println("3 - multiplicar");
		System.out.println("4 - dividir");
		System.out.println("Escolha uma opção: ");
		int opcao = teclado.nextInt();
		
		switch(opcao) {
		case 1:{
			System.out.println("Informe o primeiro número: ");
			double numero1 = teclado.nextDouble();
			System.out.println("Informe o segundo número: ");
			double numero2 = teclado.nextDouble();
			System.out.println("O valor da soma é: " + (numero1 + numero2));
			break;
		}
		case 2:{
			System.out.println("Informe o primeiro número: ");
			double numero1 = teclado.nextDouble();
			System.out.println("Informe o segundo número: ");
			double numero2 = teclado.nextDouble();
			System.out.println("O valor da subtração é: " + (numero1 - numero2));
			break;
		}
		case 3:{
			System.out.println("Informe o primeiro número: ");
			double numero1 = teclado.nextDouble();
			System.out.println("Informe o segundo número: ");
			double numero2 = teclado.nextDouble();
			System.out.println("O valor da multiplicação é: " + (numero1 * numero2));
			break;
		}
		case 4:{
			System.out.println("Informe o primeiro número: ");
			double numero1 = teclado.nextDouble();
			System.out.println("Informe o segundo número: ");
			double numero2 = teclado.nextDouble();
			System.out.println("O valor da divisão é: " + (numero1 / numero2));
			break;
		}
		default: {
			System.out.println("Você selecionou uma opção inválida! ");
		}
		teclado.close();
    }
}
}