package fr.yassine;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        import java.util.Scanner;

        public class App {
        
            public static void main(String[] args) {
                Scanner clavier = new Scanner(System.in);
                double salaireDeBase = 400;
        
                double primePotentielle = 250;
        
                System.out.println("Veuillez saisir votre nombre de ventes :");
                int nbDeVentes = clavier.nextInt();
        
                double salaireFinal = salaireDeBase;
        
                if (nbDeVentes > 10) {
                    salaireFinal = salaireDeBase + primePotentielle;
                }
        
                System.out.println("le salaire est de " + salaireFinal + " euros ");
    }

}
