fun main(){
    val amount = 100_000 //����� �������� � ��������
    val min = 3500 //����������� �������� � ��������
    val commission = (amount * 0.75)/100 //�������� 0,75%
    val result = if(commission >= min) commission else min
    println(result)
}