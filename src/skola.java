import java.util.ArrayList;

public class skola {
    private String namn;
    private String adress;
    private rektor rektor;
    private ArrayList<klass> skolklasser = new ArrayList<>();

    public skola(String namn, String adress, rektor rektor) {
        this.namn = namn;
        this.adress = adress;
        this.rektor = rektor;
    }

    public void läggTillSkolklass(klass skolklass) {
        skolklasser.add(skolklass);
    }

    public void visaInformation() {
        System.out.println("Skola: " + namn);
        System.out.println("Adress: " + adress);
        System.out.println("Rektor: " + rektor);
        System.out.println("Skolklasser: " + skolklasser);
    }
}