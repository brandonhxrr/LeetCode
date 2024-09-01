class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> aux = new ArrayList<>();

        permuteArray(permutations, aux, nums);

        return permutations;
    }

    void permuteArray(List<List<Integer>> permutations, List<Integer> aux, int[] nums) {
        if(aux.size() == nums.length) {
            permutations.add(new ArrayList<>(aux));
        }else {
            for(int i = 0; i < nums.length; i++) {
                if(aux.contains(nums[i])) {
                    continue;
                }

                aux.add(nums[i]);

                permuteArray(permutations, aux, nums);

                aux.remove(aux.size() - 1);
            }
        }
    }
}