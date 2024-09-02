class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        rows = []
        rows.append([])

        for num in nums: 
            found = False

            for i in range(len(rows)):
                if(not num in rows[i]):
                    rows[i].append(num)
                    found = True
                    break

            if(not found):
                aux = []
                aux.append(num)
                rows.append(aux)
        
        return rows
            