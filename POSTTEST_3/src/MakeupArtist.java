public class MakeupArtist extends User {

    private String spesialisasi;
    private int harga;

    public MakeupArtist(String id, String nama, String spesialisasi, int harga) {
        super(id, nama); // ambil dari parent
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
}