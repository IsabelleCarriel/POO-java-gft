package mentoria.dio;

import mentoria.dio.models.Endereco;
import mentoria.dio.models.Gerente;
import mentoria.dio.models.OperadorDeCaixa;
import mentoria.dio.models.Vendedor;

public class Main {

    public static void main(String[] args) {

        Endereco enderecoFuncioario = new Endereco("Rua do funcionário",
                        "Bairro do funcionário","Complemento endereço funcionário");

        Endereco enderecoGerente = new Endereco("Rua do gerente",
                "Bairro do gerente","Complemento endereço gerente");

        Endereco enderecoDoCaixa = new Endereco("Rua do operador de caixa",
                "Bairro do operador de caixa","Complemento endereço operador de caixa");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Isabelle Vendedora");
        vendedor.setDocumento("123-456-789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(enderecoFuncioario);
        vendedor.calculaBonificacao(3d);
        System.out.println(vendedor);
        System.out.println("-------");

        OperadorDeCaixa operadorDeCaixa =
                new OperadorDeCaixa("Isabelle OP Caixa", "111-222-333-00", 1500d,enderecoDoCaixa);
        System.out.println(operadorDeCaixa);
        System.out.println("-------");

        Gerente gerente = new Gerente();
        gerente.setNome("Isabelle Gerente");
        gerente.setDocumento("987-654-321-00");
        gerente.setEndereco(enderecoGerente);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(80d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);



    }
}
