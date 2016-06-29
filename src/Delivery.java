/**
 * Created by briandunne on 22/06/2016.
 */
public class Delivery {

    private int referenceNumber;
    private String intendedRecipient;
    private Caretaker processedBy;


    public Delivery(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
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
