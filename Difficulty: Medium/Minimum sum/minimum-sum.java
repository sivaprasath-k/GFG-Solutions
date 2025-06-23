import java.util.Arrays;
import java.math.BigInteger;

class Solution {
    String minSum(int[] arr) {
        // Arrays.sort(arr);

        // if (arr.length == 1) {
        //     return String.valueOf(arr[0]);
        // }

        // StringBuilder a = new StringBuilder();
        // StringBuilder b = new StringBuilder();

        // int i = 0;
        // for (; i + 1 < arr.length; i += 2) {
        //     a.append(arr[i]);
        //     b.append(arr[i + 1]);
        // }

        // // If odd number of elements, add the last one to a
        // if (i < arr.length) {
        //     a.append(arr[i]);
        // }

        // BigInteger num1 = new BigInteger(a.toString());
        // BigInteger num2 = new BigInteger(b.toString());

        // return num1.add(num2).toString();
        
        Arrays.sort(arr);
        
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) num1.append(arr[i]);
            else num2.append(arr[i]);
        }

        return addStrings(num1.toString(), num2.toString());
    }

    String addStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        return result.reverse().toString().replaceFirst("^0+(?!$)", "");

    }
}
