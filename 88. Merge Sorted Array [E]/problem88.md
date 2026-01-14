Given two integer arrays `num1` and `num2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `num1` and `num2` respectively.

Merge `num1` and `num2` into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array `num1`. To accommodate this, `num1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to 0 and should be ignored. `num2` has a length of `n`.

**Examples:**

    Input: num1 = [1,2,3,0,0,0], m = 3, num2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from num1.
-----

    Input: num1 = [1], m = 1, num2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].
-----

    Input: num1 = [0], m = 0, num2 = [1], n = 1
    Output: [1]
    Explanation: The arrays we are merging are [] and [1].
    The result of the merge is [1].
    Note that because m = 0, there are no elements in num1. The 0 is only there to ensure the merge result can fit in num1.
 