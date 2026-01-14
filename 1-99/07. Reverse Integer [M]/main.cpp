#include <iostream>
#include <stdlib.h>
#include <cmath>

//ANSI escape codes
#define RESET   "\033[0m"
#define RED     "\033[31m"
#define GREEN   "\033[32m"

using namespace std;

class Solution {
public:
    int reverse(int x) {
        long long rev=0;
        int rem =0;
        while(x!=0){
            rem=x%10;
            rev= rev*10+rem;
            x/=10;
        }

        if (rev>=pow(2,31)-1 ||rev<= pow(-2,31)){
            return 0;
        }else{
            return rev;
        }
    }
};

void check(int s, int a){
    cout<<"Reversed Integer: "<< s <<" , ";
    if(s == a){
        cout<<GREEN<<"correct"<<RESET<<endl;
    }else{
        cout<<RED<<"incorrect"<<RESET<<endl;
    }

}

int main(){
    Solution sol;

    //testing number: 123
    check(sol.reverse(123),321);

    //testing number: -123
    check(sol.reverse(-123),-321);

    //testing number: 120
    check(sol.reverse(120),21);


    return 0;
}