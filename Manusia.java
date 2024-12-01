public class Manusia extends MakhlukHidup {
    public Manusia(String nama) {
        super(nama); // Memanggil konstruktor superclass
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan paru-paru.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(nama + " berkembang biak secara melahirkan.");
    }
}
