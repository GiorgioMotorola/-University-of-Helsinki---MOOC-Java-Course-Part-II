
public class Program {

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 5, 0},
            {3, 0, 7}
        };
        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder build = new StringBuilder();

        for (int[] x : array) {
            for (int y : x) {
                build.append(y);
            }
            build.append("\n");
        }
        return build.toString();
    }

}
