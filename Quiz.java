import java.io.File;
import java.util.*;

public class Quiz {
    private ArrayList<Pergunta> perguntas;
    private int pontuacao;

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Quiz(ArrayList<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public Quiz() {
        this.carregarPerguntas();
    }

    public void carregarPerguntas() {
        File file = new File("perguntas.txt");
        Scanner scanner;

        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String enunciade = scanner.nextLine();
                String resposta1 = scanner.nextLine();
                String resposta2 = scanner.nextLine();
                String resposta3 = scanner.nextLine();
                String resposta4 = scanner.nextLine();

                Pergunta objPergunta = new Pergunta(enunciade);
                ArrayList<Resposta> listaRespostas = new ArrayList<>();

                listaRespostas.add(new Resposta(true, resposta1));
                listaRespostas.add(new Resposta(false, resposta2));
                listaRespostas.add(new Resposta(false, resposta3));
                listaRespostas.add(new Resposta(false, resposta4));

                objPergunta.adicionarResposta(new Resposta(true, resposta1));
                objPergunta.adicionarResposta(new Resposta(false, resposta2));
                objPergunta.adicionarResposta(new Resposta(false, resposta3));
                objPergunta.adicionarResposta(new Resposta(false, resposta4));

                this.perguntas.add(objPergunta);

                // Pula linha entre as perguntas
                scanner.nextLine();
            }
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    };

    public ArrayList<Pergunta> embaralharPerguntas() {

        Collections.shuffle(this.perguntas);

        ArrayList<Pergunta> cincoPerguntas = new ArrayList<>();

        cincoPerguntas.add(this.perguntas.get(0));
        cincoPerguntas.add(this.perguntas.get(1));
        cincoPerguntas.add(this.perguntas.get(2));
        cincoPerguntas.add(this.perguntas.get(3));
        cincoPerguntas.add(this.perguntas.get(4));

        this.definirPeso(cincoPerguntas);

        return cincoPerguntas;
    }

    public void definirPeso(ArrayList<Pergunta> perguntas) {
        for (int i = 0; i < perguntas.size(); i++) {
            Pergunta pergunta = perguntas.get(i);
            pergunta.setPeso(i + 1);
        }
    }

    public boolean iniciarJogo(Scanner scanner) {
        System.out.println("Iniciar Jogo? Y/N");
        String menu = scanner.nextLine();
        if (menu.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

}
