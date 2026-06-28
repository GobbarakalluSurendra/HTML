class P11{
public static void main(String args[]){
int n=5;
//upper Parts
for(int i=1;i<=n;i++){
    //First Part Stars
    for(int j=1;j<=i;j++){
        System.out.print("*");

    }
    //Spaces
   for(int j=1;j<=2*(n-i);j++){
    System.out.print(" ");
   }
   //Second Part stars 
    for(int j=1;j<=i;j++){
        System.out.print("*");

    }
    System.out.println();
}
//Lower Part
for(int i=n;i>=1;i--){
    //first Part Star
    for(int j=1;j<=i;j++){
        System.out.print("*");

    }//Spaces
     for(int j=1;j<=2*(n-i);j++){
    System.out.print(" ");
   }
   //Second Part Stars
    for(int j=1;j<=i;j++){
        System.out.print("*");

    }
    System.out.println();
}
}
}