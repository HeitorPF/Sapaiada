package sapaiada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Heitor
 */
public class Conexao {

    private String url;
    private String usuario;
    private static String senha = Principal.getSenhaPostgres();
    private Connection con;
    private static Conexao conexaoUnic;
    public static Conexao getCon(){
        if(conexaoUnic == null){
            conexaoUnic = new Conexao(senha);
        }
        return conexaoUnic;
    }
    private Conexao(String senha) {
        url = "jdbc:postgresql://localhost:5432/Sapaiada";
        usuario = "postgres";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão feita com sucesso!",
                "Sucesso", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public int adicionarCliente(int idCliente, String nomeCliente, String teleCliente, String emailCliente, String senha, int idLoja) {
        try {
            String sql = "INSERT INTO Cliente values "
                    + "(" + idCliente + ",'" + nomeCliente + "','" + teleCliente + "','" + emailCliente + "','" + senha + "'," + idLoja + ");";
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int adicionarRoupa(int idRoupa, int idLoja, float preco, String desc, int quant) {
        try {
            String sql = "INSERT INTO Roupa (id_Roupa,id_Loja,preco_Roupa,desc_Roupa,qtd_Roupa) values"
                    + " (" + idRoupa + "," + idLoja + "," + preco + ", '" + desc + "'," + quant + ");";
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int adicionarFuncionario(int idFunc, String emailFunc, String nomeFunc, String cargo, String senha, int idLoja) {
        try {
            String sql = "INSERT INTO Funcionario (id_Func,email_Func,nome_Func,cargo_Func,senha, id_Loja)"
                    + " values(" + idFunc + ",'" + emailFunc+ "','" + nomeFunc + "', '" + cargo + "','" + senha + "',"+ idLoja +");";
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int comprarRoupa(int idCompra, Roupa r, int quantComp) {
        int quant = 0;
        if(r.getQuant() >= quantComp){
            float total = 0;
            while(quant <= quantComp){
                total = total + r.getPreco();
                quant ++;
            }
            try{
                String insertCompra = "INSERT INTO compra values("+ idCompra +",current_date, " + total+","+ Login.getLoginUnic().getCliente().getIdCliente() +")";
                String insertIV = "INSERT INTO Item_Vendido values ("+ idCompra +","+ r.getIdRoupa()+","+ quantComp+",total)";
                String update = "UPDATE roupa SET qtd_roupa = "+ (r.getQuant()-quantComp) +" WHERE id_roupa = " + r.getIdRoupa() +";";
                Statement stm = con.createStatement();
                stm.executeUpdate(update);
                stm.executeUpdate(insertCompra);
                int res = stm.executeUpdate(insertIV);
                return res;
            }
            catch(Exception e){
                e.printStackTrace();
                return 0;
            }
            //altera quantidade
        }
        else{
            //JOptionPane - quantidade não disponivel
            return -1;
        }
    }
    
    public int deletaFunc(int idFunc){
        try{
            String sql = "DELETE FROM funcionario WHERE id_Func = " +idFunc;
            Statement stm = con.createStatement();
            int res = stm.executeUpdate(sql);
            return res;
        }
        catch(Exception e){
            return 0;
        }
    }

    public ResultSet executaBuscaLoja(int loja) {
        try {
            Statement stm = con.createStatement();
            ResultSet rs;
            if(loja == 0){
                rs = stm.executeQuery("SELECT * FROM roupa");
            }
            else{
                rs = stm.executeQuery("SELECT * FROM roupa WHERE id_Loja = " + loja);
            }
            try {
                while (rs.next()) {
                    Roupa r = new Roupa();
                    int idRoupa = rs.getInt("id_Roupa");
                    int idLoja  = rs.getInt("id_Loja");
                    float preco = rs.getFloat("preco_Roupa");
                    String desc = rs.getString("desc_Roupa");
                    int quant = rs.getInt("qtd_Roupa");
                    r.setIdRoupa(idRoupa);
                    r.setIdLoja(idLoja);
                    r.setPreco(preco);
                    r.setDesc(desc);
                    r.setQuant(quant);
                    Banco.getBancoRoupaUnic().getBdRoupa().add(r);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet executaBuscaFunc(int op, String pesquisa) {
        String pesq = "";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = null;
            if (op == 0) {
                rs = stm.executeQuery("SELECT * FROM funcionario");
            }
            else if(op == 1){ // id
                pesq = "id_Func";
            }
            else if(op == 2){ // nome
                pesq = "nome_Func";
                pesquisa = "'" + pesquisa + "'";
            }
            else if(op == 3){ // cargo
                pesq = "cargo_Func";
                pesquisa = "'" + pesquisa + "'";
            }
            if(op != 0){
                rs = stm.executeQuery("SELECT * FROM funcionario WHERE " + pesq + " = " + pesquisa );
            }
            try {
                while (rs.next()) {
                    Funcionario f = new Funcionario();
                    int idFunc = rs.getInt("id_Func");
                    String email = rs.getString("email_Func");
                    String nomeFunc = rs.getString("nome_Func");
                    String cargoFunc = rs.getString("cargo_Func");
                    String senha = rs.getString("senha");
                    int idLoja = rs.getInt("id_Loja");
                    f.setIdFunc(idFunc);
                    f.setEmail(email);
                    f.setNomeFunc(nomeFunc);
                    f.setCargFunc(cargoFunc);
                    f.setSenha(senha);
                    f.setIdLoja(idLoja);
                    Banco.getBancoRoupaUnic().getBdFuncionario().add(f);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ResultSet executaBuscaCliente() {
        try {
            Statement stm = con.createStatement();
            ResultSet rs = null;
            rs = stm.executeQuery("SELECT * FROM cliente");
            try {
                while (rs.next()) {
                    Cliente c = new Cliente();
                    int idCliente = rs.getInt("id_Cliente");
                    String emailCliente = rs.getString("email_Cliente");
                    String nomeCliente = rs.getString("nome_Cliente");
                    String teleCliente = rs.getString("tele_cliente");
                    String senhaCliente = rs.getString("senha_Cliente");
                    int idLoja = rs.getInt("id_Loja");
                    c.setIdCliente(idCliente);
                    c.setEmailCliente(emailCliente);
                    c.setNomeCliente(nomeCliente);
                    c.setTeleCliente(teleCliente);
                    c.setSenhaCliente(senhaCliente);
                    c.setIdLoja(idLoja);
                    Banco.getBancoRoupaUnic().getBdCliente().add(c);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
