package br.senai.sp.jandira.imcg.model;

abstract class IMC {
    public abstract void calcular(Double peso, Double altura);
    protected Double peso;
    protected Double altura;
    protected Double resultadoIMC;

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setResultadoIMC(Double resultadoIMC) {
        this.resultadoIMC = resultadoIMC;
    }

    public Double getResultadoIMC() {
        return resultadoIMC;
    }

    public String resultadoFinal() {
        if (getResultadoIMC() >= 40) {
            String fraseRels = "Obesidade III";
        } else if (getResultadoIMC() <= 39.9 && getResultadoIMC() =<)
    }

}

class ImcPessoa extends IMC {
    @Override public void calcular(Double peso, Double altura) {
        setPeso(this.peso);
        setAltura(this.altura);

        Double rstIMC = (peso / (altura * altura));
        resultadoIMC = rstIMC;
    }
}