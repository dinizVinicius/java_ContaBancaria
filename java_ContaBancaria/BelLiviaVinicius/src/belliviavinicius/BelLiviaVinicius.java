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
public class BelLiviaVinicius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Livia");
        Cliente c2 = new Cliente(2, "Vinícius");
        Cliente c3 = new Cliente(3, "Bel");

        ContaCorrente cc1 = new ContaCorrente(c1, 1234);
        cc1.Depositar(1000);
        cc1.Sacar(500);
        cc1.getHistorico();
        cc1.getSaldo();

        ContaCorrente cc2 = new ContaCorrente(c2, 5678);
        cc2.Depositar(10000);
        cc2.Sacar(100);
        cc2.Sacar(3000);
        cc2.getHistorico();
        cc2.getSaldo();

        ContaCorrente cc3 = new ContaCorrente(c3, 1596);
        cc3.Depositar(200);
        cc3.Sacar(100);
        cc3.getHistorico();
        cc3.getSaldo();

    }

}
