public class Usuario {
    private int codigo;
    private String email;
    private String senha;
    private String usuario;
    private int cpf;
    private int rg;

    public Usuario(int codigo, String email, String senha, String usuario, int cpf, int rg) {
        this.codigo = codigo;
        this.email = email;
        this.senha = senha;
        this.usuario = usuario;
        this.cpf = cpf;
        this.rg = rg;
    }
}
