public class KöttätandeVäxt extends Växt {
    private final TypAvVätska typAvVätska = TypAvVätska.proteindryck;
//    private double formel = 0.1 + (0.2 * getLängd());

    public KöttätandeVäxt(String namn, double längd){
        super.setNamn(namn);
        super.setLängd(längd);
    }

    public TypAvVätska getTypAvVätska() {
        return typAvVätska;
    }
}
