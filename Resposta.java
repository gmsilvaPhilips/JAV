public class Resposta {

    private boolean correta;
    private String descricao;

    public Resposta() {
    }

    public Resposta(boolean correta, String descricao) {
        this.correta = correta;
        this.descricao = descricao;
    }

    public boolean isCorreta() {
        return correta;
    }

    public void setCorreta(boolean correta) {
        this.correta = correta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}