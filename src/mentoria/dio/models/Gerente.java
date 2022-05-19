package mentoria.dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private double valorDaBonificacao;

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", horasTrabalhadas=" +super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", endereco=" + super.getEndereco().getRua() +
                ", valorDaBonificacao=" + this.valorDaBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }
}
