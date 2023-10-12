package com.main;
import com.parent.data_civitas_akademis;
import java.util.ArrayList;
import java.util.Scanner;
import com.child.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("=======================================");
            System.out.println("|Pilihan menu Bimbingan Belajar       |");
            System.out.println("=======================================");
            System.out.println("|1. Menambahkan data anggota baru     |");
            System.out.println("|2. Menampilkan data bimbangan belajar|");
            System.out.println("|3. Mengubah data bimbangan belajar   |");
            System.out.println("|4. Menghapus data  bimbangan belajar |");
            System.out.println("=======================================");

            System.out.print("\nMasukan pilihan menu yang tersedia:");
            String pilihan = input.nextLine();
            switch(pilihan){
                case "1":
                    crud.nambahData();
                    break;
                case "2":
                    crud.menampilkandata();
                    break;
                case "3":
                    crud.updateData();
                    break;
                case "4":
                    crud.hapusData();
                    break;
                default :
                    System.out.println("pilihan anda tidak tersedia");
                    break;
            }
        }
    }
}

 class crud{
    static Scanner input = new Scanner(System.in);
    static ArrayList<data_civitas_akademis> arraydata = new ArrayList();
    public static void nambahData(){
        System.out.println("===========================");
        System.out.println("|      Menambahkan data   |");
        System.out.println("===========================");
        System.out.println("|1. Menambahkan data siswa|");
        System.out.println("|2. Menambahkan data guru |");
        System.out.println("===========================");
        System.out.print("Masukkan pilihan anda : ");
        String pilihan = input.nextLine();

        switch (pilihan){
            case "1":
                System.out.println("=========================");
                System.out.println("|Masukan Data Siswa Baru|");
                System.out.println("=========================");
                System.out.print("Masukkan id           \t: ");
                int inputidsiswa = getInputInt("Masukkan ID siswa: ");    
                
                System.out.print("Masukan nama          \t:");
                String inputnamasiswa = input.nextLine();

                System.out.print("Masukan Tanggal Lahir \t:");
                String inputtglsiswa= input.nextLine();

                System.out.print("Masukan Alamat        \t:");
                String inputalamatsiswa=input.nextLine();

                System.out.print("Masukan Nomor Telepon \t:");
                int inputno_teleponsiswa = getInputInt("Masukkan nomor telepon siswa: ");

                System.out.print("Masukan Kelas         \t:");
                String inputkelassiswa = input.nextLine();

                System.out.print("Masukan Gedung        \t:");
                String inputgedungsiswa = input.nextLine();

                System.out.print("Masukan Pelajaran     \t:");
                String inputpelajaransiswa = input.nextLine();

                data_civitas_akademis objeksiswa = new datasiswa(inputgedungsiswa,inputpelajaransiswa,inputidsiswa,inputnamasiswa,inputtglsiswa,inputalamatsiswa,inputno_teleponsiswa,inputkelassiswa);
                arraydata.add(objeksiswa);
                break;
            case "2":
                System.out.println("=========================");
                System.out.println("|Masukan Data Guru  Baru|");
                System.out.println("=========================");
                System.out.print("Masukkan id           \t: ");
                int inputidguru = getInputInt("Masukkan ID guru: "); 

                System.out.print("Masukan nama          \t:");
                String inputnamaguru = input.nextLine();

                System.out.print("Masukan Tanggal Lahir \t:");
                String inputtglguru=input.nextLine();

                System.out.print("Masukan Alamat        \t:");
                String inputalamatguru=input.nextLine();

                System.out.print("Masukan Nomor Telepon \t:");
                int inputno_teleponguru = getInputInt("Masukkan No telepon: "); 

                System.out.print("Masukan Kelas Guru    \t:");
                String inputkelasguru = input.nextLine();

                System.out.print("Masukan Gedung Guru   \t:");
                String inputgedungguru = input.nextLine();

                System.out.print("Masukan Mata Pelajaran\t:");
                String inputmatapelajaranguru = input.nextLine();

                data_civitas_akademis objekgutu = new dataguru(inputidguru, inputnamaguru, inputtglguru, inputalamatguru, inputno_teleponguru, inputkelasguru, inputgedungguru,inputmatapelajaranguru) ;
                arraydata.add(objekgutu);
                break;
            default :
                    System.out.println("pilihan anda tidak tersedia");
                    break;
        }
    }
    public static void menampilkandata(){
        System.out.println("===========================");
        System.out.println("|   Menampilkan data      |");
        System.out.println("===========================");
        System.out.println("|1. Menampilkan data siswa|");
        System.out.println("|2. Menampilkan data guru |");
        System.out.println("===========================");
        System.out.print("Masukkan pilihan anda : ");
        String pilihan = input.nextLine();

        switch(pilihan){
            case "1":
                for (data_civitas_akademis objek:arraydata){
                    if (objek instanceof datasiswa) {
                        System.out.println("Masuk ke siswa");
                        System.out.println("=========================");
                        System.out.println("|    Data Siswa  Baru    |");
                        System.out.println("=========================");
                        objek.menampilkanData();
                        System.out.println("=============================");
                    }
                    
                }break;
            case "2":
                for (data_civitas_akademis objek:arraydata) {
                    if (objek instanceof dataguru) {
                        System.out.println("Masuk ke guru");
                        System.out.println("=========================");
                        System.out.println("|     Data Guru Baru    |");
                        System.out.println("=========================");
                        objek.menampilkanData();
                        System.out.println("=============================");
                    }
                }break;
            default :
                    System.out.println("pilihan anda tidak tersedia");
                    break;

        }
    }

    public static void updateData(){
        System.out.println("===========================");
        System.out.println("|       Update data       |");
        System.out.println("===========================");
        System.out.println("|1. Update data siswa     |");
        System.out.println("|2. Update data guru      |");
        System.out.println("===========================");
        String pilihan = input.nextLine();
        System.out.print("Masukkan id anggota anda : ");
        int idinput = Integer.parseInt(input.nextLine());

        switch (pilihan){
            case "1":
                for (data_civitas_akademis objek:arraydata) {
                    if (objek instanceof datasiswa) {
                        if (objek.getId_anggota()==idinput){
                            System.out.println("=========================");
                            System.out.println("|     UPDATE Siswa      |");
                            System.out.println("=========================");
                            System.out.print("Masukkan id \t: ");
                            int inputidsiswa = getInputInt("Masukkan ID siswa: ");  

                            System.out.print("Masukan nama\t:");
                            String inputnamasiswa = input.nextLine();

                            System.out.print("Masukan Tanggal Lahir\t:");
                            String inputtglsiswa=input.nextLine();

                            System.out.print("Masukan Alamat\t:");
                            String inputalamatsiswa=input.nextLine();

                            System.out.print("Masukan Nomor Telepon\t:");
                            int inputno_teleponsiswa = getInputInt("Masukkan nomor telepon siswa: ");

                            System.out.print("Masukan Kelas\t:");
                            String inputkelassiswa = input.nextLine();

                            System.out.print("Masukan Gedung\t:");
                            String inputgedungsiswa = input.nextLine();

                            System.out.print("Masukan Pelajaran\t:");
                            String inputpelajaransiswa = input.nextLine();
                            
                            objek.setId_anggota(idinput);
                            objek.setNama(inputnamasiswa);
                            objek.setAlamat(inputalamatsiswa);
                            objek.setTanggal_lahir(inputtglsiswa);
                            objek.setNo_Hp(inputno_teleponsiswa);
                            objek.setKelas(inputkelassiswa);
                            ((datasiswa) objek).setGedung(inputgedungsiswa);
                            ((datasiswa) objek).setPelajaran(inputpelajaransiswa);
                        }
                    }
                }break;
            case "2":
                for (data_civitas_akademis objek:arraydata) {
                    if (objek instanceof dataguru) {
                        if (objek.getId_anggota()==idinput){
                            System.out.println("=========================");
                            System.out.println("|     UPDATE Guru       |");
                            System.out.println("=========================");
                            System.out.print("Masukkan id \t: ");
                            int inputidguru = getInputInt("Masukkan ID guru: ");

                            System.out.print("Masukan nama\t:");
                            String inputnamaguru = input.nextLine();

                            System.out.print("Masukan Tanggal Lahir\t:");
                            String inputtglguru=input.nextLine();

                            System.out.print("\tMasukan Alamat\t:");
                            String inputalamatguru=input.nextLine();

                            System.out.print("\tMasukan Nomor Telepon\t:");
                            int inputno_teleponguru = getInputInt("Masukkan No telepon: "); 

                            System.out.print("\tMasukan Kelas\t:");
                            String inputkelasguru = input.nextLine();

                            System.out.print("\tMasukan Gedung guru\t:");
                            String inputgedungguru = input.nextLine();

                            System.out.print("\tMasukan Mata Pelajaran\t:");
                            String inputmatapengajaranguru = input.nextLine();
                            
                            objek.setId_anggota(inputidguru);
                            objek.setNama(inputnamaguru);
                            objek.setTanggal_lahir(inputtglguru);
                            objek.setAlamat(inputalamatguru);
                            objek.setNo_Hp(inputno_teleponguru);
                            objek.setKelas(inputkelasguru);
                            ((dataguru) objek).setRuangprivateguru(inputgedungguru);
                            ((dataguru) objek).setPengajar(inputmatapengajaranguru);
                        }
                    }
                }break;
            default :
                    System.out.println("pilihan anda tidak tersedia");
                    break;

        }
    }

    public static void hapusData(){
    System.out.println("===========================");
    System.out.println("|     Hapus Data          |");
    System.out.println("===========================");
    System.out.print("Masukkan ID data yang akan dihapus: ");
    int inputId = Integer.parseInt(input.nextLine());
    boolean dataDitemukan = false;

    for (int i = 0; i < arraydata.size(); i++) {
        data_civitas_akademis objek = arraydata.get(i);
        if (objek.getId_anggota() == inputId) {
            dataDitemukan = true;
            objek.menampilkanData();
            System.out.print("Apakah Anda yakin ingin menghapus data ini? (Y/N): ");
            String konfirmasi = input.nextLine().toUpperCase();
            if (konfirmasi.equals("Y")) {
                arraydata.remove(i);
                System.out.println("Data dengan ID " + inputId + " telah dihapus.");
            } else {
                System.out.println("Penghapusan data dibatalkan.");
            }
            break;
        }
    }

    if (!dataDitemukan) {
        System.out.println("Data dengan ID " + inputId + " tidak ditemukan.");
        }
    }
private static int getInputInt(String prompt) {
    int inputInt = 0;
    boolean input_benar = false;
    while (!input_benar) {
        System.out.print(prompt);
        try {
            inputInt = Integer.parseInt(input.nextLine());
            input_benar = true;
        } catch (NumberFormatException e) {
            System.out.println("Masukkan angka yang benar.");
        }
    }
    return inputInt;
    }
}