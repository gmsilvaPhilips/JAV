import java.util.*;

public class Pergunta {
    private String enunciado;
    private ArrayList<Resposta> respostas;
    private Integer peso;

    public Pergunta(String enunciado) {
        this.enunciado = enunciado;
    }

    public Pergunta(String enunciado, ArrayList<Resposta> respostas, Integer peso) {
        this.enunciado = enunciado;
        this.respostas = respostas;
        this.peso = peso;
    }

    public Pergunta() {
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void embaralharRespostas() {
        Collections.shuffle(respostas);
    }

    // Verificar se peso realmente é atributo desta classe
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void adicionarResposta(Resposta resposta) {
        this.respostas.add(resposta);
    }

    public ArrayList<Resposta> getRespostas() {
        return respostas;
    }

    @Override
    public String toString() {
        return "Enunciado: " + this.enunciado + "\n" +
                "a) " + this.respostas.get(0) + "\n" +
                "b) " + this.respostas.get(1) + "\n" +
                "c) " + this.respostas.get(2) + "\n" +
                "d) " + this.respostas.get(3) + "\n";
    }

}
