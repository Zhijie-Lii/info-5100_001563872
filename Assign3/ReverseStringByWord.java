public class ReverseStringByWord {
    static void reverse(char string[], int start, int end)
    {
        char temp;

        while (start <= end)
        {
            // Swapping the first and last character
            temp = string[start];
            string[start] = string[end];
            string[end] = temp;
            start++;
            end--;
        }
    }
    static char[] reverseWords(char []s)
    {
        // Reversing individual words as in the first step
        int start = 0;
        for (int end = 0; end < s.length; end++)
        {
            // If we see a space,
            if (s[end] == ' ')
            {
                reverse(s, start, end);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(s, start, s.length - 1);

        // Reverse the entire String
        reverse(s, 0, s.length - 1);
        return s;
    }

    public static void main(String[] args)
    {
        String s = "programming is like to playing the piano";
        char []p = reverseWords(s.toCharArray());
        System.out.print(p);
    }
}

