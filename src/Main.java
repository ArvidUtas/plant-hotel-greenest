import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public Main() {
        Växt igge = new Kaktus("Igge");
        Växt laura = new Palm("Laura", 5);
        Växt olof = new Palm("Olof", 1);
        Växt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);

        List<Växt> allaVäxter = new LinkedList<>();
        Collections.addAll(allaVäxter, igge, laura, olof, meatloaf);

        String namnInput;
        while (true) {
            boolean korrekInput = false;
            namnInput = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (namnInput == null) {
                System.exit(0); //Avbryter loopen och programmet. Hindrar krasch vid Cancel
            }
            for (Växt växt : allaVäxter) {
                if (växt.getNamn().equalsIgnoreCase(namnInput)) {
                    JOptionPane.showMessageDialog(null, växt.getNamn() + " ska få " +
                            växt.getFormel() + " liter " + växt.getTypAvVätska()); // POLYMORFISM i metoden getTypAvVätska
                    korrekInput = true;
                }
            }
            if (korrekInput){}
            else if (namnInput.equalsIgnoreCase(""))
                JOptionPane.showMessageDialog(null, "Du måste fylla i ett namn, försök igen");
            else
                JOptionPane.showMessageDialog(null,
                        "Du har fyllt i ett felaktigt namn, försök igen");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}