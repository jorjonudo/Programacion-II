import java.util.*;

// Clase que representa una asignatura con ID, nombre, semestre y créditos ECTS
class Asignatura {
    String id;
    String nombre;
    int semestre;
    int ects;

    public Asignatura(String id, String nombre, int semestre, int ects) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.ects = ects;
    }

    // Se consideran iguales dos asignaturas si tienen el mismo ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

// Clase que representa un máster con ID, nombre y conjunto de asignaturas
class Master {
    String id;
    String nombre;
    Set<Asignatura> asignaturas;

    public Master(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.asignaturas = new HashSet<>();
    }

    // Añade una asignatura al máster
    public void addAsignatura(Asignatura a) {
        asignaturas.add(a);
    }

    // Devuelve el conjunto de asignaturas del máster
    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}

// Clase que representa un doble máster, compuesto por dos másters simples
class DobleMaster extends Master {
    Master master1;
    Master master2;
    Map<Asignatura, Asignatura> convalidaciones;

    public DobleMaster(String id, String nombre, Master master1, Master master2) {
        super(id, nombre);
        this.master1 = master1;
        this.master2 = master2;
        this.convalidaciones = new HashMap<>();
    }

    // Añade una convalidación entre una asignatura del máster simple y una del doble máster
    public void addConvalidacion(Asignatura original, Asignatura equivalente) {
        convalidaciones.put(original, equivalente);
    }

    // Valida si el doble máster cumple todas las reglas de consistencia
    public boolean validar() {
        return cobertura(master1) && cobertura(master2) && precision() && secuenciacionCorrecta();
    }

    // Comprueba la cobertura de un máster: todas sus asignaturas deben estar en el doble máster o tener equivalencia
    private boolean cobertura(Master master) {
        for (Asignatura a : master.getAsignaturas()) {
            boolean cubierta = asignaturas.contains(a) || convalidaciones.containsKey(a);
            if (!cubierta) return false;
        }
        return true;
    }

    // Comprueba que el doble máster solo contiene asignaturas de los másters simples o equivalencias
    private boolean precision() {
        for (Asignatura a : asignaturas) {
            if (!master1.getAsignaturas().contains(a) && !master2.getAsignaturas().contains(a)
                && !convalidaciones.containsValue(a)) {
                return false;
            }
        }
        return true;
    }

    // Verifica que las asignaturas convalidadas están en el mismo semestre
    private boolean secuenciacionCorrecta() {
        for (Map.Entry<Asignatura, Asignatura> entry : convalidaciones.entrySet()) {
            if (entry.getKey().semestre != entry.getValue().semestre) {
                return false;
            }
        }
        return true;
    }
} 

// Clase de prueba para verificar el correcto funcionamiento del validador de doble máster
class TestDobleMaster {
    public static void main(String[] args) {
        Asignatura a1 = new Asignatura("A1", "Matemáticas", 1, 6);
        Asignatura a2 = new Asignatura("A2", "Programación", 1, 6);
        Asignatura a3 = new Asignatura("A3", "Bases de Datos", 2, 6);
        Asignatura a4 = new Asignatura("A4", "Sistemas", 2, 6);

        Master m1 = new Master("M1", "Ingeniería Informática");
        Master m2 = new Master("M2", "Ciencia de Datos");
        m1.addAsignatura(a1);
        m1.addAsignatura(a2);
        m2.addAsignatura(a3);
        m2.addAsignatura(a4);

        DobleMaster dm = new DobleMaster("DM", "Doble Master Info+Datos", m1, m2);
        dm.addAsignatura(a1);
        dm.addAsignatura(a2);
        dm.addAsignatura(a3);
        dm.addAsignatura(a4);

        System.out.println("Validación correcta: " + dm.validar());
    }
}
