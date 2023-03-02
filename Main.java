import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        boolean continuar;
        Scanner sc = new Scanner(System.in);
        Quiz jogo = new Quiz();
        continuar = jogo.iniciarJogo(sc);
        sc.close();

        while(continuar == true)
        {
            
        }

    }

}