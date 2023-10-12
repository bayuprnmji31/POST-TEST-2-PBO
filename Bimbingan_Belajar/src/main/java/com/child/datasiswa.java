package com.child;

import com.parent.data_civitas_akademis;

final public class datasiswa extends data_civitas_akademis{

    public String Gedung;
    public String Pelajaran;

    public datasiswa(String Gedung, String Pelajaran, int id_anggota, String nama, String tanggal_lahir, String alamat, int no_Hp, String kelas) {
        super(id_anggota, nama, tanggal_lahir, alamat, no_Hp, kelas);
        this.Gedung = Gedung;
        this.Pelajaran = Pelajaran;
    }
    

    final public String getPelajaran() {
        return Pelajaran;
    }

    final public void setPelajaran(String Pelajaran) {
        this.Pelajaran = Pelajaran;
    }

    final public String getGedung() {
        return Gedung;
    }

    final public void setGedung(String Gedung) {
        this.Gedung = Gedung;
    }

    @Override
    public void menampilkanData(){
        
        System.out.println("=======================================================");
        System.out.println("|\n\t Data Siswa Bimbingan Belajar                    |");
        System.out.println("=======================================================");
        System.out.println(" |ID_Anggota                =" +getId_anggota()+       "|");
        System.out.println(" |Nama                      =" +getNama()+             "|");
        System.out.println(" |Kelas                     =" +getKelas()+            "|");
        System.out.println(" |Tanggal Lahir             =" +getTanggal_lahir()+    "|");
        System.out.println(" |Alamat                    =" +getAlamat()+           "|");
        System.out.println(" |No Telepon                =" +getNo_Hp()+            "|");
        System.out.println(" |Gedung                    =" +getGedung()+           "|");
        System.out.println(" |Pengajar mata pelajaran   =" +getPelajaran()+        "|");
        System.out.println("=======================================================");
       
   
    }
}