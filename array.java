public class array {
    
    public static void main(String[] args)  {
        int[] arr=new int[]{2,4,6,8,10,12};
        int ptr=0;
        // System.out.println(ptr);
        for (int i = 0; i < arr.length; i++) {
            int l=leftsort(ptr,arr);
            int r=rightsort(ptr,arr);
            // System.out.println(l);
            // System.out.println(r);
            if(l==r){
                System.out.println(ptr);
                break;
            }
            ptr++;
        }
        System.out.println(ptr);
        
    }
    static int leftsort(int ptr, int[] arr){
        int a=0;
        for (int i = 0; i <ptr; i++) {
            a=a+arr[i];
        }
        return a;
    }
    static int rightsort(int ptr,int[] arr){
        int right=0;
        for (int i = arr.length-1; i >ptr ; i--) {
            right=right+arr[i];
        }
        return right;
    }
}
