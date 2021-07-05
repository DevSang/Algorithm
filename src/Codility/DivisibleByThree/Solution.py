import sys

def solution(numbers):
  ans = 0
  total = sum(map(int, numbers))
  print(total)

  for num in numbers:
    remain = (total - int(num)) % 3
    if remain == 0:
      ans += 4
    else:
      ans += 3
    if (remain + int(num)) % 3 == 0:
      ans -= 1
    if (total - int(num) == 0):
      ans -= 1
  if (total % 3 == 0):
    ans += 1
  print(ans)
  return ans


def main(numbers):
  solution(numbers)


if __name__ == '__main__':
  main(sys.argv[1])
