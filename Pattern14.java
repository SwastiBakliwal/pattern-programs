class Pattern14 {
  public static void main(String[] args) {
    int i,j,n=5 ;
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            if(i==n||j==1)
            System.out.print(j);
            if((i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4))
            System.out.print(j);
            if((i==3&&j==2)||(i==4&&j==2)||(i==4&&j==3))
            System.out.print(" ");
        }
        System.out.println();
    }
  }    
}
/*
1
12
1 3
1  4
12345
 */