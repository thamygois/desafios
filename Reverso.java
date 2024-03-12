public class Reverso {
    public static void main(String[] args) throws Exception {

         // Entrada de dados

         String frase = "Olá, mundo!";
         String frase2 = "";

         for (int i = frase.length()-1; i>=0; i--){
            frase2 = frase2 + frase.charAt(i);
         }

         System.out.println("A String em reverso é: " + frase2);
    }
}
