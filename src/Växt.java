public abstract class Växt implements IDataTillSkärm { //INTERFACE som ÄRVS till subklasserna Palm, Kaktus & KöttätandeVäxt
    //INKAPSLING
    private String namn;
    private double längd;
    private String TypAvVätska;

    public String getTypAvVätska() {
        return TypAvVätska;
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