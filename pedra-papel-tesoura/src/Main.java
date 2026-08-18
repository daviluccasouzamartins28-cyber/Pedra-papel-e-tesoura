import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        int derrota = 0;
        int vitoria = 0;
        int i = 0;
        int quantidade = 10;
        System.out.println("Seja bem-vindo(a) ao Pedra, Papel e tesoura");

        while (i < quantidade) {
        System.out.println("Escolha entre Pedra, Papel ou Tesoura");

        String[] sla = {"Pedra", "Papel", "Tesoura"};
        double numero = (int) (Math.random() * 3);

        String result = text.nextLine();

        System.out.println("Eu escolhi " + sla[(int) numero]);

        if (result.equals("Pedra") && numero == 0) {
            System.out.println("Deu empate!");
            System.out.println("O jogo está " + vitoria + "-" + derrota);
            i++;
        } else if (result.equals("Pedra") && numero == 1) {
            System.out.println("Você perdeu!");
            i++;
            derrota++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else if (result.equals("Pedra") && numero == 2) {
            System.out.println("Você ganhou!");
            i++;
            vitoria++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else if (result.equals("Papel") && numero == 0) {
            System.out.println("Você ganhou!");
            i++;
            vitoria++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else if (result.equals("Papel") && numero == 1) {
                System.out.println("Deu empate!");
                i++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else if (result.equals("Papel") && numero == 2) {
            System.out.println("Você perdeu!");
            i++;
            derrota++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else if (result.equals("Tesoura") && numero == 0) {
            System.out.println("Você perdeu!");
            i++;
            derrota++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else if (result.equals("Tesoura") && numero == 1) {
            System.out.println("Você ganhou!");
            i++;
            vitoria++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else if (result.equals("Tesoura") && numero == 2) {
            System.out.println("Deu empate!");
            i++;
            System.out.println("O jogo está " + vitoria + "-" + derrota);
        } else {
            System.out.println("Resposta inválida!!");
        }
             if (vitoria == 3) {
                System.out.println("Parabéns, Você ganhou uma melhor de 3 contra mim!!");
                break;
            } else if (derrota == 3) {
                System.out.println("Você perdeu uma melhor de 3 contra mim:(");
                break;
            }
        }
    }
    }