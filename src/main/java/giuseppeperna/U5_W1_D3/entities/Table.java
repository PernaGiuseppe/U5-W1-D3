package giuseppeperna.U5_W1_D3.entities;

public class Table {

    private int numTable;
    private int numMaxCoperti;
    private boolean isFree;
    private double costoCoperto;

    public Table(int numTable, int numMaxCoperti, boolean isFree, double costoCoperto) {
        this.numTable = numTable;
        this.numMaxCoperti = numMaxCoperti;
        this.isFree = isFree;
        this.costoCoperto = costoCoperto;
    }

    public void print() {
        System.out.println("numero tavolo--> " + numTable);
        System.out.println("numero massimo coperti--> " + numMaxCoperti);
        System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
    }

    public int getNumTable() {
        return numTable;
    }

    public int getNumMaxCoperti() {
        return numMaxCoperti;
    }

    public boolean isFree() {
        return isFree;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }
}
