public class Main {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia("Alice");
        MakhlukHidup hewan = new Hewan("Kucing");
        MakhlukHidup tumbuhan = new Tumbuhan("Mawar");

        manusia.bernafas();
        manusia.berkembangBiak();

        hewan.bernafas();
        hewan.berkembangBiak();

        tumbuhan.bernafas();
        tumbuhan.berkembangBiak();
    }
}
