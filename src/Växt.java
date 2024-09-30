public class Växt implements IFormel{
    private String namn;
    private double längd;

    //här var det enums!
    public enum TypAvVätska {kranvatten, mineralvatten, proteindryck;};
    private TypAvVätska typAvVätska;

    public TypAvVätska getTypAvVätska() {
        return typAvVätska;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }
}
