import java.util.ArrayList;

public class lärare extends skolperson{
    private ArrayList<klass> klasser;
    private ArrayList<String> ämnen;

    public lärare(ArrayList<klass> klasser, ArrayList<String> ämnen, String namn) {
        super(namn);
        this.klasser = new ArrayList<>(klasser);
        this.ämnen = new ArrayList<>(ämnen);
    }

    public ArrayList<klass> getKlasser() {
        return klasser;
    }

    public void setKlasser(ArrayList<klass> klasser) {
        this.klasser = klasser;
    }

    public ArrayList<String> getÄmnen() {
        return ämnen;
    }

    public void setÄmnen(ArrayList<String> ämnen) {
        this.ämnen = ämnen;
    }
}
