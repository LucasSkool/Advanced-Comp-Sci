public class Sort {
    private int[] nums;

    public Sort() {
        this.nums = new int[10];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
    }


    public void print() {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[nums.length - 1] + "]\n");
    }

    public void sort() {
        boolean sorted = false;
        while (!sorted) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) {
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                } //do nothing if not
            }
            sorted = this.checkIfSorted();
        }
    }

    public boolean checkIfSorted() {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;

    }

}
