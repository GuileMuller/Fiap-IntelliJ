public class Despesa extends EntidadeFinanca {
    public Despesa(int codigo, String categoria, Double valor, String data) {
        super(codigo, categoria, valor, data);
    }

    @Override
    public Double retornarValor(int codigo, Double valor) {
        return super.retornarValor(codigo, valor) + 40.0;
    }
}
