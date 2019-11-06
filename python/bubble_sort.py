import random


def bubble_sort(list_):
    """Bubble sort."""
    list_length = len(list_) - 1
    sorted_ = False
    while not sorted_:
        sorted_ = True
        for i in range(list_length):
            if list_[i] > list_[i + 1]:
                list_[i], list_[i + 1] = list_[i + 1], list_[i]
                sorted_ = False
    return list_


def main():
    """Main function that reads the user's input and returns the sorted list."""
    list_length = int(input('Enter the number of elements you want in your list: '))
    list_limit = int(input('Now enter the maximum possible number in your list: '))
    unordered_list = random.sample(range(list_limit), list_length)
    print(f'This is your list\n{unordered_list}')
    sorted_list = bubble_sort(unordered_list)
    print(f'And this is your sorted list\n{sorted_list}')


if __name__ == '__main__':
    main()
