public interface IFormel {

    default double getFormel(double längd, String typ){
        double palmFormel = 0.5 * längd;
        double kaktusFormel = 0.02;
        double köttättandeFormel = 0.1 + (0.2 * längd);
        String palm = "Palm", kaktus = "Kaktus", köttätandeVäxt = "KöttätandeVäxt";
        double returVärde = 0;
        if (typ.equals(palm))
            returVärde = palmFormel;
        else if (typ.equals(kaktus))
            returVärde = kaktusFormel;
        else if (typ.equals(köttätandeVäxt))
            returVärde = köttättandeFormel;
        return returVärde;
    }
}