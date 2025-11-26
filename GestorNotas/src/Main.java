import Modelos.Persona;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Hello World with Java");
    System.out.println("Mi primera Persona");

    LocalDate fechaNac = LocalDate.of(2000, 5, 12);

    Persona persona1 = new Persona(
            "P001",                   // id
            "Diana",                  // nombre
            "Diaz",                  // apellido
            "diana.diaz@email.com",  // correo
            "123456789",              // número de documento
            "3001234567",             // teléfono
            fechaNac                  // fecha de nacimiento (LocalDate)
    );
    // Gestor Académico
    int edad = persona1.ObtenerEdad();
    int edadIa = persona1.ObtenerEdadPorIA();

    System.out.println("Edad: " + edad);
    System.out.println("Edad por IA: " + edadIa);

//    String info = persona1.mostrarInfoBasica();
//    System.out.println(persona1.mostrarInfoBasica());

//    String infoIA = persona1.mostrarInfoBasicaIa();
    System.out.println(persona1.mostrarInfoBasicaIa());
}
