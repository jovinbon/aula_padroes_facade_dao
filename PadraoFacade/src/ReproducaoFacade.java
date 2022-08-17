
public class ReproducaoFacade {
	
	ArquivoAudio arquivoAudio;
	ArquivoImagem arquivoImagem;
	ArquivoVideo arquivoVideo;
	
	public void configurarSistemas() {
		arquivoAudio = new ArquivoAudio();
		arquivoAudio.configurarCanais();
		arquivoAudio.configurarFrequencia();
		arquivoAudio.configurarVolume();
		
		arquivoImagem = new ArquivoImagem();
		arquivoImagem.renderizarImagem("imagem.jpg");
		
		arquivoVideo = new ArquivoVideo();
		arquivoVideo.configurarResolucao();
	}
	
	public void reproduzirVideo(String arquivo) {
		arquivoVideo.reproduzirVideo(arquivo);
	}


}
