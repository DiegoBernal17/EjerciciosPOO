package unidad2.examen;

import java.util.Objects;

/**
 *
 * @author Bernal
 */
public class Equipaje {
    private String Owner;
    private String From;
    private String To;
    private String Firm;
    
    public Equipaje(String owner, String from, String to, String firm)
    {
        this.Owner = owner;
        this.From = from;
        this.To = to;
        this.Firm = firm;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public void setFirm(String Firm) {
        this.Firm = Firm;
    }

    public String getOwner() {
        return Owner;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }

    public String getFirm() {
        return Firm;
    }

    @Override
    public String toString() {
        return "Dueño: " + Owner + ", Embarque: " + From + ", Destino: " + To + ", Empresa transportadora: " + Firm + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.Owner);
        hash = 23 * hash + Objects.hashCode(this.From);
        hash = 23 * hash + Objects.hashCode(this.To);
        hash = 23 * hash + Objects.hashCode(this.Firm);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipaje other = (Equipaje) obj;
        if (!Objects.equals(this.Owner, other.Owner)) {
            return false;
        }
        if (!Objects.equals(this.From, other.From)) {
            return false;
        }
        if (!Objects.equals(this.To, other.To)) {
            return false;
        }
        if (!Objects.equals(this.Firm, other.Firm)) {
            return false;
        }
        return true;
    }
    
}
