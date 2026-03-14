class Solution{
    public int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int ft=0;
        int st=1;
        for(int i=1;i<n;i++){
            int tt=ft+st;
            ft=st;
            st=tt;
        }
        return ft;
    }
}