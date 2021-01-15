import re

num = input()
if re.match(r"(1|8|9)", num) and len(num)==8:
    print("Valid")
else:
    print("Invalid")
