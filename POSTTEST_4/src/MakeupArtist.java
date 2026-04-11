public class MakeupArtist extends User {

    private String spesialisasi;
    private int harga;

    public MakeupArtist(String id, String nama, String spesialisasi, int harga) {
        super(id, nama);
        this.spesialisasi = spesialisasi;
        this.harga = harga;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public int getHarga() {
        return harga;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Data Makeup Artist ===");
        System.out.println("ID           : " + id);
        System.out.println("Nama         : " + nama);
        System.out.println("Spesialisasi : " + spesialisasi);
        System.out.println("Harga        : " + harga);
    }
}