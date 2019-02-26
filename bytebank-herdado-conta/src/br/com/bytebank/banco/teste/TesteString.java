package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		int a = 3;

		String nome = "Alura";
		String vazio = "";
		String espaco = " ";

		//String outro = new String("Alura");
		char c = 'A';
		char d = 'a';

		//String outra = nome.replace("A", "a");
		String outra = nome.replace(c, d);
		char e = nome.charAt(2);
		int pos = nome.indexOf("ur");
		String sub = nome.substring(1);
		int len = nome.length();

		for(int i=0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		//String outra = nome.toLowerCase();
		//String outra = nome.toUpperCase();

		System.out.println(nome);
		System.out.println(outra);
		System.out.println(e);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(len);
		System.out.println(vazio.isEmpty());
		System.out.println(espaco.trim().isEmpty());
		System.out.println(nome.contains("Alura"));
	}
}
