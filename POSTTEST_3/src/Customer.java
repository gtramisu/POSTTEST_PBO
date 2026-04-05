public class Customer extends User {

    private String noHp;

    public Customer(String id, String nama, String noHp) {
        super(id, nama); // ambil dari parent
        this.noHp = noHp;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}