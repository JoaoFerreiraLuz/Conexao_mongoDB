import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

public class FindInsertUpdate {

    public FindInsertUpdate() {}

    public Document consulta(String database, String collection){

        //instanciando o banco de dados
        MongoClient cliente = new MongoClient();

        //definindo o banco que vou utilizar
        MongoDatabase bancoDados = cliente.getDatabase(database);

        // definindo a collection quer vou utilizar
        MongoCollection<Document> alunos = bancoDados.getCollection(collection);

        // vai trazer o primeiro aluno.
        //O tipo é 'Document' pois o Mongo guarda documentos (json)
        Document aluno = alunos.find().first();

        //fechar conexao
        cliente.close();

        return aluno;
    }

    public void insert(String database, String collection, Document documenteSalvar){

        MongoClient cliente = new MongoClient();
        MongoDatabase bancoDados = cliente.getDatabase(database);
        MongoCollection<Document> alunos = bancoDados.getCollection(collection);
        //insert de data
        alunos.insertOne(documenteSalvar);
        cliente.close();
//        return documenteSalvar;
//        return new Document();
    }

    public void update(String database, String collection,Bson filtro, Document documenteUpdate){
        MongoClient cliente = new MongoClient();
        MongoDatabase bancoDados = cliente.getDatabase(database);
        MongoCollection<Document> alunos = bancoDados.getCollection(collection);
        //insert de data
        alunos.updateOne(filtro, new Document("$set", documenteUpdate));
    }

    public void excluir(String database, String collection,Bson filtro){
        MongoClient cliente = new MongoClient();
        MongoDatabase bancoDados = cliente.getDatabase(database);
        MongoCollection<Document> alunos = bancoDados.getCollection(collection);
        //insert de data
        alunos.deleteOne(filtro);
    }

    public List<Document> listaAlunosComInterator(){

        MongoClient cliente = new MongoClient();
        MongoDatabase bancoDados = cliente.getDatabase("test");
        MongoCollection<Document> alunos = bancoDados.getCollection("alunos");

        List<Document> resultado = new ArrayList<>();

        //permite que eu tenha interaçoers com os resultados
        MongoCursor<Document> listaComInterator = alunos.find().iterator();
        while (listaComInterator.hasNext()){
            resultado.add(listaComInterator.next());
        }
        cliente.close();

        return resultado;
    }
}
