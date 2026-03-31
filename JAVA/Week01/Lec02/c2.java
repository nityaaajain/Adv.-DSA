public class c2 {
    public static void main(String[] args) {
        int a[]={3,5,0,0,7,0,1,0,4};
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                a[j++]=a[i];

            }
            
        }
        for(int i=j;i<a.length;i++){
            a[i]=0;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
            
        }








//  int j=a.length-1;
//         int b[]={0,0,0,00,0,0,0,0,0};
//        int i=0;
//         while(i < a.length) {
//             if(a[i]==0){
//                 b[j]=a[i];
//                 j--;
//             }
//             else{
//                 b[i]=a[i];
//                 i++;
//             }
           
            
//         }
//         for (int k = 0; k < a.length; k++){
//             System.out.print(b[k]);
//         }
    }
}
