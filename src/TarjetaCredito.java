public class TarjetaCredito implements Pago {

    @Override
    public void pagar(double cantida) {
        System.out.println("El pago de $" + cantida + " se ha realizado con Tarjeta de Credito");
    }

}
