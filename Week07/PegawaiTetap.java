package responsi;

public class PegawaiTetap extends Pegawai {
    private int tunjangan;
    
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    // Getter
    public int getTunjangan() {
        return tunjangan;
    }
    
    // Setter
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}