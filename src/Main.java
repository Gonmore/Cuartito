public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.edad=35;
        cliente1.nombre="Gonchito";
        cliente1.telefono=65164774;
        cliente1.credito=2000;
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.edad);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad=41;
        trabajador1.nombre="Magallanes";
        trabajador1.telefono=800232;
        trabajador1.salario=25000;
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.salario);

    }

}
class Persona {
    int edad;
    String nombre;
    int telefono;

}
class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int salario;
}