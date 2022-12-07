package org.example.session01;

public class Passing {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int[] nums = {a, b, c};
        modifier(a, b, c);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        modifier(nums);
        System.out.println("nums[0] = " + nums[0] + ", nums[1] = " + nums[1] + ", nums[2] = " + nums[2]);
    }

    static void modifier(int p, int q, int r) {
        p += 1;
        q += 2;
        r += 3;
        System.out.println("p = " + p + ", q = " + q + ", r = " + r);
    }

    static void modifier (int[] nums) {
        nums[0] += 1;
        nums[1] += 2;
        nums[2] += 3;
        System.out.println("nums[0] = " + nums[0] + ", nums[1] = " + nums[1] + ", nums[2] = " + nums[2]);
    }
}
