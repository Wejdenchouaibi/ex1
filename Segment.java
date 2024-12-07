class Segment {
    private int extr1;  // Première extrémité du segment
    private int extr2;  // Deuxième extrémité du segment

    // Constructeur pour initialiser les extrémités du segment
    public Segment(int extr1, int extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
    }

    // Méthode pour calculer la longueur du segment
    public int longueur() {
        return Math.abs(extr2 - extr1);
    }

    // Méthode pour savoir si un point appartient au segment
    public boolean appartient(int point) {
        return (point >= Math.min(extr1, extr2)) && (point <= Math.max(extr1, extr2));
    }
    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Segment (" + Math.min(extr1, extr2) + ", " + Math.max(extr1, extr2) + ")";
    }
}