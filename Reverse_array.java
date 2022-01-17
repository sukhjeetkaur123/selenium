public class Reverse_array {
    public static void main(String[] ddh){
        int [] array1 = new int []{1,2,3,4};
        int[] a={9,8,7,6};
        for(int i =0; i<array1.length;i++){
            System.out.print(array1[i]+"");


         }
            for(int j=0;j<a.length;j++){
                System.out.print(a[j]+" ");
        }

        System.out.println("the resverse array is:");
        for(int i=array1.length-1;i>=0;i--){
            System.out.print(array1[i]);
        }
        System.out.println("2nd array and resverse:::::");
        for(int j=a.length-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}
