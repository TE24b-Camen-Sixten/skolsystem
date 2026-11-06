import java.util.ArrayList;

public class klass {
    private String namn;
    private ArrayList<elev> elever = new ArrayList<>();
    private ArrayList<String> schema = new ArrayList<>();

    public klass(String namn, ArrayList<String> schema, ArrayList<elev> elever) {
        this.namn = namn;
        this.schema = schema;
        this.elever = elever;
    }

    public void addElev(String namn, int årskurs, String inriktning) {
        elever.add(new elev(namn, årskurs, inriktning));
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public ArrayList<elev> getElever() {
        return elever;
    }

    public void setElever(ArrayList<elev> elever) {
        this.elever = elever;
    }

    public ArrayList<String> getSchema() {
        return schema;
    }

    public void setSchema(ArrayList<String> schema) {
        this.schema = schema;
    }

}
