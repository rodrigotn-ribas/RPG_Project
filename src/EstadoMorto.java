public class EstadoMorto implements EstadoPersonagem{

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(personagem.getNome() + "Personagens mortos não atacam.");
    }
}
