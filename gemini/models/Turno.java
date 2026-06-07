package models;

import enums.TurnoEnum;
import java.util.List;
import java.util.ArrayList;

public class Turno {
    private TurnoEnum periodo;
    private String dia;
    private String horario;
    private int capacidadeMaxima;
    private List<Passageiro> passageirosConfirmados;
    private Motorista motorista;

    public Turno() {
        this.passageirosConfirmados = new ArrayList<>();
    }

    public Turno(TurnoEnum periodo, String dia, String horario, int capacidadeMaxima, Motorista motorista) {
        this.periodo = periodo;
        this.dia = dia;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.motorista = motorista;
        this.passageirosConfirmados = new ArrayList<>();
    }

    public boolean adicionarPassageiro(Passageiro passageiro) {
        if (passageirosConfirmados.size() < capacidadeMaxima) {
            passageirosConfirmados.add(passageiro);
            return true;
        }
        return false;
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

    public List<Passageiro> getPassageirosConfirmados() {
        return passageirosConfirmados;
    }

    public void setPassageirosConfirmados(List<Passageiro> passageirosConfirmados) {
        this.passageirosConfirmados = passageirosConfirmados;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}