package co.poli.ppi.lista;

import co.poli.ppi.entidades.Anotacion;

/**
 * Declaración de la clase ListaRegistro
 *
 * @author Juan David Cobos Cano
 * @version 9/07/17
 */
public class ListaRegistro {

    /**
     * Declaración de los atributos privados
     */
    private Nodo inicio;
    private int tamaño;

    /**
     * Creación del construtor
     */
    public ListaRegistro() {
        this.inicio = null;
        this.tamaño = 0;
    }

    /**
     * Creación de los Getter y Setter
     */
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean listaVacia() {
        return inicio == null;
    }

    /**
     * Método para insertar al inicio de la lista
     */
    public void insertarAlinicio(Anotacion registro) {
        Nodo nuevonodo = new Nodo(registro);
        if (listaVacia()) {
            inicio = nuevonodo;
        } else {

            inicio = nuevonodo;
            nuevonodo.setSiguiente(inicio);

        }
        tamaño++;

    }

    /**
     * Método para buscar un dato en la lista
     */
    public boolean buscar(int codigo) {
        boolean encontro = false;
        Nodo aux = inicio;
        while (aux != null && encontro != true) {
            if (aux.getRegistro().getCodigo() == codigo) {
                encontro = true;
                break;
            }
            aux = aux.getSiguiente();
        }

        return encontro;
    }
    
    /**
     * Método para buscar un dato en la lista
     */
    public Anotacion buscarAnotacion(int codigo) {
        Anotacion anotacion = null;
        boolean encontro = false;
        Nodo aux = inicio;
        while (aux != null && encontro != true) {
            if (aux.getRegistro().getCodigo() == codigo) {
                encontro = true;
                anotacion.setCodigo(aux.getRegistro().getCodigo());
                anotacion.setDescargos(aux.getRegistro().getDescargos());
                anotacion.setDescripcion(aux.getRegistro().getDescripcion());
                anotacion.setFecha(aux.getRegistro().getFecha());
                anotacion.setNombreDocente(aux.getRegistro().getNombreEstudiante());
                anotacion.setTipo(aux.getRegistro().getTipo());
               
                break;
            }
            aux = aux.getSiguiente();
        }
 
        return anotacion;
    }    

    /**
     * Método para editar la anotación en la lista
     */
    public void editar(Anotacion registro) {
        if (buscar(registro.getCodigo())) {
            Nodo aux = inicio;
            while (aux.getRegistro().getCodigo() != registro.getCodigo()) {
                aux = aux.getSiguiente();

            }
            aux.setRegistro(registro);
        } else {
            System.out.println(" no existe");

        }

    }

    /**
     * Método para eliminar en la lista
     */
    public void eliminarEstudiante(int codigoAnotacion) {
        if (buscar(codigoAnotacion)) {
            if (tamaño == 1) {
                inicio = null;
            } else {
                Nodo anterior = inicio;
                Nodo actual = inicio;
                while (actual.getRegistro().getCodigo() != codigoAnotacion) {
                    anterior = actual;
                    actual = actual.getSiguiente();
                }
                anterior.setSiguiente(actual.getSiguiente());
            }
            tamaño--;

        }
    }

    /**
     * Método para mostrar las anotaciones realizadas en la lista
     */
    public String listar() {
        String listado = "** Listado de Anotaciones**\n";
        Nodo aux = inicio;
        while (aux != null) {
            listado = listado + aux.getRegistro();
            aux = aux.getSiguiente();
        }
        return listado;
    }

}
