import sys

nums = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0']


def solution(S):
  ans = 0
  s_list = [c for c in S]
  sum_s = sum([int(s) for s in S])
  if sum_s % 3 == 0:
    ans += 1
  for i, s in enumerate(s_list):
    for num in nums:
      if num == s:
        continue
      diff = int(num) - int(s_list[i])
      if (sum_s + diff) % 3 == 0:
        # print(s_list)
        ans += 1
  return ans
