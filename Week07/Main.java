package responsi;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Class Elektronik -----");
        
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        
        System.out.println("\nPercobaan Getter:");
        System.out.println("getNamaProduk(): " + laptop.getNamaProduk());
        System.out.println("getHarga(): " + laptop.getHarga());
        System.out.println("getGaransi(): " + laptop.getGaransi());
        
        laptop.setNamaProduk("Lenovo ThinkPad");
        laptop.setHarga(18000000);
        laptop.setGaransi(1);
        
        System.out.println("\nSetelah atribut diubah menggunakan setter:");
        laptop.tampilkanInfo();
        
        System.out.println("\n----- Class PegawaiTetap -----");
        
        PegawaiTetap pegawai1 = new PegawaiTetap("Budi", 5000000, 1000000);
        pegawai1.tampilkanInfo();
        
        System.out.println("\nPercobaan Getter:");
        System.out.println("getNamaPegawai(): " + pegawai1.getNamaPegawai());
        System.out.println("getGaji(): " + pegawai1.getGaji());
        System.out.println("getTunjangan(): " + pegawai1.getTunjangan());
        
        pegawai1.setNamaPegawai("Andi");
        pegawai1.setGaji(5500000);
        pegawai1.setTunjangan(1200000);
        
        System.out.println("\nSetelah atribut diubah menggunakan setter:");
        pegawai1.tampilkanInfo();
        
        System.out.println("\n----- Class Makanan -----");
        
        Makanan snack = new Makanan("Snack", 15000, LocalDate.of(2023, 12, 30));
        snack.tampilkanInfo();
        
        System.out.println("\nPercobaan Getter:");
        System.out.println("getNamaProduk(): " + snack.getNamaProduk());
        System.out.println("getHarga(): " + snack.getHarga());
        System.out.println("getTanggalKadaluarsa(): " + snack.getTanggalKadaluarsa());
        
        snack.setNamaProduk("Kerupuk Udang");
        snack.setHarga(24000);
        snack.setTanggalKadaluarsa(LocalDate.of(2025, 10, 30));
        
        System.out.println("\nSetelah atribut diubah menggunakan setter:");
        snack.tampilkanInfo();
        
        System.out.println("\n----- Class PegawaiKontrak -----");
        
        PegawaiKontrak pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        pegawai2.tampilkanInfo();
        
        System.out.println("\nPercobaan Getter:");
        System.out.println("getNamaPegawai(): " + pegawai2.getNamaPegawai());
        System.out.println("getGaji(): " + pegawai2.getGaji());
        System.out.println("getLamaKontrak(): " + pegawai2.getLamaKontrak());
        
        pegawai2.setNamaPegawai("Budi");
        pegawai2.setGaji(3900000);
        pegawai2.setLamaKontrak(24);
        
        System.out.println("\nSetelah atribut diubah menggunakan setter:");
        pegawai2.tampilkanInfo();
    }
}