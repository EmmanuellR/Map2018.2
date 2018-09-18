package adapter;

public class Cliente {
	public static void main(String[] args) {
	ImagemAdapter imagem = new ImagemAdapter();
	Imagem imagemPng = new ImagemPNG();
	Imagem imagemJpeg = new ImagemJpeg();
	
	imagem.carregar(imagemPng);
	imagem.desenharImagem(imagemJpeg);

	}
	

}
