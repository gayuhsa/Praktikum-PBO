package responsi;

import java.time.LocalDate;

public class Makanan extends Produk {
    private LocalDate tanggalKadaluarsa;
    
    public Makanan(String namaProduk, int harga, LocalDate tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    // Getter
    public LocalDate getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    
    // Setter
    public void setTanggalKadaluarsa(LocalDate tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}