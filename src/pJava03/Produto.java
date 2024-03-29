package pJava03;

public class Produto {
	
	//atributos
	String nome;
	String marca;
	Float valor;
	
	//contrutores
	Produto(){
		
	}
	
	Produto(String nome){
		this.nome = nome;
	}
	
	Produto(String nome, String marca){
		this.nome = nome;
		this.marca = marca;
	}

	Produto(String nome, String marca, Float valor){
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}
}
