public class Tumbuhan extends MakhlukHidup {
    public Tumbuhan(String nama) {
        super(nama); // Memanggil konstruktor superclass
    }

    @Override
    public void bernafas() {
        System.out.println(nama + " bernafas menggunakan stomata atau lentisel.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(nama + " berkembang biak melalui biji, tunas, atau stek.");
    }
}
