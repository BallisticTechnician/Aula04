import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		Scanner leitor = new Scanner(System.in);
		int idade;
		int quantidade;
		int i=0;
		double media;
		int idadeT = 0;
		System.out.println("Qual a quantidade de alunos ?");
		quantidade = leitor.nextInt();
		
		while (i<quantidade){
			System.out.println("Por favor, digite a idade do aluno :");
			idade = leitor.nextInt();
			i = i+1;
			idadeT = idadeT + idade;
			
		}
		media = idadeT / (double)quantidade ;
		System.out.println("A m�dia da idade � de "+media+" anos");
		leitor.close();
		}

}
