package dominio;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Arbol<E> implements InterfazArbol <E> {

    private class Nodo <E> {
        public E info;
        public InterfazArbol<E> izq,der;

        public Nodo (E raiz, Arbol <E> izq, Arbol<E> der){
            
            info = raiz;
            this.izq = izq;
            this.der = der;
        }
    }

        Nodo <E> raiz = null;
        public Arbol(){}
        public Arbol(E raiz, Arbol<E> izq, Arbol<E> der){
            
            this.raiz = new Nodo <E> (raiz, izq, der);
        }

        public Arbol (E raiz){
            this.raiz = new Nodo <E> (raiz, new Arbol <E>(), new Arbol<E>());
        }
        public E raiz (){
            return raiz.info;
        }

        public InterfazArbol <E> izq(){
            return raiz.izq;
        }

        public InterfazArbol <E> der(){
            return raiz.der;
        }

        public String recorrerInOrden (){

            if(isVacio()){
                return "";
            }
        return izq().recorrerInOrden() + 
             raiz().toString() + 
             der().recorrerInOrden();
        }

        public String recorrerPostOrden (){
            if(isVacio()){
                return "";
            }
        return izq().recorrerPostOrden() +  
             der().recorrerPostOrden() +
             raiz().toString();
        }
        public String recorrerPreOrden (){

             if(isVacio()){
            return "";
        }
         return  raiz().toString() +  
             izq().recorrerPreOrden() +
             der().recorrerPreOrden();
    }

    public ArrayList<E> filtrar(Predicate <E> p, ArrayList <E> lista){
        if (isVacio()){

            return lista;
        }

        izq().filtrar(p, lista);
        if (p.test(raiz())){
            lista.add(raiz());
        }

        der().filtrar(p, lista);

        return lista;

    }

        public InterfazArbol <E> aplicar (Consumer <E> c){
            if (isVacio()){

                return this;
            }
            izq().aplicar(c);
            c.accept(raiz());
            der().aplicar(c);

            return this;
        }

         public boolean isVacio(){

        return raiz == null;
    }

}
