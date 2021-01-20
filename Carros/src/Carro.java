import java.util.Scanner;

public class Carro {
	String nome;
	String marca;
	String placa;
	boolean multa = false;
	String multaCheck;
	int velocidadeMax = 0;
	int velocidadeAtual = 0;
	int velocidadeDB = 0;
	
	public Carro() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira a marca: ");
		marca = teclado.nextLine();
		System.out.print("Insira o nome: ");
		nome = teclado.nextLine();
		System.out.print("Insira a placa: ");
		placa = teclado.nextLine();
		System.out.print("Insira a velocidade m�xima da rua: ");
		velocidadeMax = teclado.nextInt();
		System.out.print("Insira a velocidade que o carro estava: ");
		velocidadeAtual = teclado.nextInt();
		
		velocidadeDB = velocidadeAtual;
		
		while(velocidadeAtual < velocidadeMax) {
			acelerar();
		}
		
		if(velocidadeDB > velocidadeMax) {
			multa = true;
		}
		
		while(velocidadeAtual > velocidadeMax) {
			frear();
		}
		
		teclado.close();		
	}
	
	public void acelerar() {
		velocidadeAtual = velocidadeAtual + 10;
	}
	
	public int frear() {
		velocidadeAtual = velocidadeAtual - 5;
		
		return velocidadeAtual;
	}
	
	public void imprimir() {
		String texto = "";
		
		if(multa == true) {
			multaCheck = "Multado";
		}
		else {
			multaCheck = "Respeitou a velocidade da via";
		}
		
		texto = texto +"\n\nMarca do ve�culo: "+ marca;
		texto = texto +"\nNome do ve�culo: "+ nome;
		texto = texto +"\nPlaca do ve�culo: "+ placa;
		texto = texto +"\nVelocidade m�xima da pista: "+ velocidadeMax;
		texto = texto +"\nVelocidade que o ve�culo estava: "+ velocidadeDB;
		texto = texto +"\nInfra��es: "+ multaCheck;
		
		System.out.print(texto);
	}
}
