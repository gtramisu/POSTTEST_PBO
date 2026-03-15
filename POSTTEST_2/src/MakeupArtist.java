public class MakeupArtist {

    private String id;
    private String nama;
    private String spesialisasi;
    private int harga;

    public MakeupArtist(String id, String nama, String spesialisasi, int harga) {
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.harga = harga;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public int getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}