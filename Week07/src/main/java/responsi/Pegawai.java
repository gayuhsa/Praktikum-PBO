package responsi;

public abstract class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    // Getter
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public int getGaji() {
        return gaji;
    }
    
    // Setter
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}