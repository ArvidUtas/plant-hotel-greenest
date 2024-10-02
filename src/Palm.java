public class Palm extends Växt{
    private final String typAvVätska = TypAvVätska.KRANVATTEN.getTypAvVätska();
    private final double formel = 0.5;

    public Palm(String namn, double längd){
        super.setNamn(namn);
        super.setLängd(längd);
    }
    @Override
    public String getTypAvVätska() {
        return typAvVätska;
    }
    @Override
    public double getFormel() {
        return formel * getLängd();
    }
}