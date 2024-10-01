public class Kaktus extends Växt{
    private final TypAvVätska typAvVätska = TypAvVätska.mineralvatten;

    public Kaktus(String namn){
        super.setNamn(namn);
    }
    @Override
    public TypAvVätska getTypAvVätska() {
        return typAvVätska;
    }
    @Override
    public double getFormel() {
        return 0.02;
    }
}