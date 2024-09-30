import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public Main() {
        String namnInput;
        Kaktus igge = new Kaktus("Igge");
        Palm laura = new Palm("Laura", 5);
        Palm olof = new Palm("Olof", 1);
        KöttätandeVäxt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);

        List<Växt> allaVäxter = new LinkedList<>() {{
            add(igge);
            add(laura);
            add(olof);
            add(meatloaf);
        }};

        boolean loopaIgen = true;
        while (loopaIgen) {
            namnInput = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (namnInput == null) {
                System.exit(0);
            }
            for (Växt växt : allaVäxter) {
                if (växt.getNamn().equalsIgnoreCase(namnInput)) {
                    JOptionPane.showMessageDialog(null, växt.getNamn() + " ska få " +
                            växt.getFormel(växt.getLängd(), växt.getClass().getName()) + " liter " + växt.getTypAvVätska());
                    loopaIgen = false;
                }
            }
            if (!loopaIgen)
                break;
            else if (namnInput.equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null, "Du måste fylla i ett namn, försök igen");
            else
                JOptionPane.showMessageDialog(null, "Du har fyllt i ett felaktigt namn, försök igen");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}