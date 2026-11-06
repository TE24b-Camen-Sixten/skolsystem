public class elev extends skolperson {
    private int årskurs;
    private String inriktning;

    public elev(String namn, int årskurs, String inriktning) {
        super(namn);
        this.inriktning = inriktning;
        if (årskurs < 1 || årskurs > 3) {
            throw new IllegalArgumentException("Ogilltig årskurs");
        }
        this.årskurs = årskurs;
    }

    public String getInriktning(){
        return inriktning;
    }
    public int getÅrskurs() {
        return årskurs;
    }
}