class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> rows = new ArrayList<>();
        rows.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++) {
            Boolean found = false;
            for(int j = 0; j < rows.size(); j++) {
                if(!rows.get(j).contains(nums[i])){
                    rows.get(j).add(nums[i]);
                    found = true;
                    break;
                }
            }

            if(!found){
                List<Integer> aux = new ArrayList<>();
                aux.add(nums[i]);
                rows.add(aux);
            }
        }

        return rows;
    }
}