package models;

public class Passageiro {

    private String nome;
    private Turno turnoSelecionado;
    private boolean participacaoConfirmada;

    public Passageiro(String nome, Turno turnoSelecionado, boolean participacaoConfirmada) {
        this.nome = nome;
        this.turnoSelecionado = turnoSelecionado;
        this.participacaoConfirmada = participacaoConfirmada;
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

    public void setTurnoSelecionado(Turno turnoSelecionado) {
        this.turnoSelecionado = turnoSelecionado;
    }

    public boolean isParticipacaoConfirmada() {
        return participacaoConfirmada;
    }

    public void setParticipacaoConfirmada(boolean participacaoConfirmada) {
        this.participacaoConfirmada = participacaoConfirmada;
    }

    public boolean confirmarParticipacao() {
        if (turnoSelecionado == null || turnoSelecionado.estaLotado()) {
            return false;
        }

        participacaoConfirmada = true;
        turnoSelecionado.adicionarPassageiroConfirmado(this);

        if (turnoSelecionado.getMotorista() != null) {
            turnoSelecionado.getMotorista().registrarConfirmacao(this);
        }

        return true;
    }

    public void cancelarConfirmacao() {
        participacaoConfirmada = false;
    }
}