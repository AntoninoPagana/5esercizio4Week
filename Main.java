public class Main {
    public static void main(String[] args) {
        controlloValori(null, 8);
    }
    public static void controlloValori(Integer numeratore, Integer denominatore) {
        try {
            if (numeratore != null && denominatore != null) {
                System.out.println("I valori inseriti non sono null!!");
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e);
        }
    }
}