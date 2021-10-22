package br.senai.sp.jandira.imcg.model;

abstract class IMC {
    public abstract void calcular(String peso, String altura);
    protected double peso;
    protected double altura;
    protected double resultadoIMC;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setResultadoIMC(double resultadoIMC) {
        this.resultadoIMC = resultadoIMC;
    }

    public double getResultadoIMC() {
        return resultadoIMC;
    }

    public String getIMC_String() {
        return String.valueOf(getResultadoIMC());
    }

    public String CalcularSaidaText() {
        if (getResultadoIMC() >= 40) {
            return "Obesidade III";
        } else if (getResultadoIMC() >= 35 && getResultadoIMC() <= 39.9) {
            return "Obesidade  II";
        } else if (getResultadoIMC() >= 30 && getResultadoIMC() <= 34.9) {
            return "Obesidade I";
        } else if (getResultadoIMC() >= 25 && getResultadoIMC() <= 29.9) {
            return "Levemente acima do peso";
        } else if (getResultadoIMC() >= 18.6 && getResultadoIMC() <= 24.9) {
            return "Peso ideal (Parabéns!)";
        } else {
            return "Abaixo do peso";
        }
    }

}

public class ValorIMC_pessoa extends IMC {
    public void calcular(String altura, String peso) {
        setPeso(Double.parseDouble(peso));
        setAltura(Double.parseDouble(altura));

        resultadoIMC = (this.peso / Math.pow(this.altura, 2));
    }
}