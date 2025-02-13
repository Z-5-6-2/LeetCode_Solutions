class Solution {
    public double myPow(double x, int n) {
        return (double)Math.pow(x,n);
    }

    public double myPow2(double x, int n) {
        double ans=1;

        if(x==1) return ans;
        if(x==0) return 0;
        if(n==0){

            return ans;

        }else if(n>0){

            ans = x;
            for(int i=0;i<n-1;i++){
                ans=ans*x;
            }
            return ans;

        }else{//negative case

            ans=x;
            n=n*(-1);
            for(int i=0;i<n-1;i++){
                ans=ans*x;
            }
            ans=1/ans;

            return ans;
        }
    }

    public double myPow3(double x, int n) {
        double ans=1;
        boolean divide=false;

        if(x==1) return ans;
        if(x==0) return 0;
        if(n==0) return ans;

        ans = x;

        if(n<0){
            divide=true;
            n=n*(-1);
        }

        for(int i=0;i<n-1;i++){
            ans=ans*x;
        }

        if(divide==true){
            return 1/ans;
        }

        return ans;
    }
}

class Main{
    public static void main(String[] args) {
        Solution sol = new Solution();

        //test case: x = 2, n = 10
        System.out.println("Case 1: x = 2, n = 10");
        System.out.println(sol.myPow(2, 10));
        System.out.println(sol.myPow2(2, 10));
        System.out.println(sol.myPow3(2, 10));
        System.out.println();

        //test case: x = 2.1 , n = 3
        System.out.println("Case 2: x = 2.1 , n = 3");
        System.out.println(sol.myPow(2.1, 3));
        System.out.println(sol.myPow2(2.1, 3));
        System.out.println(sol.myPow3(2.1, 3));
        System.out.println();

        //test case: x = 2, n = -2
        System.out.println("Case 3: x = 2, n = -2");
        System.out.println(sol.myPow(2, -2));
        System.out.println(sol.myPow2(2, -2));
        System.out.println(sol.myPow3(2, -2));
        System.out.println();

        //test case: x = 2, n = -2147483648
        System.out.println("Case 4: x = 2, n = -2147483648");
        System.out.println(sol.myPow(2, -2147483648));
        System.out.println(sol.myPow2(2, -2147483648));
        System.out.println(sol.myPow3(2, -2147483648));
        System.out.println();
    }
}