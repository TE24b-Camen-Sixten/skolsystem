public class Elev extends skolperson {
    private int årskurs;
    private String inriktning;

    public Elev(String namn, int årskurs) {
        super(namn);
        if (årskurs < 1) {
            throw new IllegalArgumentException("Ogilltig årskurs");
        }
        this.årskurs = årskurs;
    }

    public void setInriktning(){
        //Gör så man väljer inriktning
    }

    public String getInriktning(){
        return inriktning;
    }
    public int getÅrskurs() {
        return årskurs;
    }
}