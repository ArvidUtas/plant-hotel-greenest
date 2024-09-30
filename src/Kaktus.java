public class Kaktus extends Växt{
    private final TypAvVätska typAvVätska = TypAvVätska.mineralvatten;
//    private final double formel = 0.02;

    public Kaktus(String namn){
        super.setNamn(namn);
    }

    public TypAvVätska getTypAvVätska() {
        return typAvVätska;
    }
}
