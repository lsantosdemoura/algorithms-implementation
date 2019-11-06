import math

def calculate_sieve(limit_number):
    if limit_number <= 0:
        print(f'{limit_number} is less than or equal to 0, enter another number please:')
        ask_number()
    else:
        biggest_number_to_be_checked = int(math.floor(math.sqrt(limit_number)))
        lista_numeros = set()
        for i in range(2, limit_number + 1):
            if i % 2 != 0:
                lista_numeros.add(i)
        print(lista_numeros)


def ask_number():
    entered_number = int(input("Enter a number bigger than 0: "))
    calculate_sieve(entered_number)


if __name__ == '__main__':
    ask_number()
