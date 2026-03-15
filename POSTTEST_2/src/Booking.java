public class Booking {

    private String idBooking;
    private String namaCustomer;
    private String namaMUA;
    private String tanggal;

    public Booking(String idBooking, String namaCustomer, String namaMUA, String tanggal) {
        this.idBooking = idBooking;
        this.namaCustomer = namaCustomer;
        this.namaMUA = namaMUA;
        this.tanggal = tanggal;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public String getNamaMUA() {
        return namaMUA;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public void setNamaMUA(String namaMUA) {
        this.namaMUA = namaMUA;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}