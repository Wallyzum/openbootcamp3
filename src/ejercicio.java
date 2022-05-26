public class ejercicio {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Armando Paredes");
        persona.setEdad(45);
        persona.setTelefono(376557874);
        System.out.println(persona.getNombre() + " de "+persona.getEdad() +" años, dejo como contacto el numero "+ persona.getTelefono());
        Persona persona2= new Persona(22, "Jose Perez", 399877542);
        System.out.println(persona2.getNombre() + " de "+persona2.getEdad() +" años, dejo como contacto el numero "+ persona2.getTelefono());

    }
}
