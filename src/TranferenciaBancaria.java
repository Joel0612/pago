public class TranferenciaBancaria  implements Pago {


    @Override
    public void pagar(double cantida) {
        System.out.println("El pago de $" + cantida + " se ha realizado por Tranferencia Bancaria");
    }

}
