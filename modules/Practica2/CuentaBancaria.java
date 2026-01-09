public class CuentaBancaria {
    //Atributos (Variables de instancia)
    private String titular;
    private double saldo;
}

    public CuentaBancaria(String titular, double saldoInicial){
        this.titular=titular;
        this.saldo=saldoInicial;
    }

//Método que devuelve un valor 
public double consultaSaldo(){
        return saldo;
    }

// Método de modificación
public void depositar(double cantidad){
        if(cantidad>0){
            saldo += cantidad;
        }
    }

    