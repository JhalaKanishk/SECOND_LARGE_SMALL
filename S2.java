import java.util.*;
//Q1 : SECOND LARGEST ELEMENT IN THE ARRAY WITHOUT SORTING
//Q2 : SECOND SMALLEST ELEMENT IN THE ARRAY WITHOUT SORTING

//TIME COMPLEXITY : O[N]
//SPACE COMPLEXITY : O[1]
public class S2 {
    static int tofindsS(int arr[],int n){
        int smallest = Integer.MAX_VALUE;
        int ssmallest = 0;
        for (int i=0;i<=n-1;i++){
            if (arr[i] < smallest){
                ssmallest = smallest;//getting second small
                smallest = arr[i];//getting first small
            }
            else if(smallest != arr[i] && arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    static int tofindsL(int arr[],int n){
        int largest = Integer.MIN_VALUE;
        int slargest = 0;
        for (int i=0;i<=n-1;i++){
            if (arr[i]>largest){
                slargest = largest;//getting second large num
                largest = arr[i];//getting large num
            }
            else if (arr[i] != largest && arr[i] > slargest){
                slargest = arr[i];//slargest == arr[i] compare
            }
        }
        return slargest;
    }
    static void toprint(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for (int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        toprint(arr);
        System.out.println();
        System.out.println("SECOND LARGEST : "+tofindsL(arr,n));
        System.out.println("SECOND SMALLEST : "+tofindsS(arr,n));
    }
}
