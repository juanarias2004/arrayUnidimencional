public class arrayUnidimencional {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        nombres[0]= "Lina ";
        nombres[1]= "diego";
        nombres[2]= "oscar";
        nombres[3]= "cristina";
        nombres[4]= "ximena";

        System.out.printf(nombres[4]);


        for (int i = 0; i > nombres.length; i++) {
            System.out.printf(nombres[i]);
        }
    }
}
