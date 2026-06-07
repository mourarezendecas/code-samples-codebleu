package models;

public class Passageiro {
    private String nome;
    private boolean logado;

    public Passageiro(String nome, boolean logado) {
        this.nome = nome;
        this.logado = logado;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLogado() {
        return logado;
    }

    public boolean confirmarParticipacao(Turno turno) {
        if (!this.logado) {
            return false;
        }
        return turno.adicionarPassageiro(this);
    }

    public void cancelarConfirmacao(Turno turno) {
        turno.removerPassageiro(this);
    }
}