public class skolperson {
    private final String namn;

    public skolperson(String namn) {
        if (namn == null || namn.isBlank()) {
            throw new IllegalArgumentException("Namnet får inte vara tomt.");
        }
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }
}