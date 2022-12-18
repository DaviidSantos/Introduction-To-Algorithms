public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3, 3};
        array = insertionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static int[] insertionSort(int[] array){
        //j representa o valor atual que será organizado no array
        for (int j = 1; j < array.length; j++){
            // key é o valor atual
            int key = array[j];
            // i é o valor que tinha sido inserido anterior ao do valor atual
            int i = j - 1;
            //Enquanto existir um valor anterior e esse valor anterior ser maior que o valor atual o algoritimo
            //modifica a posição dos valores
            while (i >= 0 && array[i] > key){
                //Move valores maiores que o valor atual pra frente
                array[i + 1] = array[i];
                i = i - 1;
            }
            //Coloca o valor atual na sua posição correta
            array[i + 1] = key;
        }
        return array;
    }
}
