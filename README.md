# Latihan Overloading Method & Constructor

## Deskripsi Soal ##

Misalkan didalam sebuah struktur data menyimpan data yang mempunyai struktur seperti ini

```
[
  {nik: 101, nama: "Paijo", gajiPokok: 2000, tunjangan: 1000, bonus: 500, denda: 200},
  {nik: 102, nama: "Lala", gajiPokok: 1750, tunjangan: 900, bonus: 500, denda: 200},
  {nik: 103, nama: "Lulu", gajiPokok: 2150, tunjangan: 1000, bonus: 300, denda: 375},
  {nik: 104, nama: "Sabar", gajiPokok: 1500, tunjangan: 750, bonus: 600, denda: 200},
  {nik: 105, nama: "Sule", gajiPokok: 2500, tunjangan: 850, bonus: 500, denda: 300},
  {nik: 106, nama: "Paiman", gajiPokok: 1500, tunjangan: 350, bonus: 450, denda: 250},
  {nik: 107, nama: "Ponimin", gajiPokok: 2000, tunjangan: 1000, bonus: 500, denda: 200},
  {nik: 108, nama: "Sutiman", gajiPokok: 1500, tunjangan: 1250, bonus: 500, denda: 300},
  {nik: 109, nama: "Raja", gajiPokok: 1000, tunjangan: 1000, bonus: 500, denda: 200},
  {nik: 110, nama: "Harry", gajiPokok: 2250, tunjangan: 1000, bonus: 200, denda: 200}
]
```

Buatlah class yang bertujuan untuk mengambil semua/sebagian data dari "database" diatas dengan kerangka method dibawah.

Method | Fungsi
-------|-------
get() | Mengambil semua data dari database
get(int id) | Mengambil salah satu data berdasarkan id
get(String columnName, Object value) | Mengambil semua data dengan nilai columnName = value
get(String columnName, String operator, Object value) | Mengambil semua data dengan nilai columnName 'operator' value

Contoh penggunaan

```
db.get() // mengambil semua data
db.get(104) // mengambil data dengan id=104
db.get("gajiPokok", 2000) // mengambil semua data yang memiliki gajiPokok = 2000
db.get("tunjangan", "<=", 1000) // mengambil semua data yang memiliki tunjangan <= 1000
db.get("bonus", ">", 450) // mengambil semua data yang memiliki bonus > 450
```

## Prosedur Pengumpulan ##

* Baca dahulu ketentuan umum pengumpulan tugas [disini](https://github.com/prakpl-IF-O/tugas).
* Fork dahulu repository ini ke akun Github masing-masing.
* Lakukan clone dari repo hasil forking, lalu open project pada hasil clone, lakukan coding di Netbeans sesuai spesifikasi tugas yang telah ditentukan.
* Simpan screenshoot dari hasil run program dalam folder `ss/`
* Edit dahulu file PERNYATAAN.md, isi sesuai biodata.
* Lakukan commit dan push TIAP KALI melakukan perubahan dalam code SEBELUM deadline berakhir, jika hanya melakukan commit dan push hanya sekali dan perubahan yang sangat besar, akan memengaruhi penilaian.
* Deadline 22 Maret 2016 pukul 00.01, jika ada salah satu commit yang melampaui tanggal deadline, maka tidak diikutkan dalam penilaian, alias mendapat 0.
* Setelah menyelesaikan tugas, maka lakukan **Pull Request** untuk dilakukan penilaian. Setelah mengirim pull request, Anda tidak diperkenankan mengubah lagi isi dari repository.
* **Tidak ada toleransi duplikasi**, jika terdeteksi maka akan mendapat nilai 0 bagi semua yang terlibat.
