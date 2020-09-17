import java.util.Scanner;

public class Main{
    private static boolean isValid(String str,int i){
        return str.charAt(i)>='0'&&str.charAt(i)<='9';
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        while(sc.hasNext()){
            String str=sc.next();
            int i=0;
            while(i<str.length()){
                if(isValid(str,i)){
                    StringBuilder tmp=new StringBuilder();
                    tmp.append(str.charAt(i));
                    int j=i+1;
                    for(;j<str.length();j++){
                        if(isValid(str,j)){
                            tmp.append(str.charAt(j));
                        }else{
                            break;
                        }
                    }

                    /*if(j==str.length()){
                        if(j-i==4){

                        }
                    }*/
                    if(j!=i+4){
                        i=j;
                        continue;
                    }
                    int number=Integer.parseInt(new String(tmp));
                    if(number>=1000&&number<=3999){
                        if(count==0){
                            System.out.print(tmp);
                        }else{
                            System.out.print(" "+tmp);
                        }
                        count++;
                        i+=4;
                        continue;
                    }
                }
                i++;
            }
        }
    }
}


 /*  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int count=0;
        while(sc.hasNext()){
            String str=sc.nextLine();
            int i=0;
            while(i<str.length()){
                if(isValid(str,i)){
                    StringBuilder tmp=new StringBuilder();
                    tmp.append(str.charAt(i));
                    for(int j=i+1;j<str.length()&&j<i+4;j++){
                        if(isValid(str,j)){
                            tmp.append(str.charAt(j));
                        }else{
                            break;
                        }
                    }
                    int number=Integer.parseInt(new String(tmp));
                    if(number>=1000&&number<=3999){
                        if(count==0){
                            sb.append(tmp);
                        }else{
                            sb.append(" ").append(tmp);
                        }
                        count++;
                        i+=3;
                    }
                }
                i++;
            }
        }
        System.out.println(sb);
    }*/

/*

private static boolean dfs(char[][] arr,int n,int m,int i,int j,boolean[][] v){
        if(i<0||j<0||i>=n||j>=m||arr[i][j]=='#'||v[i][j]){
            return false;
        }
        if(arr[i][j]=='E') return true;
        v[i][j]=true;
        if(dfs(arr, n, m, i + 1, j,v) || dfs(arr, n, m, i - 1, j,v) ||
                dfs(arr, n, m, i, j + 1,v) || dfs(arr, n, m, i, j - 1,v)){
            return true;
        }
        v[i][j]=false;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int T=sc.nextInt();
            for(int t=0;t<T;t++){
                int n=sc.nextInt();
                int m=sc.nextInt();
                char[][] arr=new char[n][m];
                int row=-1;
                int col=-1;
                for(int i=0;i<n;i++){
                    String line=sc.next();
                    for(int j=0;j<m;j++){
                        arr[i][j]=line.charAt(j);
                        if(arr[i][j]=='S'){
                            row=i;
                            col=j;
                        }
                    }
                }
                boolean res=dfs(arr,n,m,row,col,new boolean[n][m]);
                if(res){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
        }
    }
*
* */
