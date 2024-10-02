public class KöttätandeVäxt extends Växt {
    private final String typAvVätska = TypAvVätska.PROTEINDRYCK.getTypAvVätska();
    private final double formelExtra = 0.2;
    private final double formelBas = 0.1;

    public KöttätandeVäxt(String namn, double längd){
        super.setNamn(namn);
        super.setLängd(längd);
    }
    @Override
    public String getTypAvVätska() {
        return typAvVätska;
    }
    @Override
    public double getFormel() {
        return formelBas + (formelExtra * getLängd());
    }
}