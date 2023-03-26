package chapter5.examples;
// Fig 5.11

// Class that represents an auto insurance policy
public class AutoPolicy {
    private int accountNumber;      // Policy acct#
    private String makeAndModel;    // Car that the policy applies to
    private String state;           // Two-letter state abbreviation

    // Constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // Set and Get acct#
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    // Set and Get make and model
    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }
    public String getMakeAndModel(){
        return makeAndModel;
    }

    // Set and Get state
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return state;
    }

    // Returns whether the state has no-fault insurance
    public boolean isNoFaultState(){
        boolean noFaultState;

        // Determine whether the state has no-fault insurance
        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}
