def calculate_sieve(number):
    if number <= 0:
        print(f'{number} is less than or equal to 0, enter another number please:')
        ask_number()
    else:
        count = 1
        while number != 1:
            if number % 2 == 0:
                number = number // 2
            else:
                number = (number * 3) + 1
            count += 1
    print(count)


def ask_number():
    entered_number = int(input("Enter a number bigger than 0: "))
    calculate_sieve(entered_number)


if __name__ == '__main__':
    ask_number()
