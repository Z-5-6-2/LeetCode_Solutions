#include <iostream>

using namespace std;

class Solution
{
public:
    double myPow(double x, int n)
    {
        double ans = 1;
        bool divide = false;

        if (x == 1)
            return ans;
        if (x == -1)
        {
            if (n % 2 == 0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        if (x == 0)
            return 0;
        if (n == 0)
            return ans;

        ans = x;

        if (n < 0)
        {
            divide = true;
            if (n == -2147483648)
            {
                return 0.0;
            }
            n = n * (-1);
        }

        for (int i = 0; i < n - 1; i++)
        {
            ans = ans * x;
        }

        if (divide == true)
        {
            return 1 / ans;
        }

        return ans;
    }
};

int main()
{
    Solution sol;

    std::cout<<sol.myPow(2,10)<<std::endl;

    return 0;
}