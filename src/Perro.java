public class Perro {

    private String nombre;
    private String raza;
    private int edad;


    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(String tipoComida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + cantidadGramos + " gramos de " + tipoComida + ".");
    }


    public String ladrar() {
        return "guau guau";
    }
}
