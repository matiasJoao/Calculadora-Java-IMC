import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double peso, altura, resultado;
        String res;


        System.out.println("Digite seu peso: ");
        peso = leia.nextDouble();
        System.out.println("Digite seu altura: ");
        altura = leia.nextDouble();

        CalculoImc calc = new CalculoImc();
        resultado = calc.ImcCalcu(peso, altura);

        VerificarResultadoImc verify = new VerificarResultadoImc();
        res =  verify.ImcResult(resultado);
        System.out.println(res);
    }
}