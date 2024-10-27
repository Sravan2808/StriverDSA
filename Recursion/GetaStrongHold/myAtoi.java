package Recursion.GetaStrongHold;
class myAtoi{
public int myAtoi(String s) {
    long ans = 0;  // Initialize variable to store result.
    int sign = 1;  // Initialize sign to positive.
    int i = 0;     // Index to traverse the string.

    // Skip leading whitespaces.
    while (i < s.length() && s.charAt(i) == ' ') {
        i++;
    }

    // Check for sign ('-' or '+') and update the sign accordingly.
    if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
    }

    // Convert numeric characters to integer.
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        ans = ans * 10 + (s.charAt(i) - '0');  // Build the number.

        // Check for overflow beyond 32-bit integer limits.
        if (ans * sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;  // Return minimum bound on overflow.
        }

        if (ans * sign >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;  // Return maximum bound on overflow.
        }

        i++;  // Move to the next character.
    }

    // Return the final result with appropriate sign.
    return (int) ans * sign;  
}
}