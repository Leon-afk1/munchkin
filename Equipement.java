public class Equipement extends Carte {
    private int bonus;
    private String type;
    private String effet;
    private int prix=0;

    public Equipement(String nom, int bonus, String type, String effet, int prix) {
        super(nom);
        this.bonus = bonus;
        this.type = type;
        this.effet = effet;
        this.prix = prix;
    }

    public int getBonus() {
        return bonus;
    }

    public String getType() {
        return type;
    }

    public String getEffet() {
        return effet;
    }

    public int getPrix() {
        return prix;
    }

    public void afficherEquipement() {
        String template = "%-43s Bonus: %-10d Type: %-10s Race: %-10s%n";
        
        System.out.println("----------------------------------------------------------------------------------------------");
        
        System.out.printf(template, getNom(), getBonus(), getType(), getEffet());

    }

}