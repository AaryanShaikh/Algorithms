import re

pattern = r"([\w\.-]+)@([\w\.-]+)(\.[\w\.]+)"
str = "Please contact aayanshaikh27638@gmail.com for assistance"
match = re.search(pattern, str)
if match:
    print(match.group())
