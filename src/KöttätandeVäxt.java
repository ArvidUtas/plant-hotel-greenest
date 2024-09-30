public class KöttätandeVäxt extends Växt {
    private final TypAvVätska typAvVätska = TypAvVätska.proteindryck;

    public KöttätandeVäxt(String namn, double längd){
        super.setNamn(namn);
        super.setLängd(längd);
    }
    @Override
    public TypAvVätska getTypAvVätska() {
        return typAvVätska;
    }
}