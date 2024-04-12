package model;
// Classe abstrata
public class Conta{
    private String agencia;
    private String numero;
    private int banco;
    private double saldo;

    public Conta(String agencia, String numero, int banco) {
        this.agencia = agencia;
        this.numero = numero;
        this.banco = banco;
        this.saldo = 0;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            return true;
        }
        return false;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}