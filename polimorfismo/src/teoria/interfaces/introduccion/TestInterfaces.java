package teoria.interfaces.introduccion;

public class TestInterfaces {
    public static void main(String[] args) {
        // A.VARIABLE = 56; no se  puede hacer, VARIABLE es final
        System.out.printf("Valor de la variable %d%n", A.VARIABLE);
        A a;  //se puede crear referencia de la interface A
       // a = new A(); no se puede instanciar porque A es una interface
        A aCastellano = new ACastellano();
        System.out.println(aCastellano.saludar("josé"));
        A aIngles     = new AIngles();
        System.out.println(aIngles.saludar("josé"));
        B b = new C();
        System.out.println(b.saludar("María"));
        double euros = 12.3;
        System.out.printf("%.2f € son %.2f pounds%n", euros, b.cambiar(euros));
    }
}
