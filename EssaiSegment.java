public class EssaiSegment {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java EssaiSegment <extr1> <extr2> <point>");
            return;
        }

        // Récupération des arguments depuis la ligne de commande
        int extr1 = Integer.parseInt(args[0]);
        int extr2 = Integer.parseInt(args[1]);
        int point = Integer.parseInt(args[2]);

        // Création du segment
        Segment segment = new Segment(extr1, extr2);

        // Affichage du segment
        System.out.println("Segment créé: " + segment.toString());

        // Affichage de la longueur du segment
        System.out.println("Longueur du segment: " + segment.longueur());

        // Vérification si le point appartient au segment
        if (segment.appartient(point)) {
            System.out.println("Le point " + point + " appartient au segment.");
        } else {
            System.out.println("Le point " + point + " n'appartient pas au segment.");
        }
    }
}
