public abstract class MakhlukHidup {
    protected String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    // Metode abstrak untuk aktivitas utama
    public abstract void bernafas();

    public abstract void berkembangBiak();

    // Metode umum untuk semua makhluk hidup
    public String getNama() {
        return nama;
    }
}
