pattern_a = ""
pattern_b = ""
pattern_to_try = input()

split_pattern = pattern_to_try.split('*')

if len(split_pattern) > 1:
    pattern_a = split_pattern[0]
    pattern_b = split_pattern[1]

elif len(split_pattern) == 1:
    if pattern_to_try[0] == '*':
        pattern_b = split_pattern[0]
    else:
        pattern_a = split_pattern[0]


def __check_first_str__(word, pattern):
    if pattern == "":
        return True
    if len(word) < len(pattern):
        return False
    if word[0] == pattern[0]:
        return __check_first_str__(word[1:], pattern[1:])
    return False


def __check_last_str__(word, pattern):
    if pattern == "":
        return True
    if len(word) < len(pattern):
        return False
    if word[-1] == pattern[-1]:
        return __check_last_str__(word[:-1], pattern[:-1])
    return False


num = int(input())
for i in range(num):
    text = input()
    formatted = text

    if __check_first_str__(formatted, pattern_a) & __check_last_str__(text[len(pattern_a):], pattern_b):
        print(text)
