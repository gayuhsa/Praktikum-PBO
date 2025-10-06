package responsi;

public class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    // Getter
    public int getGaransi() {
        return garansi;
    }
    
    // Setter
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}