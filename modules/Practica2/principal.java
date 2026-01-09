public class principal {
    public static void main(String[] args) {
        CuentaBancaria cuentaUsuario = new CuentaBancaria("Brenda", 0);
        cuentaUsuario.depositar(500);
        System.out.println("saldo" +cuentaUsuario.consultaSaldo());
    }
}
