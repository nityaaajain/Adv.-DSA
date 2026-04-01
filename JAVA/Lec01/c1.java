package JAVA.Lec01;

public class c1 {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=2;
        a[1]=5;
        a[2]=3;
        a[3]=6;
        a[4]=1;
        int min=a[0],max=a[0];
        int sum=0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];

            }
            sum=sum+a[i];

        }
        System.err.println(min);
        System.err.println(max);
        float avg= (float)sum/a.length;
        System.err.println(avg);
    }
    
}
