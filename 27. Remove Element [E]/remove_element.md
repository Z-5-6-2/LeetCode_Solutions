Given an integer array ,nums, and an integer ,val, ; all occurrences of val in nums are removed. The order of the elements may be changed.  Returned is the number of elements in nums which are not equal to val.

**Example 1:**

	Input: nums = [3,2,2,3], val = 3
	Output: 2, nums = [2,2,_,_]
	What is left beyond the returned k, is not of importance (hence underscores).

**Example 2:**

	Input: nums = [0,1,2,2,3,0,4,2], val = 2
	Output: 5, nums = [0,1,4,0,3,_,_,_]

**Constraints:**

- 0 <= nums.length <= 100
- 0 <= nums[i] <= 50
- 0 <= val <= 100