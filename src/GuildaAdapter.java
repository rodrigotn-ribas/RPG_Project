public class GuildaAdapter implements SistemaGuilda{
    private SistemaGuildaAPI legado;

    public GuildaAdapter(SistemaGuildaAPI legado){
        this.legado = legado;
    }

    @Override
    public void adicionarMembro(String nomeJogador) {
        legado.addPlayerToGuildLegacy("Server_RjBR", nomeJogador);
    }
}
