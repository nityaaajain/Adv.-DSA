package JAVA.Lec02;
public class lec2{
    public static void main(String[] args) {
        int a[]={3,20,7,15,6,5,8,2};
        int j=a.length;
        System.out.println(a[j-1]);
        for (int i = a.length-1; i >=0; i--) {
            
            if(a[i]<a[i-1]){
                System.out.println(a[i-1]);
            } 
        }
    }
}