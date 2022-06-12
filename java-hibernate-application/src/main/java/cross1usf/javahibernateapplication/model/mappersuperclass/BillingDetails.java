package cross1usf.javahibernateapplication.model.mappersuperclass;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BillingDetails {


    protected String owner;

    public BillingDetails() {
    }

    public BillingDetails(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
