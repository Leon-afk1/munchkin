public class Sort extends Carte {
    private int bonus;
    private String effet;
    private int prix=0;
    private int type;
    public Sort(String nom, int bonus, String effet, int prix, int type) {
        super(nom);
        this.bonus = bonus;
        this.effet = effet;
        this.prix = prix;
        this.type = type;
    }

    public int getBonus() {
        return bonus;
    }

    public String getEffet() {
        return effet;
    }

    public int getPrix() {
        return prix;
    }
    public int getType() {
        return type;
    }

    public void afficherSort() {
        System.out.println("-----------------------------------------------");
        System.out.println("Sort tiré : " + getNom() );
        if (getBonus() != 0) {
            System.out.println("Bonus : " + getBonus());
        }
        if (!getEffet().isEmpty()) {
            System.out.println("Type : " + getEffet());
        }
        if (getPrix() != 0) {
            System.out.println("Valeur : " + getPrix()  + "euros");
        }
        System.out.println("-----------------------------------------------");

    }
}