fun main(){
    val amount = 100_000 //сумма перевода в копейках
    val min = 3500 //минимальная коммисия в копейках
    val commission = (amount * 0.75)/100 //комиссия 0,75%
    val result = if(commission >= min) commission else min
    println(result)
}