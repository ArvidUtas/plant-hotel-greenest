public class Kaktus extends Växt{
    private final String typAvVätska = TypAvVätska.MINERALVATTEN.getTypAvVätska();
    private final double formel = 0.2;

    public Kaktus(String namn){
        super.setNamn(namn);
    }
    @Override
    public String getTypAvVätska() {
        return typAvVätska;
    }
    @Override
    public double getFormel() {
        return formel;
    }
}