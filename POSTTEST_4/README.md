# ── ⋆⋅☆⋅⋆ ── Sistem Booking Makeup Artist ── ⋆⋅☆⋅⋆ ──

### Posttest 4 - Praktikum Pemrograman Berorientasi Objek (PBO)

---

## ⸜(｡˃ ᵕ ˂ )⸝♡ Deskripsi Program

Program **Sistem Booking Makeup Artist** adalah aplikasi berbasis **console** yang dibuat menggunakan bahasa pemrograman **Java** dengan konsep **Object-Oriented Programming (OOP)**.

Program ini digunakan untuk mengelola data **booking jasa makeup artist** dengan fitur **CRUD (Create, Read, Update, Delete)**.
Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data booking melalui menu yang tersedia di program.

Pada **Posttest 4**, program ini dikembangkan dengan menambahkan **konsep Polymorphism (Overloading dan Overriding)**.

---

## (˶˃𐃷˂˶) Tujuan Program

Tujuan dari pembuatan program ini adalah untuk:

* Menerapkan konsep **Encapsulation**
* Menggunakan Access **Modifier**
* Mengimplementasikan **Getter dan Setter**
* Menerapkan konsep **Inheritance**
* Menerapkan konsep **Polymorphism**
* Mengelola data booking menggunakan konsep **OOP**

---

## ◝(ᵔᗜᵔ)◜ Konsep OOP yang Digunakan

Pada **Posttest 3**, program ini menerapkan konsep:

🔹 Encapsulation
- Mengubah atribut pada class menjadi **private/protected**
- Mengakses data menggunakan **getter**
- Mengubah data menggunakan **setter**

🔹Inheritance
- Menggunakan keyword **extends**
- Membuat hubungan antar class dengan konsep **is-a**

🔹 Polymorphism

**1. Overloading (Static Polymorphism)**
- Method dengan nama sama tetapi parameter berbeda

Contoh:
public Booking(String id, String customer, String mua, String tanggal)
public Booking(String id, String customer, String mua, String tanggal, String catatan)

public void setTanggal(String tanggal)
public void setTanggal(int hari, int bulan, int tahun)

**2. Overriding (Dynamic Polymorphism)**
- Method dari superclass ditulis ulang di subclass

Contoh:
// di superclass
public void tampilInfo()

// di subclass
@Override
public void tampilInfo()

---

## (∩˃o˂∩)♡ Penjelasan Class

### 1️⃣ Main.java

Class utama yang berfungsi untuk menjalankan program dan menampilkan menu kepada pengguna.

### 2️⃣ Booking.java

Class yang menyimpan data booking seperti:

* ID Booking
* Nama Customer
* Nama Makeup Artist
* Tanggal Booking

Pada class ini diterapkan **Encapsulation dan Overloading (constructor & method)**.

### 3️⃣ Customer.java (subclass)

Class yang menyimpan data customer seperti:

* ID Customer
* Nama Customer
* Nomor HP

Pada class ini diterapkan **Inheritance dan Overidding**.

### 4️⃣ MakeupArtist.java (subclass)

Class yang menyimpan data makeup artist seperti:

* ID MUA
* Nama MUA
* Spesialisasi
* Harga layanan

Pada class ini diterapkan **Inheritance dan Overidding**.

### 5️⃣ User.java (superclass)

Class induk yang menyimpan data umum:

* ID
* Nama

Memiliki method **tampilInfo()** → dioverride oleh subclass

---

## (˶˃𐃷˂˶) Tipe Inheritance yang Digunakan
Program ini menggunakan **Hierarchical Inheritance**, yaitu satu superclass *(User)* memiliki lebih dari satu subclass *(Customer dan MakeupArtist)*.

---

## ദ്ദി◝ ⩊ ◜.ᐟ Fitur Program

Program ini memiliki beberapa fitur utama:

1. **Create Booking**
   Menambahkan data booking baru.

2. **Read Booking**
   Menampilkan daftar booking yang tersedia.

3. **Update Booking**
   Mengubah data booking yang sudah ada.

4. **Delete Booking**
   Menghapus data booking dari sistem.

---

## (*ᴗ͈ˬᴗ͈)ꕤ*.ﾟ Tampilan Program

### Menu Utama

![Menu Program](assets/menu.png)

### Menambah Booking

![Tambah Booking](assets/tambah_booking.png)

### Menampilkan Data Booking

![Data Booking](assets/lihat_booking.png)

### Mengedit Data Booking
![Edit Booking](assets/update_booking.png)

### Menghapus Data Booking
![Hapus Booking](assets/hapus_booking.png)

### Exit Sistem Data Booking
![Exit Booking](assets/exit_booking.png)

---

## ₍^. .^₎Ⳋ  Identitas

Nama : Gadis Wulandari

NIM : 2409106026

Kelas : A'2 2024

---

## (๑ᵔ⤙ᵔ๑) Kesimpulan

Program ini merupakan pengembangan dari **Posttest 3** dengan menambahkan konsep **Polymorphism** dalam OOP.

Dengan adanya Polymorphism, program menjadi lebih **fleksibel**, Mengurangi **duplikasi kode**, Mempermudah pengembangan program.

---

ദ്ദി(˵ •̀ ᴗ - ˵ ) ✧ Dibuat untuk memenuhi tugas **Posttest 4 Praktikum PBO**
