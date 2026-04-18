public class Customer extends User implements Transaksi {

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

    @Override
    public void prosesBooking() {
        System.out.println("Customer sedang melakukan booking nihh...");
    }

    @Override
    public void tampilRingkasan() {
        System.out.println("Ringkasan Customer: " + nama);
    }
}