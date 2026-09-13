export function getStatistics(history){
    const totatl = history.length;

    const results = history.map(
        ({result})=>result 
    );

    const sum = results.reduce(
        (total,result)=> total+result,0
    );

    const average = total === 0 ? 0: sum/total;
    const maximum = total === 0 ? null : Math.max(...results);
    const minimum = total === 0? null : Math.min(...results);

    return {
        total,
        sum,
        average,
        maximum,
        minimum
    };
}