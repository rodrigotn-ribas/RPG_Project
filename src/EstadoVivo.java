public class EstadoVivo implements EstadoPersonagem {

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(personagem.getNome() + " ataca o inimigo com força total!");
    }
}
