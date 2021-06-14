import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int i=0;
	int num;
	int result;
	System.out.println("Entre com um numero para receber a tabuada do 1 ao 10");
	num = leitor.nextInt();
	while(i<10) {
		i=i+1;
		result = num*i;
		System.out.println(i+" x "+num+" = "+result);
	}

	}

}
