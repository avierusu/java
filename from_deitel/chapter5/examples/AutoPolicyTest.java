package chapter5.examples;
// Fig 5.12

public class AutoPolicyTest {
    public static void main(String[] args){
        // Create 2 new AutoPolicy objects
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        // Display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    // Displays whether an AutoPolicy is in a no-fault insurance state
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s;\nState %s %s a no-fault state\n\n",
                        policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                        (policy.isNoFaultState() ? "is" : "is not"));
    }
}
