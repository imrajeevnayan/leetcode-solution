a = set([int(x) for x in input().strip().split()])
b = set([int(x) for x in input().strip().split()])

st = a | b


print(len(st))