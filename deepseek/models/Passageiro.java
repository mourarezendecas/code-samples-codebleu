package models;

public class Passageiro {
    private String nome;
    private Turno turnoSelecionado;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turno getTurnoSelecionado() {
        return turnoSelecionado;
    }

    public void selecionarTurno(Turno turno) {
        this.turnoSelecionado = turno;
    }

    public void confirmarParticipacao() {
        if (turnoSelecionado != null) {
            turnoSelecionado.adicionarConfirmado(this);
        }
    }

    public void cancelarConfirmacao() {
        if (turnoSelecionado != null) {
            turnoSelecionado.removerConfirmado(this);
            this.turnoSelecionado = null;
        }
    }
}