class Shopping{
    constructor(color,size,price){
        this.color = color
        this.size = size
        this.price = price
    }
    printInfo(){
        console.log(`상품 컬러 : ${this.color} , 상품 사이즈 : ${this.size}, 상품 가격 : ${this.price}`)
    }
}

let shopping = new Shopping('Black','L',2000)
shopping.printInfo()