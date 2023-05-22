/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belliviavinicius;

/**
 *
 * @author ifsp
 */
public class ContaCorrente {

    private int idCliente;
    private int numeroConta;
    private double saldo;
    private String historico;
    private boolean status;
    private String strStatus;

    public ContaCorrente(Cliente cliente, int numeroConta) {
        this.idCliente = cliente.getId();
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.status = true;

        if (status == true) {
            strStatus = "Ativa";
        } else {
            strStatus = "Desativada";
        }
        historico = "Criou a conta \nNumero da conta: " + numeroConta + " \nSaldo: " + saldo + "\nA conta está " + strStatus + "\n";

    }

    public void Depositar(double valor) {
        saldo += valor;
        historico += "Deposito de  " + valor + "\nSaldo: "+ saldo +"";
        System.out.println("\nDeposito efetuado com sucesso!");
    }

    public void Sacar(double valor) {
        if (saldo >= valor * 1.0033) {
            valor *= 1.0033;
            saldo -= valor;
            historico += "\nSaque de  " + valor + "";
            System.out.println("\nSaque efetuado com sucesso!");

        } else {
            System.out.println("\nSaldo insuficiente.");
        }
    }



    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        System.out.println("\nSaldo Atual de: " + saldo + "");
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getHistorico() {
        System.out.println("\nHistorico total:\n" + historico + "");
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStrStatus() {
        return strStatus;
    }

    public void setStrStatus(String strStatus) {
        this.strStatus = strStatus;
    }

}
