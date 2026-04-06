public class LogServidor implements ObserverMorte{
    public void registrar(String s) {
        System.out.println("Registrando -> " + s);
    }

    @Override
    public void reagirMorte(Personagem personagem) {
        registrar(personagem.getNome());
    }
}
