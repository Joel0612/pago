public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        TarjetaCredito cantidadpagado = new TarjetaCredito();
        PayPal cantidadpagado1 = new PayPal();
        TranferenciaBancaria cBancaria = new TranferenciaBancaria();


        cantidadpagado.pagar(100.0);
        cantidadpagado1.pagar(200.0);
        cBancaria.pagar(500.0);
    }
}
