package models;

import java.util.List;
import java.util.ArrayList;

public class Motorista {
    private String nome;
    private List<Turno> turnos;

    public Motorista(String nome) {
        this.nome = nome;
        this.turnos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void adicionarTurno(Turno turno) {
        turnos.add(turno);
    }
}