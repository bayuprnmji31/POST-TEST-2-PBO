
package com.child;

import com.parent.data_civitas_akademis;

final public class dataguru extends data_civitas_akademis{

    public String Ruangprivateguru;
    public String pengajar;
    
    
    public dataguru(int id_anggota, String nama, String tanggal_lahir, String alamat, int no_Hp, String kelas, String ruangprivate,String gurupengajar) {
        super(id_anggota, nama, tanggal_lahir, alamat, no_Hp, kelas);
        this.Ruangprivateguru = ruangprivate;
        this.pengajar= gurupengajar;
    }

    final public String getRuangprivateguru() {
        return Ruangprivateguru;
    }

    final public void setRuangprivateguru(String Ruangprivateguru) {
        this.Ruangprivateguru = Ruangprivateguru;
    }

    final public String getPengajar() {
        return pengajar;
    }

    final public void setPengajar(String pengajar) {
        this.pengajar = pengajar;
    }

    
    @Override
    public void menampilkanData(){
        System.out.println("=======================================================");
        System.out.println("|\t Data Guru Bimbingan Belajar                       |");
        System.out.println("=======================================================");
        System.out.println(" |ID_Anggota                =" +getId_anggota()+       "|");
        System.out.println(" |Nama                      =" +getNama()+             "|");
        System.out.println(" |Kelas                     =" +getKelas()+            "|");
        System.out.println(" |Tanggal Lahir             =" +getTanggal_lahir()+    "|");
        System.out.println(" |Alamat                    =" +getAlamat()+           "|");
        System.out.println(" |No Telepon                =" +getNo_Hp()+            "|");
        System.out.println(" |Ruang Guru                =" +getRuangprivateguru()+ "|");
        System.out.println(" |Pengajar mata pelajaran   =" +getPengajar()+         "|");
        System.out.println("=======================================================");
        
    }
}
