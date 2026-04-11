public class Customer extends User {

    private String noHp;

    public Customer(String id, String nama, String noHp) {
        super(id, nama);
        this.noHp = noHp;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Data Customer ===");
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("No HP: " + noHp);
    }
}