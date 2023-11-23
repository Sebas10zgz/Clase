public class Texto {
    String cadena;

    public Texto(String cadena){
        this.cadena = cadena;
    }
    public String reemplazar(String texto_v, String texto_n){

        String newCadena = this.cadena.replace(texto_v, texto_n);
        return newCadena;
    }
}
