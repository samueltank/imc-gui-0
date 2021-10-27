package br.senai.sp.jandira.imcg.model;

import java.text.DecimalFormat;

abstract class IMC {
    public abstract void calculate(String peso, String altura);
    protected double weight;
    protected double height;
    protected String resultIMC;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setResultIMC(String resultIMC) {
        this.resultIMC = resultIMC;
    }

    public String getResultIMC() {
        return resultIMC;
    }

    public String getIMC_String() {
        return String.valueOf(getResultIMC());
    }

    public String CalcularSaidaText() {
        double resultIMC = Double.parseDouble(getResultIMC());
        if (resultIMC >= 40) {
            return "Obesidade III";
        } else if (resultIMC >= 35 && resultIMC <= 39.9) {
            return "Obesidade  II";
        } else if (resultIMC >= 30 && resultIMC <= 34.9) {
            return "Obesidade I";
        } else if (resultIMC >= 25 && resultIMC <= 29.9) {
            return "Levemente acima do peso";
        } else if (resultIMC >= 18.6 && resultIMC <= 24.9) {
            return "Peso ideal (Parabéns!)";
        } else {
            return "Abaixo do peso";
        }
    }
}

public class ValorIMC_pessoa extends IMC {
    public void calculate(String heigth, String weigth) {
        setWeight(Double.parseDouble(weigth));
        setHeight(Double.parseDouble(heigth));

        // Formatador:
        DecimalFormat df = new DecimalFormat("0.##");

        double result = (this.weight / Math.pow(this.height, 2));
        resultIMC = df.format(result);
    }
}