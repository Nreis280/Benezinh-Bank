import br.com.benezinhobank.model.Agencia;
import br.com.benezinhobank.model.Banco;
import br.com.benezinhobank.model.ContaCorrente;
import br.com.benezinhobank.model.ContaPoupanca;
import br.com.benezinhobank.pessoa.model.PessoaFisica;
import br.com.benezinhobank.pessoa.model.PessoaJuridica;

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
        nicolas.setNascimento(LocalDate.of(1980,1,26));
        nicolas.setCPF("49881462860");
        nicolas.setMae(mae);

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
        ccni.setSaldo(800_000_000.00);
        ccni.setLimete(10_00_000.00);


        System.out.println(ccni);
        System.out.println(cc);


    }
}