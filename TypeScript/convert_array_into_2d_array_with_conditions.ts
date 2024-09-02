function findMatrix(nums: number[]): number[][] {
    let rows: number[][] = [[]];

    for(let i = 0; i < nums.length; i++) {
        let found = false;

        for(let j = 0; j < rows.length; j++) {
            if(!rows[j].includes(nums[i])) {
                rows[j].push(nums[i]);
                found = true;
                break;
            }
        }

        if(!found) {
            let aux: number[] = [nums[i]];
            rows.push(aux);
        }
    }

    return rows;

};