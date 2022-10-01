package ordemservico;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date dataNascimento;

    public Cliente(String nome, String email, final Date dataNascimento) throws ParseException{
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
