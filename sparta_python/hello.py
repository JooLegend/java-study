def check_num(num):
    pin = int(num.split('-')[1][:1])
    if pin % 2 == 1:
        print('남자')
    else:
        print('여자')

my_pin = '123413-12413'
my_pin2 = '123413-22413'
my_pin3 = '123413-42413'
check_num(my_pin)
check_num(my_pin2)
check_num(my_pin3)
