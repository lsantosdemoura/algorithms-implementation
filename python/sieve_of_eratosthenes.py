import math

def calcula_crivo(limit_number):
    if limit_number <= 0:
        print(f'{limit_number} is less than or equal to 0, enter another number please:')
        pede_numero()
    else:
        maior_numero_a_ser_checado = int(math.floor(math.sqrt(limit_number)))
        lista_numeros = set()
        for i in range(maior_numero_a_ser_checado):
            for j in range(2, limit_number + 1):
                if j % 2 != 0:
                    lista_numeros.add(j)


def pede_numero():
    numero_digitado = int(input("Digite um número maior que 0:"))
    calcula_crivo(numero_digitado)


if __name__ == '__main__':
    pede_numero()
