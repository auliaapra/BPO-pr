public class P3S7MDArrayJava {
    public static void main(String[] args) {
        // Membuat array satu dimensi
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};

        // Membuat array dua dimensi
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

        // Membuat array tiga dimensi
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

        // Looping untuk mencetak isi array tiga dimensi
        for (int i = 0; i < threeDimensionalArray.length; i++) { // Loop untuk setiap array dua dimensi
            System.out.print("{");
            for (int j = 0; j < threeDimensionalArray[i].length; j++) { // Loop untuk setiap array satu dimensi
                System.out.print("{");
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) { // Loop untuk setiap elemen array
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.print("} ");
            }
            System.out.println("}");
        }
    }
}
