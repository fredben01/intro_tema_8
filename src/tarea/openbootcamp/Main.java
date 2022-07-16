package tarea.openbootcamp;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(120);
        persona.setNombre("Freddy");
        persona.setTelefono("987654321");

        System.out.println("Persona{ Edad: "+ persona.getEdad() +
                ", Nombre: "+ persona.getNombre() + ", Telefono: "+
                persona.getTelefono() + " }");

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }
}