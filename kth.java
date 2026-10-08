class kth {
    public static int kthElement(int[] arr1, int[] arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                count++;

                if (count == k)
                    return arr1[i];

                i++;
            } 
            else {
                count++;

                if (count == k)
                    return arr2[j];

                j++;
            }
        }

        while (i < arr1.length) {
            count++;

            if (count == k)
                return arr1[i];

            i++;
        }

        while (j < arr2.length) {
            count++;

            if (count == k)
                return arr2[j];

            j++;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};

        int k = 5;

        System.out.println(kthElement(arr1, arr2, k));
    }
}