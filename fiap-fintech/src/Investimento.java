public class Investimento extends EntidadeFinanca {
    private String nome;
    private String dataDeRetirada;
    private String dataDoInvestimento;

    public Investimento(int codigo, String categoria, Double valor, String data, String nome, String dataDeRetirada, String dataDoInvestimento) {
        super(codigo, categoria, valor, data);
        this.nome = nome;
        this.dataDeRetirada = dataDeRetirada;
        this.dataDoInvestimento = dataDoInvestimento;
    }

    @Override
    public Double retornarValor(int codigo, Double valor) {
        return super.retornarValor(codigo, valor) + 100.0;
    }
}
