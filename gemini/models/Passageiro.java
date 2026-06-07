package models;

public class Passageiro {
    private String nome;
    private boolean logado;

    public Passageiro() {
    }

    public Passageiro(String nome, boolean logado) {
        this.nome = nome;
        this.logado = logado;
    }

    public void confirmarParticipacao(Turno turno) {
        if (logado && turno != null) {
            turno.adicionarPassageiro(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}