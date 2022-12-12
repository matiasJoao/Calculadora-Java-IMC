public class CalculoImc {
    double resultado;
    public  double ImcCalcu(double peso, double altura){
        resultado = peso / (altura * altura);
        return resultado;
    }

}
