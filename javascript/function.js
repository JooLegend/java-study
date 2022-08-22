function cal(priceA,priceB,priceC){
    let avg = (priceA + priceB + priceC) / 3
    console.log(`평균 값은 ${avg}원 입니다.`)
    return avg
}

let priceA = 3000
let priceB = 6000
let priceC = 9000

let avg = cal(priceA,priceB,priceC)