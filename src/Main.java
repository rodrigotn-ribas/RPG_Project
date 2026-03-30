public class Main {
    public static void main(String[] args) {
        // ... criação do personagem, etc ...
        // TODO 0 : Facilitar o trabalho do desenvolvedor Main
        // ERRO: Para iniciar uma fase (Masmorra), o desenvolvedor do arquivo Main
        // precisa conhecer e chamar manualmente diversos serviços complexos.
        System.out.println("--- Iniciando Masmorra ---");
        MotorDeAudio audio = new MotorDeAudio();
        CarregadorDeCenario cenario = new CarregadorDeCenario();
        GeradorDeMonstros monstros = new GeradorDeMonstros();

        audio.tocarMusica("boss_theme.mp3");
        cenario.carregar("Caverna do Dragão");
        monstros.invocar(10);
    }
}