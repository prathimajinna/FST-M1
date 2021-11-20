
numbers = (input("Enter a sequence of comma separated values: "))
numbers = numbers.split(',')
numbers  = [ int(x) for x in numbers ]

print (sum(numbers))