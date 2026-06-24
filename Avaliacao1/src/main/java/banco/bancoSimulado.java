
package banco;
import java.util.ArrayList;
import modelo.Aluno;

public class bancoSimulado {
    
    public static ArrayList<Aluno> alunos = new ArrayList<>();
    
    public static int idAluno = 1;
    
    static {

        alunos.add(new Aluno(
                idAluno++,
                "Jose Sebastian",
                "25",
                "sebastiano@email.com"
            )
        );
        
        alunos.add(new Aluno (
                idAluno++,
                "Miri Curtis",
                "78",
                "curtismiri@email.com"
            )
        );
        
           
    }
}

