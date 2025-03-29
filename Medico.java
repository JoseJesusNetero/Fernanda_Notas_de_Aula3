// Classe Médico
public class Medico {
    private boolean trabalhaNoHospital;

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        System.out.println("O médico está tratando um paciente.");
    }
}

// Classe Clínico Geral (herda de Médico)
public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
        System.out.println("O clínico geral está receitando medicamentos.");
    }
}

// Classe Cirurgião (herda de Médico)
public class Cirurgiao extends Medico {

    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    @Override
    public void tratarPaciente() {
        System.out.println("O cirurgião está tratando um paciente com intervenção cirúrgica.");
    }

    public void fazerIncisao() {
        System.out.println("O cirurgião está fazendo uma incisão.");
    }
}
