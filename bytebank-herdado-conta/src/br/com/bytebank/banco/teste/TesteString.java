package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		int a = 3;
		String nome = "Alura"; //Sintaxe chamada de object literal
//		String outro = new String("Alura");

		String nomenovo = nome.replace("A", "a");
		
		System.out.println(nomenovo);
	}

}
