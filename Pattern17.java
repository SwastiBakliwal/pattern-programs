class Pattern17 {
  public static void main(String[] args) {
    int i,j,n=5 ;
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            if(i==n||j==1||i==j)
            System.out.print("*");
            else
            System.out.print("@");
        }
        System.out.println();
    }
  }    
}
/*
*
**
*@*
*@@*
*****
 */