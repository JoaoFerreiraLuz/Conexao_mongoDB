package aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String nuimero){

        //matches verifica expresão regular de uma string em java
        if(ddd != null && nuimero != null && !ddd.matches("\\d{2}") && !numero.matches("\\d{8}| \\d{9}")){
            throw new IllegalArgumentException("numero de telefone invalido");
        }
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
