import br.com.benezinhobank.model.Agencia;
import br.com.benezinhobank.model.Banco;
import br.com.benezinhobank.model.ContaCorrente;
import br.com.benezinhobank.model.ContaPoupanca;
import br.com.benezinhobank.pessoa.model.Pessoa;
import br.com.benezinhobank.pessoa.model.PessoaFisica;
import br.com.benezinhobank.pessoa.model.PessoaJuridica;

import javax.swing.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Banco benezinho = new Banco("Benezinho Bank");

        Agencia osasco = new Agencia();
        osasco.setBanco(benezinho);
        osasco.setNome("Osasco");
        osasco.setNumero("1-9");

        PessoaFisica mae = new PessoaFisica();
        mae.setNome("Glauci Reis");
        mae.setNascimento(LocalDate.of(1980,1,10));
        mae.setCPF("30146093828");


        PessoaFisica nicolas = new PessoaFisica();
        nicolas.setNome("Nicolas");
        nicolas.setCPF("49881462860");
        nicolas.setNascimento(LocalDate.of(2004,1,26));
        nicolas.setCPF("49881462860");
        nicolas.setMae(mae);

        PessoaFisica lucca = new PessoaFisica();
        lucca.setNome("Lucca Freitas");
        lucca.setCPF("49881462860");
        lucca.setNascimento(LocalDate.of(2004,8,19));
        lucca.setCPF("12321312379");
        lucca.setMae(mae);



        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(osasco);
        cc.setTitular(nicolas);
        cc.setSaldo(1_000_000.99);
        cc.setLimete(10_000_000.00);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero("2-8");
        cp.setAniversario(4);
        cp.setAgencia(osasco);
        cp.setSaldo(500_000);
        cp.setTitular(mae);

        PessoaJuridica nimastup = new PessoaJuridica();
        nimastup.setCNPJ("123999000/0001-99");
        nimastup.setNascimento(LocalDate.of(1998,10,5));
        nimastup.setNome("Nicoals Nimastup");
        nimastup.setRazaoSocial("Nicolas Nimastup SA");

        ContaCorrente ccni = new ContaCorrente();
        ccni.setNumero("3-7");
        ccni.setAgencia(osasco);
        ccni.setTitular(nimastup);
        ccni.setSaldo(1500.00);
        ccni.setLimete(10000.00);

        Pessoa[] socios = new Pessoa[3];
        socios[0] = nicolas;
        socios[1] = mae;
        socios[2] = lucca;

        nimastup.setSocios(socios);
        //System.out.println(ccni);

        for (int i=0; i<socios.length; i++){
            System.out.println(socios[i]);

        }

        int continua = 0;
        System.out.println("------------------------------------");
        System.out.println("Saldo anterior: " + ccni.getSaldo());
        System.out.println("Limite: " + ccni.getLimete() );
        System.out.println("Disponivel: " + ccni.getSaldo() + ccni.getLimete());

        do {

            double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque: "));

            boolean saquei = ccni.sacar(valor);

            if (saquei){
                System.out.println("Saue egetuado com sucesso!!");
            } else {
                System.out.println("Erro no saque!");
            }

            String texto = """
                    Deseja realizar um novo saque?
                    [1]Sim
                    [0]Não
                    
                    """;

            continua = Integer.parseInt(JOptionPane.showInputDialog(texto));
        } while (continua == 1);

        System.out.println("Saldo anterior " + ccni.getSaldo());



        System.out.println("Saldo atual " + ccni.getSaldo());

    }
}