function permuteArray(permutations: number[][], aux: number[], nums: number[]) {
    if(aux.length == nums.length) {
        permutations.push([...aux]);
        return;
    } else {
        for(const num of nums) {
            if(aux.includes(num)) {
                continue;
            }

            aux.push(num);
            permuteArray(permutations, aux, nums);
            aux.pop();
        }
    }
}
function permute(nums: number[]): number[][] {
    let permutations = []
    permuteArray(permutations, [], nums);
    return permutations;
};