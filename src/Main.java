import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);
    public static int[] baseData = new int[5];


    public static void main(String[] args) {
        System.out.println("enter 5 integers");
        getInput();
        printArray(baseData);
        resizeArray();
        baseData[5] = -10;
        baseData[6] = -22;
        System.out.println("============");
        printArray(baseData);
    }

    private static void getInput(){
        for(int i = 0; i<baseData.length; i++){
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
        }
    }

    private static void resizeArray(){
        int[] original = baseData; //copied original 5 index version of baseData
        baseData = new int[7]; //resized baseData
        for(int i = 0; i<original.length; i++){ //copied original content into first 5 indexes. index 5 and 6 default to 0
            baseData[i] = original[i];
        }
    }

}