package mentoria.dio.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                ", valorDaBonificacao=" + this.valorDaBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }
}
