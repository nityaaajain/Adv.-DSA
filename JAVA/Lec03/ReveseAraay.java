

public class ReveseAraay {
    public static void main(String[] args) {
        int a[]={3,2,5,7,1,8,3};
        int j=a.length-1;
        int temp;
        for(int i=0;i<(a.length)/2;i++){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
            
        }
    }
    
}
