class P6{


public static void main(String args[]){
    int n=4;
for(int i=n;i>=1;i--){
    
        for(int k=0;k<n-i;k++){
            System.out.print(" ");
        }
        for(int k=0;k<i;k++){

        System.out.print("*");
    }
    System.out.println();
}
}
}