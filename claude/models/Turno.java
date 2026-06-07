package models;

import enums.TurnoEnum;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Turno {
    private TurnoEnum periodo;
    private LocalDateTime horario;
    private int capacidadeMaxima;
    private List<Passageiro> passageirosConfirmados;

    public Turno(TurnoEnum periodo, LocalDateTime horario, int capacidadeMaxima) {
        this.periodo = periodo;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.passageirosConfirmados = new ArrayList<>();
    }

    public TurnoEnum getPeriodo() {
        return periodo;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public boolean isLotado() {
        return passageirosConfirmados.size() >= capacidadeMaxima;
    }

    public List<Passageiro> getPassageirosConfirmados() {
        return passageirosConfirmados;
    }

    public boolean adicionarPassageiro(Passageiro passageiro) {
        if (isLotado()) {
            return false;
        }
        passageirosConfirmados.add(passageiro);
        return true;
    }

    public void removerPassageiro(Passageiro passageiro) {
        passageirosConfirmados.remove(passageiro);
    }
}