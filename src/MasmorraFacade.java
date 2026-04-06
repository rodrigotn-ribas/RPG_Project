public class MasmorraFacade {
    private MotorDeAudio audio;
    private CarregadorDeCenario cenario;
    private GeradorDeMonstros monstros;

    public MasmorraFacade(){
        audio = new MotorDeAudio();
        cenario = new CarregadorDeCenario();
        monstros = new GeradorDeMonstros();
    }

    public void inicializar(String nomeFase, int quantidadeMonstros, String musica){
        System.out.println("Inicializando MASMORRA");
        audio.tocarMusica(musica);
        cenario.carregar(nomeFase);
        monstros.invocar(quantidadeMonstros);
        System.out.println("Masmorra carregado!");
    }
}
