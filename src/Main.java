//******************************************************************** //
// Main.java     Auteur: Gansonre Ismael
// //  Laucher du programme
//******************************************************************//
import java.util.Scanner;


public class Main {
private static Scanner Scanner;
    public static void main(String[] args) {
        int choixMenu = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Additionner des matrices\n");
        //Pour les testes
        double[][] add1 = {{5,0,2},{6,-4,4},{1,4,1}};
        Matrice matrice1 = new Matrice(add1);
        double[][] add2 = {{4,1,0},{4,-4,3},{2,-8, 1}};
        Matrice matrice2 = new Matrice(add2);
        System.out.println("Affichage des matrices\n");
        matrice1.afficherMatrice();
        matrice2.afficherMatrice();
        System.out.println("Resultats \n");
        Matrice matriceResultat = matrice1.additionner(matrice2);
        matriceResultat.afficherMatrice();

        //Affichage du menu principal
       /* do {
            System.out.println("***************MENU********************");
            System.out.println("  Faite # pour  Entrer une nouvelle matrice  deux dimension");
            System.out.println(" Faite 1 pour Additionner deux matrices           *");
            System.out.println(" Faite 2 Multiplier deux matrices      *");
            System.out.println("Faite 3 pour Multiplier plusieurs matrices et obtenir le nombre d'opérations *");
            System.out.println("Faite 4 pour Calculer le déterminant d'une matrice                       *");
            System.out.println("Faite 5 pour Calculer la co-matrixe d'une matrice                       *");
            System.out.println("Faite 6 pour Inverser une matrice                        *");
            System.out.println("Faite 7 pour Calculer la trace d'une matrice                         *");
            System.out.println("Faite 8 pour Obtenir la transposée d'une matrice\"                         *");
            System.out.println("Faite 9 pourVérifier si une matrice est triangulaire                     *");
            System.out.println("Faite Q pour Quitter le programme                         *");



            System.out.println("******************************************************");



            switch (choixMenu) {
                case '1': additionner(Matrice matrice);
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case '8':
                    break;
                case '9':
                    break;
                case 'Q': //Do nothing, program will close...
                    break;
            }
        }
        while(choixMenu != 'Q') ;

        //Closing the scanner
        scanner.close();*/
    }



    }


