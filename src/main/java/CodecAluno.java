import aluno.Aluno;
import aluno.Cpf;
import aluno.Email;
import org.bson.BsonReader;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.codecs.CollectibleCodec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
//import sun.net.idn.Punycode;

public class CodecAluno implements CollectibleCodec<Aluno> {

    @Override
    public void encode(BsonWriter bsonWriter, Aluno aluno, EncoderContext encoderContext) {
        String uiId = aluno.getUiId();
        String nome = aluno.getNome();
        Cpf cpf = aluno.getCpf();
        Email email = aluno.getEmail();
    }

    @Override
    public Aluno generateIdIfAbsentFromDocument(Aluno aluno) {
        return null;
    }

    @Override
    public boolean documentHasId(Aluno aluno) {
        return false;
    }

    @Override
    public BsonValue getDocumentId(Aluno aluno) {
        return null;
    }

    @Override
    public Class<Aluno> getEncoderClass() {
        return null;
    }

    @Override
    public Aluno decode(BsonReader bsonReader, DecoderContext decoderContext) {
        return null;
    }
}
