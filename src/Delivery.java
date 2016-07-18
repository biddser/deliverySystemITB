/**
 * Created by briandunne on 22/06/2016.
 */
public class Delivery {

    private String referenceNumber;
    private String suppliersName;
    private String suppliersReference;
    private int ourPoNumber;
    private String intendedRecipient;
    private String processedBy;

    public int getOurPoNumber() {
        return ourPoNumber;
    }

    public void setOurPoNumber(Integer ourPoNumber) {
        this.ourPoNumber = ourPoNumber;
    }

    public String getSuppliersReference() {
        return suppliersReference;
    }

    public void setSuppliersReference(String suppliersReference) {
        this.suppliersReference = suppliersReference;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getIntendedRecipient() {
        return intendedRecipient;
    }

    public String  getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }

    public void setIntendedRecipient(String intendedRecipient) {
        this.intendedRecipient = intendedRecipient;
    }
}
