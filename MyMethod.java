public class MyMethod {

    //Method 1
    public void Display(int a, int b){
        System.out.println(this.Greater(a, b));
    }

    //Method 2
    public int Greater(int a, int b){
        return (a>b) ? a : b;
    }
    public static void main(String[] args){
        //Creating instance of class MyMethod
        MyMethod mm = new MyMethod();
        mm.Display(25, 267);
        int arr[][] = {{1,1,1}, {2,2,2}, {3,3,3}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
