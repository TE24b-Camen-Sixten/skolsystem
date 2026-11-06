import java.lang.reflect.Array;
import java.util.ArrayList;

public static void main(){
    rektor rektorn = new rektor("Linda");
    skola skolan = new skola("NTI", "Crafords väg 42", rektorn);
    elev elev1 = new elev("PO", 3, "Teknik");
    elev elev2 = new elev("Sixten", 3, "Teknik");
    elev elev3 = new elev("Otto", 2, "Ekonomi");
    elev elev4 = new elev("Alex", 2, "Ekonomi");
    klass klass1 = new klass("TE24B", new ArrayList<String>(Arrays.asList("matte", "programmering")), new ArrayList<elev>(Arrays.asList(elev1, elev2)));
    klass klass2 = new klass("EK25C", new ArrayList<String>(Arrays.asList("Företagsekonomi", "Lekstund/Rast")), new ArrayList<elev>(Arrays.asList(elev3, elev4)));
    lärare läraren = new lärare(new ArrayList<klass>(Arrays.asList(klass1, klass2)), new ArrayList<>(Arrays.asList("Matte", "Företagsekonomi")), "Tony");
}
