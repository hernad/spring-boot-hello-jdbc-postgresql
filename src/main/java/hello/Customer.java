package hello;

public class Customer {
    private String id, naz;

    public Customer(String id, String naz) {
        this.id = id;
        this.naz = naz;
    }

    @Override
    public String toString() {
        return String.format(
                "Partner[id='%s', naziv='%s']",
                id, naz);
    }

}
