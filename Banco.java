
package sapaiada;

import java.util.List;
import java.util.ArrayList;

public class Banco {

    static List<Roupa> bdRoupa;
    static List<Funcionario> bdFuncionario;
    
    private static Banco bancoRoupaUnic;
    public static Banco getBancoRoupaUnic() {
        if (bancoRoupaUnic == null) {
            bancoRoupaUnic = new Banco();
        }
        return bancoRoupaUnic;
    }

    private Banco() {
        bdRoupa = new ArrayList<>();
        bdFuncionario = new ArrayList<>();
    }
    
    public List<Roupa> getBdRoupa(){
        return bdRoupa;
    }
    public List<Funcionario> getBdFuncionario(){
        return bdFuncionario;
    }
    
}
