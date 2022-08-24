let product = [10,20,30,40,50,60,70,80,90,100]
let sum = 0
let avg = 0

for(let i=0;i<product.length;i++){
    sum += product[i]
    avg = sum / product.length
    
}
console.log(`상품 합계 : ${sum} , 상품 평균 : ${avg}`)