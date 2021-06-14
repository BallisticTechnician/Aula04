import java.util.Scanner;
public class Senha42 {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int senha=0;
	while(!(senha==42)) {
		System.out.println("Entre com a senha :");
		senha = leitor.nextInt();
		
	}
	System.out.println("Até que enfim acertou a senha");
}
}