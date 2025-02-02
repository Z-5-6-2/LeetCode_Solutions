#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> sol;
        for(int i=0;i<nums.size();i++)
        {
            for(int j=1;j<nums.size();j++)
            {
                if(nums[i]+nums[j]==target && j!=i)
                {
                    sol.push_back(i);
                    sol.push_back(j);
                    return sol;
                };
            };
        };
        return sol;
    }
};

int main(){
    vector<int>nums={2,7,11,15};
    int target=9;

    Solution solution;
    vector<int> result = solution.twoSum(nums, target);

    if (!result.empty()) {
        cout << "Indices: " << result[0] << ", " << result[1] << endl;
    } else {
        cout << "No solution found" << endl;
    }

    return 0;
    
}