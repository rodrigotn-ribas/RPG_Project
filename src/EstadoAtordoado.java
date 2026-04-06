public class EstadoAtordoado implements EstadoPersonagem{
    @Override
    public void atacar(Personagem personagem) {
        System.out.println(personagem.getNome() + " está tonto e não consegue atacar!");
    }
}
