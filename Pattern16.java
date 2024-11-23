class Pattern16 {
  public static void main(String[] args) {
    int i, j, n = 5; 
        for (i = 1; i <= n; i++)  
        { 
            int ch = 65; 
            for (j = 1; j <= i; j++)  
            { 
                if(i==n||j==1)
                {
                System.out.print(((char)ch)); 
                ch++;
                }
                if((i==2&&j==2)||(i==3&&j==3)||(i==4&&j==4))
                {
                System.out.print(((char)ch++));
                ch++;
                }
                if((i==3&&j==2)||(i==4&&j==2)||(i==4&&j==3))
                System.out.print(" "); 
            } 
        System.out.println(); 
        } 
  }    
}
/*
A
AB
A B
A  B
ABCDE
 */