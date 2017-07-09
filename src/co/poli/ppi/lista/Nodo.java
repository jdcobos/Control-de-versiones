package co.poli.ppi.lista;

import co.poli.ppi.entidades.Anotacion;

/**Declaración de la clase Nodo
 *@author Juan David Cobos Cano 
 *@version 9/07/17 
 */
class Nodo {
/**Declaración de los tributos privados 
 * 
 */
    private Nodo siguiente;
    private Anotacion registro;
    
    /**Creación de los Getter y Setter
     */

    public Nodo(Anotacion registro) {
        this.siguiente = null;
        this.registro = registro;
    }

    public Anotacion getRegistro() {
        return registro;
    }

    public void setRegistro(Anotacion registro) {
        this.registro = registro;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
