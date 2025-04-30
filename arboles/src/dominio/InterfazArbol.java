package dominio;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface InterfazArbol <E> {
    
    public E raiz ();

    public InterfazArbol <E> izq();

    public InterfazArbol <E> der();

    public String recorrerInOrden ();

    public String recorrerPostOrden ();

    public String recorrerPreOrden ();

    public ArrayList<E> filtrar(Predicate <E> p, ArrayList <E> lista);

    public InterfazArbol <E> aplicar (Consumer<E> c);

    public boolean isVacio();
}
