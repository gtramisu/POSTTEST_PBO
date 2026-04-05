import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Booking> listBooking = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Silahkan pilih menu nya ꉂ(˵˃ ᗜ ˂˵): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBooking();
                    break;

                case 2:
                    lihatBooking();
                    break;

                case 3:
                    updateBooking();
                    break;

                case 4:
                    hapusBooking();
                    break;

                case 5:
                    System.out.println("Okayy program nya selesai, terimakasih >⩊<");
                    break;

                default:
                    System.out.println("Sorryy menu tidak tersedia .·°՞(っ-ᯅ-ς)՞°·.");
            }

        } while (pilihan != 5);

    }

    static void tampilkanMenu() {

        System.out.println("\n===============────୨ৎ────================");
        System.out.println("  NYXORA - SISTEM BOOKING MAKEUP ARTIST   ");
        System.out.println("=========================================");
        System.out.println("1. Tambah Booking");
        System.out.println("2. Lihat Booking");
        System.out.println("3. Update Booking");
        System.out.println("4. Hapus Booking");
        System.out.println("5. Exit");
        System.out.println("=========================================");

    }

    static void tambahBooking() {

        System.out.println("\n=== Tambah Booking ===");

        System.out.print("ID Booking: ");
        String id = input.nextLine();

        System.out.print("Nama Customer: ");
        String customer = input.nextLine();

        System.out.print("Nama MUA: ");
        String mua = input.nextLine();

        System.out.print("Tanggal: ");
        String tanggal = input.nextLine();

        Booking b = new Booking(id, customer, mua, tanggal);
        listBooking.add(b);

        System.out.println("Yippii Booking berhasil ditambahkan ◝(ᵔᗜᵔ)◜");

    }

    static void lihatBooking() {

        System.out.println("\n=== Data Booking ===");

        if (listBooking.isEmpty()) {

            System.out.println("Aduhh data nya masih kosong (っ- ‸ - ς)");

        } else {

            int no = 1;

            for (Booking b : listBooking) {
                System.out.println("Data ke-" + no++);
                System.out.println("ID Booking : " + b.getIdBooking());
                System.out.println("Customer   : " + b.getNamaCustomer());
                System.out.println("MUA        : " + b.getNamaMUA());
                System.out.println("Tanggal    : " + b.getTanggal());
                System.out.println("-----------------------------");
            }

        }

    }

    static void updateBooking() {

        lihatBooking();

        if (listBooking.isEmpty()) {
            return;
        }

        System.out.print("Pilih nomor booking yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        Booking b = listBooking.get(index - 1);

        System.out.print("Nama Customer baru: ");
        b.setNamaCustomer(input.nextLine());

        System.out.print("Nama MUA baru: ");
        b.setNamaMUA(input.nextLine());

        System.out.print("Tanggal baru: ");
        b.setTanggal(input.nextLine());

        System.out.println("Yeyy booking berhasil diupdate ٩(ˊᗜˋ*)و ♡");

    }

    static void hapusBooking() {

        lihatBooking();

        if (listBooking.isEmpty()) {
            return;
        }

        System.out.print("Pilih nomor booking yang ingin dihapus: ");
        int index = input.nextInt();
        input.nextLine();

        listBooking.remove(index - 1);

        System.out.println("Booking berhasil dihapus ( ˶ˆᗜˆ˵ )");

    }

}