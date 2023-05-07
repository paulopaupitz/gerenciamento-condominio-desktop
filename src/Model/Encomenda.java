package Model;

/**
 *
 * @author paupi
 */
public class Encomenda {
    private int id;
    private Morador morador;

    public Encomenda(int id, Morador morador) {
        this.id = id;
        this.morador = morador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }
    
    
    
}
