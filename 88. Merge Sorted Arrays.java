class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int p1 = m - 1;
        int p2 = n - 1;
        // Pointer for the last element in the merged array
        int p = m + n - 1;

        // Merge the arrays starting from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are any remaining elements in nums2, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }
