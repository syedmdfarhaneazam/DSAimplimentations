public class runner {
    public static void printo(char[][] arr){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print("|"+arr[i][j]+"|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        char[][] arr = new char[7][7];
        for(int i= 0; i<7 ; i++){
            for(int j=0 ; j<7; j++){
                if(i==3 || j==3) arr[i][j]='X';
                else if(i==0 && j<3) arr[i][j]='X';
                else if(i==6 && j>3) arr[i][j]='X';
                else if(i>3 && j==0) arr[i][j]='X';
                else if(i<3 && j==6) arr[i][j]='X';
                else arr[i][j]=' ';
            }
        }
        printo(arr);
    }
}
