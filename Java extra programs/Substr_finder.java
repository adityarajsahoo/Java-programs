public class Substr_finder{
    public static void main(String[] args) {
        
        String input ="sahoo";

        StringBuilder input1 = new StringBuilder();

        input1.append(input);
        input1 = input1.reverse();

        System.out.println(input1);

        String strFind = "has";
        int count = 0, fromIndex = 0;

        while ((fromIndex = input1.indexOf(strFind, fromIndex)) != -1)
        {
            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
        }
        System.out.println("Total occurrences: " + count);
    }
}