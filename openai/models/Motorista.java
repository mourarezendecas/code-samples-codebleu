package models;

import java.util.ArrayList;
import java.util.List;

public class Motorista {

    private String nome;
    private List<Passageiro> passageirosConfirmados;

    public Motorista(String nome, List<Passageiro> passageirosConfirmados) {
        this.nome = nome;
        this.passageirosConfirmados = passageirosConfirmados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Passageiro> getPassageirosConfirmados() {
        return passageirosConfirmados;
    }

    public void setPassageirosConfirmados(List<Passageiro> passageirosConfirmados) {
        this.passageirosConfirmados = passageirosConfirmados;
    }

    public void registrarConfirmacao(Passageiro passageiro) {
        if (passageirosConfirmados == null) {
            passageirosConfirmados = new ArrayList<>();
        }
        passageirosConfirmados.add(passageiro);
    }
}