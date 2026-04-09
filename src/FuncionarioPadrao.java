public class FuncionarioPadrao extends Colaborador {

    public FuncionarioPadrao(int matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public double calcularExtras() {
        return 0.0;
    }

    @Override
    public String getTipo() {
        return "Funcionário Padrão";
    }

    @Override
    public void exibirDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário Base: R$ " + SALARIO_BASE);
        System.out.println("Extras: R$ " + calcularExtras());
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
        System.out.println("-----------------------------------");
    }
}
