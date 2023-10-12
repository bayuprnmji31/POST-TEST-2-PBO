
package com.parent;

public abstract class data_civitas_akademis {
    private int id_anggota;
    private String nama;
    private String tanggal_lahir;
    private String alamat;
    private int no_Hp;
    private String kelas;

    public int getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(int id_anggota) {
        this.id_anggota = id_anggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNo_Hp() {
        return no_Hp;
    }

    public void setNo_Hp(int no_Hp) {
        this.no_Hp = no_Hp;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public data_civitas_akademis(int id_anggota, String nama, String tanggal_lahir, String alamat, int no_Hp, String kelas) {
        this.id_anggota = id_anggota;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.alamat = alamat;
        this.no_Hp = no_Hp;
        this.kelas = kelas;
    }
    
    public abstract void menampilkanData();
    
}
