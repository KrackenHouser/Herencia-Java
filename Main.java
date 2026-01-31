public class Main {
    public static void main(String[] args) {

        Estudiante e = new Estudiante("Ortiz", 25, "OG24014");

        System.out.println(e.nombre);  // heredado
        System.out.println(e.edad);    // heredado
        e.saludar();                   // heredado
        e.estudiar();                  // propio
    }
}
