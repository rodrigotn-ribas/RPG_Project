public class Main {
    public static void main(String[] args) {
       ConexaoServidorRio conexao = ConexaoServidorRio.getInstance();
       conexao.sincronizarDados();

       //Builder
       Personagem heroi = new Personagem
           .PersonagemBuilder("Juca", "Priest")
           .comNivel(50)
           .comMontaria()
           .build();

       //State
        heroi.atacar();
        heroi.setEstadoAtual(new EstadoAtordoado());
        heroi.atacar();

       //Adapter
       SistemaGuilda guilda = new GuildaAdapter(new SistemaGuildaAPI());
       guilda.adicionarMembro(heroi.getNome());

       //Facade
        MasmorraFacade masmorra = new MasmorraFacade();
        masmorra.inicializar("Masmorra do Dragão", 27, "Dragon Theme.mp3");

        //Observer
        MotorDeCombate combate = new MotorDeCombate();
        combate.adicionarObservador(new TelaGameOver());
        combate.adicionarObservador(new LogServidor());
        combate.adicionarObservador(new SistemaConquistas());

        //Strategy
        double dano = combate.calcularDanoBase(new ShadowPriest(), 150);

        System.out.println("Dano " + dano);
        combate.processarMorte(heroi);
    }
}