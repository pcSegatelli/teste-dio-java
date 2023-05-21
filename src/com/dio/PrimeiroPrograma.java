package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {
 
	public static void main(String[] args) {
		int a =2;
		int h =3;
		System.out.println("Hello-World! "+(a+h));
	
		Gato gato = new Gato();	
		Livros livros = new Livros();	
		
		System.out.println(gato);
		System.out.println(livros);
	}
}
	
	class Livros{
		private String nome;
		private String npag;
}
	
