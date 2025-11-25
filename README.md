# 🍽️ Sistem Manajemen Restoran (Java CLI)

Sistem manajemen restoran berbasis **Command Line Interface (CLI)** yang dibangun menggunakan bahasa **Java**. 

Proyek ini menerapkan konsep **Object-Oriented Programming (OOP)** seperti *Inheritance*, *Polymorphism*, *Encapsulation*, dan *Abstraction*.

Sistem ini menggunakan **File I/O** (file `.txt`) sebagai database sederhana untuk menyimpan data.

---

## ✨ Fitur Utama

Sistem dibagi berdasarkan peran pengguna (*Role*):

### 👤 Customer
* **Registrasi & Login:** Membuat akun baru atau masuk dengan akun lama.
* **Lihat Menu:** Melihat daftar makanan dan minuman beserta harganya.
* **Buat Pesanan:** Memesan makanan/minuman dan memilih nomor meja.
* **Bayar Mandiri:** Melihat tagihan (*bill*) dan memilih metode pembayaran (Cash, Card, QRIS).

### 🧑‍🍳 Koki (Chef)
* **Lihat Pesanan Masuk:** Melihat pesanan yang statusnya "Dipesan".
* **Masak:** Mengubah status pesanan menjadi "Selesai Dimasak".
