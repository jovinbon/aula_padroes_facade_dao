
public class Tecnico {
	
	public static void main(String[] args) {
		System.out.println(">>>>>> Configurando subsistemas <<<<<");
		ReproducaoFacade repFacade = new ReproducaoFacade();
		repFacade.configurarSistemas();
		System.out.println();
		System.out.println(">>>>>> Utilizando subsistemas <<<<<");
		repFacade.reproduzirVideo("videos_sertanejo.mp4");
	}

}
