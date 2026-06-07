package models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import enums.TurnoEnum;

public class Turno {

    private TurnoEnum periodo;
    private LocalDate dia;
    private LocalTime horario;
    private int capacidadeMaxima;
    private List<Passageiro> passageirosConfirmados;
    private Motorista motorista;

    public Turno(
            TurnoEnum periodo,
            LocalDate dia,
            LocalTime horario,
            int capacidadeMaxima,
            List<Passageiro> passageirosConfirmados,
            Motorista motorista) {
        this.periodo = periodo;
        this.dia = dia;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.passageirosConfirmados = passageirosConfirmados;
        this.motorista = motorista;
    }

    public TurnoEnum getPeriodo() {
        return periodo;
    }

    public void setPeriodo(TurnoEnum periodo) {
        this.periodo = periodo;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
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

    public boolean estaLotado() {
        return passageirosConfirmados != null
                && passageirosConfirmados.size() >= capacidadeMaxima;
    }

    public void adicionarPassageiroConfirmado(Passageiro passageiro) {
        if (passageirosConfirmados == null) {
            passageirosConfirmados = new ArrayList<>();
        }
        passageirosConfirmados.add(passageiro);
    }
}