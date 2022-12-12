import java.text.DecimalFormat;

public class VerificarResultadoImc {
    String print;
    public String ImcResult (double resultado){
        String format;
        format = new DecimalFormat("#,##0.00").format(resultado);

        if(resultado < 18.5){
            print = "Seu calculo do IMC deu "+format + " , Voce esta abaixo do peso";
        }
        else if(resultado  >= 18.6 && resultado <= 24.9){
            print = "Seu calculo do IMC deu "+format + " , Voce esta Saudavel";
        }
        else if(resultado  >= 25.0 && resultado <= 29.9){
            print = "Seu calculo do IMC deu "+format + " , Voce esta com peso em excesso";
        }
        else if(resultado  >= 30.0 && resultado <= 34.9){
            print = "Seu calculo do IMC deu "+format + " , Voce esta com obesidade grau I";
        }
        else if(resultado  >= 35.0 && resultado <= 39.9){
            print = "Seu calculo do IMC deu "+format + " , Voce esta obesidade grau II(severa)";
        }
        else{
            print = "Seu calculo do IMC deu "+format + " , Voce esta obesidade grau III (morbida)";
        }
        return print;
    }
}
