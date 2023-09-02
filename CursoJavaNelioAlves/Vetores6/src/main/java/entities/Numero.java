package entities;

public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void achaPares(Numero[] numeros) {
        int cont = 0;
        System.out.println("NUMEROS PARES: ");
        for ( Numero n : numeros ) {
            if ( n.numero % 2 == 0 ) {
                System.out.printf("%.2f ", n.numero);
                cont++;
            }
        }
    }
}
