public class Estudiante extends Persona {

    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad); // constructor del padre
        this.carnet = carnet;
    }

    public void estudiar() {
        System.out.println("Estoy aprendiendo");
    }
}
