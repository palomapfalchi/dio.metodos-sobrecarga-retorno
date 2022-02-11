package Metodos;

public class Main {

    public static void main(String[] args) {

        //Metodos.Calculadora
        System.out.println("Exercício da calculadora");
        Calculadora.soma(9,3);
        Calculadora.substracao(9,3);
        Calculadora.divisao(9,5);
        Calculadora.multiplicacao(9,6);

        //Metodos.Mensagem
        System.out.println(("Exercício do horário"));
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(12);
        Mensagem.obterMensagem(18);
        Mensagem.obterMensagem(17);

        //Empréstimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500,5);
        Emprestimo.calcular(1500,2);

    }
}
