package aluno;

public class Cpf {

    private String cpf;

    public Cpf(String cpf) {
        if (cpf == null || cpf.matches("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF Invalido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
