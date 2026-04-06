public class Shaman implements CalcularDano{

    @Override
    public double calcular(double podeDeAtaque) {
        return podeDeAtaque * 1.8;
    }
}
