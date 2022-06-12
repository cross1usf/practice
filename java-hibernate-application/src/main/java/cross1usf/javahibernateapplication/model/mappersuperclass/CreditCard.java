package cross1usf.javahibernateapplication.model.mappersuperclass;

import org.hibernate.annotations.NotFound;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class CreditCard extends BillingDetails{

    protected Long id;
    @NotNull
    protected String cardNumber;
    @NotNull
    protected String expMonth;
    @NotNull
    protected String expYear;


}
