
package modelo;

import java.util.List;

public interface Operaciones {
   public String crear(Object obj);
    public String eliminar(Object obj);
    public String editar(Object obj);
    public List<?> consultar();
    public List<?> filtrar( String campo, String Criterio); 
}
