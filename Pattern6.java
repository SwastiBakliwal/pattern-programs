class Pattern6 {
  public static void main(String[] args) {
    int i,j;
    for(i=1;i<=5;i++){
        for(j=1 ;j<=i ;j++)
        {
        if((i+j)%2==0)
        System.out.print("0");
        else
        System.out.print("1");
        }
        System.out.println();
    }
  }    
}
/*
0
10
010
1010
01010
 */