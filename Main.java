public class Main {
    public static void main(String[] args) {
        try {
            int risultato = controlloValori(10, 5);
            System.out.println("Risultato divisione = " + risultato);
        } catch (Exception e){
            System.out.println("Errore: " + e);
        }
    }
    public static int controlloValori(Integer numeratore, Integer denominatore) {
        if(numeratore == null || denominatore == null){
            throw new NullPointerException("I valori non devono essere null!");
        }
        if(denominatore == 0){
            throw new ArithmeticException("Un numero non si puo dividere per 0");
        }
        return numeratore / denominatore;
    }
}