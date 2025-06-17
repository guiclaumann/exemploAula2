package exemploAula2;

//public - Modificador de acesso
//class - Palavra reservada para definir que é uma classe
//Televisao - Nome da classe
public class Televisao {
	
	//Definição dos atributos (características)
	private String marca;
	private int tamanho;
	private String cor;
	private int canalAtual;
	private int volumeAtual;
	private boolean estaLigada;
	
	public Televisao(String marca, int tamanho, String cor) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.cor = cor;
		this.canalAtual = 1;
		this.volumeAtual = 10;
		this.estaLigada = false;
	}
	
	public Televisao() {
		
	}
	
	//Definição das ações
	
	//Ação sem retorno para ligar a televisao
	public void ligar() {
		this.estaLigada = true;
	}
	
	//Ação sem retorno para desligar a televisao
	public void desligar() {
		this.estaLigada = false;
	}
	
	//Ação sem retorno para mudar de canal, enviando o número do novo canal
	public void mudarCanal(int novoCanal) {
		this.canalAtual = novoCanal;
	}
	
	public int mudarCanal() {
		this.canalAtual = this.canalAtual + 1;
		return canalAtual;
	}
	
	public void aumentarVolume() {
		this.volumeAtual++; //this.volumeAtual = this.volumeAtual + 1;
	}
	
	public void diminuirVolume() {
		this.volumeAtual--; //this.volumeAtual = this.volumeAtual - 1;
	}
	
	//Ação para imprimir os valores do objeto
	public void imprimirDados() {
		System.out.println("-------------------");
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Canal Atual: " + this.canalAtual);
		System.out.println("Volume Atual: " + this.volumeAtual);
		if (this.estaLigada) {
			System.out.println("A televisão está ligada!");
		} else {
			System.out.println("A televisão está desligada!");
		}
	}

}
