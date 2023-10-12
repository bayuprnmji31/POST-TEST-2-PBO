># POST-TEST-2-PBO

Sistem manajemen bimbingan belajar adalah sebuah program Java sederhana yang memungkinkan kita untuk melakukan beberapa operasi dasar, seperti menambahkan, menampilkan, mengubah, dan menghapus data anggota bimbingan belajar. Dalam Program ini memiliki dua jenis anggota, yaitu siswa dan guru, dan mampu menyimpan informasi dasar tentang keduanya.

# Fitur
Program ini memiliki beberapa fitur utama:

`a. Menambahkan Data Anggota Baru:`
  Kita dapat menambahkan sebuah data siswa atau guru baru dengan mengisi informasi yang telah ditentukan.

`b. Menampilkan Data Anggota:` 
Program memungkinkan kita untuk menampilkan data anggota bimbingan belajar, baik siswa maupun guru sesuai kebutuhan.

`c. Mengubah Data Anggota:` 
Disini kita dapat memperbarui data anggota dengan cara  menggunakan ID anggota yang telah ada.

`d. Menghapus Data Anggota:` 
Dan kita juga dapat menghapus data anggota dengan cara memasukkan ID anggota yang ingin dihapus.

# Penggunaan Program
Untuk menjalankan sebuah program, kita dapat mengikuti beberapa langkah sebagai berikut:
Jalankan program dengan menjalankan kelas Main dari IDE Java Anda
Program akan menampilkan menu dengan pilihan yang tersedia:
Pilih 1 untuk menambahkan data anggota baru (siswa atau guru).
Pilih 2 untuk menampilkan data anggota (siswa atau guru).
Pilih 3 untuk mengubah data anggota.
Pilih 4 untuk menghapus data anggota.
Program akan mengarahkan kita melalui langkah-langkah yang telah kita buat.


`Kelas Utama: Main`
Kelas utama Main berfungsi sebagai pengendali program. Itu menampilkan menu, menerima input pengguna, dan memanggil metode yang sesuai untuk melakukan operasi yang dipilih.
<br>
<img width="624" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/66d79a78-58fe-43c9-92fd-6fbd19fb158e">
<br>
<img width="655" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/9cd66ed7-4b2b-43d9-88b1-333f35d3e7ac">
<br>

`Kelas crud`
Kelas crud adalah kelas yang mengelola operasi utama seperti menambahkan, menampilkan, mengubah, dan menghapus data anggota. Ini juga menyimpan data dalam bentuk ArrayList.
<br>
<img width="684" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/f9674d53-1297-4a34-bd0c-db0cace0a4a9">
<br>
<img width="922" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/43a3d455-672f-4f55-a588-bc82d02891e7">
<br>
<img width="912" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/5f4eb76f-3a58-403b-a293-7d0ffa1622d2">
<br>
<img width="689" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/348f4630-6302-459b-8ded-0cc6c9547ef4">
<br>
<img width="740" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/d9caaea5-e17c-487f-b8ae-a0732af62b13">
<br>
<img width="785" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/506306e7-4687-4fca-8ce6-d25461295335">
<br>
<img width="730" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/e8860151-5f00-4e49-98f9-33dcc0860031">
<br>
<img width="789" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/80ca91ba-3068-425a-bee9-07435aae3e34">
<br>
<img width="634" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/8bb15c36-5729-4ce5-a36a-097ce94305a9">
<br>
<img width="634" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/176b4477-6f34-47b8-9b52-abe8a0529b19">
<br>
<img width="510" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/4705925a-8a18-40fa-a564-3261d3df13bf">


`Kelas data_civitas_akademis`
Kelas data_civitas_akademis adalah kelas induk abstrak yang berisi atribut dan metode yang digunakan oleh kelas anak datasiswa dan dataguru.
<br>
<img width="474" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/1037020e-c582-4529-91db-5d6ade90d7e6">
<br>
<img width="741" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/6c935c8b-f7f8-4634-9c54-90d46cacd03d">
<br>
<img width="904" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/813222a2-f7f9-4f7f-845a-98bf3f3089e3">
<br>

`Kelas Anak datasiswa dan dataguru`
Kelas anak datasiswa dan dataguru mewarisi atribut dan metode dari kelas data_civitas_akademis. Mereka menggambarkan siswa dan guru dalam sistem, dengan atribut tambahan yang sesuai dengan masing-masing jenis.

`kelas anak datasiswa' = sebagai child atau warisan dari orangtua
<img width="885" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/6a3889a8-87d4-41d1-92d8-05c4f30b89ce">
<br>
<img width="670" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/fbfbf9d6-f9d2-47fa-b73a-fbea4b109762">

`kelas anak dataguru` = warisan orang tua ke anak
<img width="888" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/84883503-510b-494a-b0fc-26c445f1027a">
<br>
<img width="668" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/6fe60a31-1ce7-412a-ade7-389fcb2860ed">
<br>

# Dokumentasi Output
<br>
`output pilihan`
<br>
<img width="477" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/c83671cc-fc8e-4fe5-8868-e3219874b3b7">
<br>
Pada gambar diatas sebagai progam utama dalam melakukan kegiatan selanjutnya, yaitu tampilan sebuah CRUD.

`output tampilan pilihan 1`
<br>
<img width="385" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/90133967-eecd-4091-bd3d-981aea60eb7f">
<br>
<img width="234" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/e7e716d5-d4ed-44f4-9d25-5795f1e86de3">
<br>
pada gambar diatas salah membuat data baru siswa maupun guru yang menjadi anggota member baru dalam sebuah perusahaan bimbingan belajar yang telah dibuat.

`output tampilan pilihan 2`
<br>
<img width="344" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/71002e70-84ab-4a3e-a98d-ab60385cb6de">
<br>
Pada gambar diatas melakukan menampilkan data yang kita yang telah diinputkan ke dalam array dan memanggil data dalam arraylist.

`output tampilan pilihan 3`
<br>
<img width="372" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/e5919645-f0dc-415f-8c24-da3cb035e963">
<br>
pada gambar diatas adalah program yang ingin dirubah datanya, dengan mengambil id anggota sebagai primarynya untuk akses data yang kita miliki.
`output tampilan pilihan 4`
<br>
<img width="362" alt="image" src="https://github.com/bayuprnmji31/POST-TEST-2-PBO/assets/122213134/a531d1e6-9fd2-4bda-bdb8-a53d91c2db3d">
<br>
pada gambar diatas adalah input pilihan 4 yaitu menghapus sebuah data yang kita miliki dengan cara menghapus melalui id anggota untuk mencari data yang ingin dihapus.


