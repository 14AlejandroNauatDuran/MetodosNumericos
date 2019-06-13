
package unidad6_metodos;

/**
 *
 * @author Israel pomol Couoh
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
public class ModeloEu extends AbstractTableModel{
        private String[] cabecera = {"i", "x", "yi + 1"};
    private ArrayList<csEuler> lista;

    public ModeloEu(ArrayList<csEuler> lista) {
        this.lista = lista;
    }

    public ModeloEu() {
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.cabecera.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getX();
            case 2:
                return this.lista.get(fila).getY();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        //return super.getColumnName(i); //To change body of generated methods, choose Tools | Templates.
        return this.cabecera[i];
    }
}
