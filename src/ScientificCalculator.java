public class ScientificCalculator extends AdvancedCalculator {

    public String binaryChanges() {
        int sum = result;
        String a = "";
        while (sum > 0) {
            int bit = sum % 2;
            a = bit + a;
            num1 = sum;
            num2 = 2;
            divide();
            sum = result;

        }
        return a;
    }







    }

}
