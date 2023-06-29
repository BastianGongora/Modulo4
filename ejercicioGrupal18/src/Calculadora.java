public class Calculadora {
    private double numero1,numero2;

    public Calculadora() {
    }
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // * Metodos

    public double sumar(double numero1,double numero2){
        return numero1+numero2;
    }

    public double restar(double numero1,double numero2){
        return numero1-numero2;
    }

    public double multiplicar(double numero1,double numero2){
        return numero1*numero2;
    }

    public double dividir(double numerador,double denominador){
        if(denominador!=0){
            return numerador/denominador;
        }else{
            return 0;
        }
    }

}
