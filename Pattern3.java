class Pattern3 {
  public static void main(String[] args) {
    int i,j;
    for(i=1;i<=5;i++){
        for(j=1;j<=i;j++){
        if(i%2==0){
            System.out.print("0");
        }
        else{
            System.out.print("1");
        }
        }
        System.out.println();
    }
  }    
}
/*
1
00
111
0000
11111 */