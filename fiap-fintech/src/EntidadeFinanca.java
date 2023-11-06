public class EntidadeFinanca {
    private int codigo;
    private String categoria;
    private Double valor;
    private String data;

    public EntidadeFinanca(int codigo, String categoria, Double valor, String data) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.valor = valor;
        this.data = data;
    }

    public Double retornarValor(int codigo, Double valor){
        return valor;
    }
}
