package aluno;

public class Email {

    private String email;

    public Email(String email) {

        //verificação com expresão regular de e-mail
        if(!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") && email != null){
            throw new IllegalArgumentException("E-mail Invalido");
        }else {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = validaEmail(email) ? "email" : "erro";
    }

    private Boolean validaEmail(String email){
        if(!email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") && email != null){
            throw new IllegalArgumentException("E-mail Invalido");
        }else {
            return true;
        }
    }

}
