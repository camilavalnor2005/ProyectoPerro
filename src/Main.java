import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el nombre del primer perro:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la raza del primer perro:");
        String raza1 = scanner.nextLine();
        System.out.println("Ingrese la edad del primer perro:");
        int edad1 = scanner.nextInt();
        scanner.nextLine();


        Perro perro1 = new Perro(nombre1, raza1, edad1);


        System.out.println("Ingrese el nombre del segundo perro:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la raza del segundo perro:");
        String raza2 = scanner.nextLine();
        System.out.println("Ingrese la edad del segundo perro:");
        int edad2 = scanner.nextInt();


        Perro perro2 = new Perro(nombre2, raza2, edad2);


        perro1.comer("croquetas", 150);
        System.out.println(perro1.ladrar());


        perro2.comer("pollo", 200);
        System.out.println(perro2.ladrar());

        scanner.close();
    }
}