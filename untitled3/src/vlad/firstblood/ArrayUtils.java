package vlad.firstblood;

public class ArrayUtils {
    public static void createMatrix(int a,int b){
        int[][] arr = new int[a][b];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length;j++){
                arr[i][j] = (int) (Math.random()*b*a);
            }
        }
        for(int i = 0; i < arr.length; i++, System.out.println())
            for(int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
    }
    public static int[] reverse(int[] arr, int index){
        int[] massive = new int[arr.length];
        for(int i = arr.length-1,j=0; i >= 0 ;i--,j++){
            if( j <= index-1 && i >= arr.length-1-index) {
                massive[j] = arr[i];
                massive[i] = arr[j];
            } else if(j > index-1 && i < arr.length-index && massive[index] == 0){
                massive[i] = arr[i];
            }
        }
        return massive;
   }
}


