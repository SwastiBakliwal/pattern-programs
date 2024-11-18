class Pattern20 {
  public static void main(String[] args) {
    int i, j;
    int num = 97;
    for (i = 1; i <= 5; i++) {
        for (j = 1; j <= i; j++) {
            System.out.print(((char)num)+ " ");
            num++;
        }
        System.out.println();
    }
  }    
}
/*
a 
b c 
d e f 
g h i j 
k l m n o
 */