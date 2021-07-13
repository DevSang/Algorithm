A = [3, 5, 1, 3, 9, 8]
K = 4
# A = [8, 8, 4, 3]
# K = 2
# A = [43, 10, 11, 3, 64]
# K = 2
solution_arr = list()
for cnt in range(len(A)):
  solution_arr.append()

for cnt in range(len(A)):
  tmp = A.copy()
  if cnt + K > len(A):
    break
  del tmp[cnt:cnt + K]
  solution_arr.append(max(tmp) - min(tmp))

print(min(solution_arr))
