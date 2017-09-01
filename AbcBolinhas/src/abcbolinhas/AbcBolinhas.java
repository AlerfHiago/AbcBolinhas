/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcbolinhas;

/**
 *
 * @author Hiago
 */
public class AbcBolinhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public class Orcamento {

        private double valor;

        public Orcamento(double valor) {
            this.valor = valor;
        }

        public double getValor() {
            return valor;
        }
    }

    public class Imposto {

        public Imposto() {
        }

        public double calcula(Orcamento orcamento) {
            System.out.println("teste");
            return orcamento.getValor() * 0.1;
        }
    }
}
