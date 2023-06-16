package sapaiada;


public class Funcionario {
    
    private String email;
    private int idFunc;
    private String nomeFunc;
    private String cargFunc;
    private String senha;
    private int idLoja;
    
    public void setIdLoja(int idLoja){
        this.idLoja = idLoja;
    }
    
    public int getIdLoja(){
        return idLoja;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCargFunc() {
        return cargFunc;
    }

    public void setCargFunc(String cargFunc) {
        this.cargFunc = cargFunc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
