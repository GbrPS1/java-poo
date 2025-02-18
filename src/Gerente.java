import abstractClasses.Funcionario;

public class Gerente extends Funcionario {
    private double previdencia, adicional;

    public double getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public Gerente(int ID, String nome, double salario, double adicional){
        super(ID, nome, salario);
        this.setPrevidencia(0.07);
        this.setAdicional(adicional);
    }
    public void alteraAdicional(double novo_percentual){
        this.adicional = adicional*(1+novo_percentual);
    }
    public double getSalario(){
        return(salario*((1- this.getPrevidencia())+ this.getAdicional()));
    }
}
