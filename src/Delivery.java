/**
 * Created by briandunne on 22/06/2016.
 */
public class Delivery {

    private String referenceNumber;
    private String intendedRecipient;
    private Caretaker processedBy;


    public Delivery(){
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getIntendedRecipient() {
        return intendedRecipient;
    }

    public Caretaker getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(Caretaker processedBy) {
        this.processedBy = processedBy;
    }

    public void setIntendedRecipient(String intendedRecipient) {
        this.intendedRecipient = intendedRecipient;
    }
}
