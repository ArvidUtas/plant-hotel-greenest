public class Palm extends Växt{
    private final TypAvVätska typAvVätska = TypAvVätska.kranvatten;

    public Palm(String namn, double längd){
        super.setNamn(namn);
        super.setLängd(längd);
    }
    @Override
    public TypAvVätska getTypAvVätska() {
        return typAvVätska;
    }
    @Override
    public double getFormel() {
        return 0.5 * getLängd();
    }
}