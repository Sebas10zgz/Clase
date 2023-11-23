public class Main {
    public static void main(String[] args) {

        Texto objeto_texto = new Texto("Hoy es el ombligo de la semana");

        objeto_texto.reemplazar("Hoy","Mañana");
        System.out.println(objeto_texto.reemplazar("Hoy","Ayer"));
    }
}
