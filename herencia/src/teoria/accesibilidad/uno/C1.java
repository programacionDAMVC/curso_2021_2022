package teoria.accesibilidad.uno;

public class C1 {
    private void metodoPrivado() {
        System.out.println("Soy un método privado");
    }
    protected void metodoProtected() {
        System.out.println("Soy un método protected");
    }
    void metodoPackage() {
        System.out.println("Soy un método package");
    }
    public void metodoPublico() {
        System.out.println("Soy un método publico");
    }

    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.metodoPrivado();
        c1.metodoProtected();
        c1.metodoPackage();
        c1.metodoPublico();
    }
}
