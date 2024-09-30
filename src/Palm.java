public class Palm extends Växt{
    private final TypAvVätska typAvVätska = TypAvVätska.kranvatten;
//    private double formel = 0.5 * getLängd();

    public Palm(String namn, double längd){
        super.setNamn(namn);
        super.setLängd(längd);
    }

    public TypAvVätska getTypAvVätska() {
        return typAvVätska;
    }
}
