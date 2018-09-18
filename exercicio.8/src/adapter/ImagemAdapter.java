package adapter;

public class ImagemAdapter implements ImagemTarget{
	private Imagem imagem;

	@Override
	public void carregarImagem(Imagem imagem) {
		// TODO Auto-generated method stub
		imagem.carregar();
		
	}

	@Override
	public void desenharImagem(Imagem imagem) {
		// TODO Auto-generated method stub
		imagem.carregar();
		
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}

}
