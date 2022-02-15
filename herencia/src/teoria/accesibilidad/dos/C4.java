package teoria.accesibilidad.dos;

import teoria.accesibilidad.uno.C1;

public class C4 extends C1 {
    public void llamarMétodosdeC1() {
        metodoProtected();
        metodoPublico();
    }

    public static void main(String[] args) {
        C4 c4 = new C4();
        c4.llamarMétodosdeC1();
    }
}
