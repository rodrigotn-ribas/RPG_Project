public class Rogue implements CalcularDano{

    @Override
    public double calcular(double podeDeAtaque) {
        return podeDeAtaque * 1.5 + 20;
    }
}
