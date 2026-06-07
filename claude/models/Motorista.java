package models;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private List<models.Turno> turnos;

    public Motorista(String nome) {
        this.nome = nome;
        this.turnos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<models.Turno> getTurnos() {
        return turnos;
    }

    public void adicionarTurno(models.Turno turno) {
        this.turnos.add(turno);
    }
}