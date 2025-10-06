package responsi;

public abstract class Produk {
    private String namaProduk;
    private int harga;
    
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Getter
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public int getHarga() {
        return harga;
    }
    
    // Setter
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}