package models;

import enums.TurnoEnum;
import java.util.List;
import java.util.ArrayList;

public class Turno {
    private TurnoEnum periodo;
    private String dia;
    private String horario;
    private int capacidadeMaxima;
    private List<Passageiro> confirmados;

    public Turno(TurnoEnum periodo, String dia, String horario, int capacidadeMaxima) {
        this.periodo = periodo;
        this.dia = dia;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.confirmados = new ArrayList<>();
    }

    public TurnoEnum getPeriodo() {
        return periodo;
    }

    public void setPeriodo(TurnoEnum periodo) {
        this.periodo = periodo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public List<Passageiro> getConfirmados() {
        return confirmados;
    }

    public boolean isLotado() {
        return confirmados.size() >= capacidadeMaxima;
    }

    public void adicionarConfirmado(Passageiro passageiro) {
        if (!isLotado()) {
            confirmados.add(passageiro);
        }
    }

    public void removerConfirmado(Passageiro passageiro) {
        confirmados.remove(passageiro);
    }
}