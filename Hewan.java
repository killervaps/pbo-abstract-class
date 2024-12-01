public class Hewan extends MakhlukHidup {
    public Hewan(String nama) {
        super(nama); // Memanggil konstruktor superclass
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan paru-paru atau insang.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(nama + " berkembang biak secara bertelur atau melahirkan.");
    }
}
