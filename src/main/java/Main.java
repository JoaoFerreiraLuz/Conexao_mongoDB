import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String args[]) {


        FindInsertUpdate conexao = new FindInsertUpdate();

        //chamando o cunsultar passando o banco e a collection
        Document aluno = conexao.consulta("test", "alunos");
        System.out.println(aluno);

        // criando documento com multiplos documentos para inserçao
//         Document novoAluno = new Document("nome", "teste")
//                .append("data_nascimento", new Date(2008,10,30))
//                .append("curso" , new Document("curso", "Sistemas de informaçao"))
//                .append("notas", Arrays.asList(9,10,7))
//                .append("habilidades", Arrays.asList(
//                        new Document().append("nome", "Ingles").append("nivel", "avançãdo"),
//                        new Document().append("nome", "Espanho").append("nivel", "basico")));

//        conexao.insert("test", "alunos", novoAluno);


//        conexao.update("test", "alunos", Filters.eq("nome","ana"), new Document("nome", "Ana"));

//        conexao.excluir("test", "alunos",Filters.eq("nome","teste"));

    }
}
