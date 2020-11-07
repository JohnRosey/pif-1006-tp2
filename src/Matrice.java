/******************************************************************** //
 // Matrice.java     Auteur: Gansonre Ismael
 // //
 //******************************************************************/





 //CLASSE MATRICE

class Matrice {
    private   double[][] matrice;

    public Matrice(double[][] matrice)
    {
        this.matrice = matrice;
    }
//getter
    public double getElement(int ligne, int colonne)
    {
        return matrice[ligne][colonne];
    }
//setter
    public void setElement(int ligne, int colonne, double element)
    {
        matrice[ligne][colonne] = element;
    }

    public Matrice additionner(Matrice matrice)
    {
        double[][] elements = new double[getLignes()][getColonnes()];

        if (matricePareil(matrice))
            for (int ligne = 0;ligne < getLignes();ligne++)
                for (int colonne = 0; colonne < getColonnes();colonne++)
                    elements[ligne][colonne] = getElement(ligne, colonne) + matrice.getElement(ligne, colonne);
        else
            System.out.println("Addition impossible, les matrices sont de format diff�rent\n");

        return new Matrice(elements);
    }





    public Matrice faireProduitScalaire(Double matriceScalaire)
    {
        return this;
    }

    public Matrice faireProduitMatriciel(Matrice ProduitMatriciel)
    {
        return this;
    }
//PRORIETES (Trace, Determinants, Transposee ,CoMatrice,MatriceInverse)
    public double getTrace()
    {
        return 1;
    }

    public double getDeterminant()
    {
        return 1;
    }

    public Matrice getTransposee()
    {
        return this;
    }

    public Matrice getCoMatrice()
    {
        return this;
    }

    public Matrice getMatriceInverse()
    {
        return this;
    }

    public boolean estCarre()
    {
        return true;
    }

    public boolean estTriangulaire()
    {
        return true;
    }

    public boolean estReguliere()
    {
        return true;
    }
//Methode AfficherMatrice
    public void afficherMatrice() {
        String output = "";
        for (int ligne=0; ligne < getLignes(); ligne++) {
            output += "| ";

            for (int colonne=0; colonne < getColonnes(); colonne++) {
                output += this.matrice[ligne][colonne];
                output += " ";
            }
            output += "|"+"\n";
        }
        System.out.println(output);
    }
//Retourne la ligne et la colonne dans AfficherMatrice
    public int getLignes() {
        return matrice.length;
    }

    public int getColonnes() {
        return matrice[0].length;
    }
    private boolean matricePareil(Matrice matrice) {
        return (this.getLignes() == matrice.getLignes() &&
                this.getColonnes() == matrice.getColonnes());
    }
}

