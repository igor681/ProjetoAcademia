package Tabela;


import Modelo.Cargo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelaCargo extends AbstractTableModel {

    private List<Cargo> cargos;
    private String[] nomeColunas = {"Nome", "Salario"};

    private final int COLUNA_NOME = 0;
    private final int COLUNA_SALARIO = 1;
  

    public TabelaCargo(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    @Override
    public int getRowCount() {
        return cargos.size();
    }

    @Override
    public int getColumnCount() {
        return nomeColunas.length;
    }

    @Override
    public String getColumnName (int column){
        return nomeColunas[column];
    }

    public void atualizar() {
        this.fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cargo cargo = cargos.get(rowIndex);
        String valor = null;
        switch(columnIndex){
            case COLUNA_NOME:
                valor = cargo.getNome();
                break;
            case COLUNA_SALARIO:
                valor = cargo.getSalario();
                break;
            
        }

        return valor;
    }

    public void addRow(Cargo carg){
        this.cargos.add(carg);
        this.fireTableDataChanged();
    }

    public List<Cargo> getCargo() {
        return cargos;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    	Cargo cargo = this.cargos.get(rowIndex);

        switch (columnIndex) {
            case COLUNA_NOME:
                cargo.setNome((String) aValue);
                break;
            case COLUNA_SALARIO:
                cargo.setSalario((String) aValue);
                break;
           
        }
        //este método é que notifica a tabela que houve alteração de dados
        fireTableDataChanged();
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

}