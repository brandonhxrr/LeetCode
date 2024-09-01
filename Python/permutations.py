class Solution:
    def permuteArray(self, permutations: List[List[int]], aux: List[int], nums: List[int]):
        if(len(aux) == len(nums)):
            permutations.append(aux[:])
            return
        else:
            for num in nums:
                if(num in aux):
                    continue
                aux.append(num)
            
                self.permuteArray(permutations, aux, nums)
            
                aux.pop()

    def permute(self, nums: List[int]) -> List[List[int]]:
        permutations = []
        self.permuteArray(permutations, [], nums)

        return permutations