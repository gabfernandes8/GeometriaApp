package br.senai.sp.model;

public class Triangulo {
	
	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	public void exibirDados(){
		
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println(nome);
		System.out.println("-------------------------------");
		System.out.println("A Altura é: " + altura);
		System.out.println("A Base é: " + base);
		System.out.println("O Lado C é: " + ladoC);
		System.out.println("O Lado B é: " + ladoB);
		System.out.println("");
	}
	
}
