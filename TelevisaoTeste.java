package exemploAula2;

public class TelevisaoTeste {

	public static void main(String[] args) {
		
		//Instanciar um objeto do tipo Televisao
		Televisao tv1 = new Televisao("CCE", 42, "Vermelha");
//		tv1.cor = "Vermelha";
//		tv1.marca = "CCE";
//		tv1.tamanho = 42;
//		tv1.marca = "LG";
//		tv1.canalAtual = -500;
//		tv1.volumeAtual = 20;
//		tv1.estaLigada = true;
		
		Televisao tv2 = new Televisao("Samsung", 32, "Amarela");
//		tv2.cor = "Amarela";
//		tv2.marca = "Samsung";
//		tv2.tamanho = 32;
//		tv2.canalAtual = 55;
//		tv2.volumeAtual = 15;
//		tv2.estaLigada = false;
		
		tv1.imprimirDados();
		tv2.imprimirDados();
		
		tv1.mudarCanal(29);
		tv1.aumentarVolume();
		tv1.desligar();
		
		tv2.mudarCanal();
		tv2.diminuirVolume();
		tv2.diminuirVolume();
		tv2.ligar();
		
		tv1.imprimirDados();
		tv2.imprimirDados();
	}
	
}
