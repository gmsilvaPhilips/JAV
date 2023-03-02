import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        ArrayList<Pergunta> perguntas = new ArrayList<>();
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

                perguntas.add(objPergunta);

                // Pula linha entre as perguntas
                scanner.nextLine();
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
