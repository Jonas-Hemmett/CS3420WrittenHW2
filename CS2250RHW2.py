rMin = 0
rMax = 1000
printStuff = False
stronger = False

def userFunc(func, n):
    try:
       return eval(func)
    except ZeroDivisionError as e:
        if printStuff: 
            print(f"Error: {e}")
        return rMax

# To find the largest number n such that func(n) <= c, I recursively call findNHelper with a min and max range.
# This may have problems with local mins and maxes, but it works for most functions.
def findNHelper(c, func, min, max):
    # evaluates the function at the midpoint of the range.
    x = round((min + max) / 2)
    fX = userFunc(func, x)

    if min >= max:
        return None

    if printStuff: 
        print(f"min: {min}, max: {max}, x: {round((min + max) / 2)}, fX: {x}")

    if fX == c:
        return x
    elif fX < c:
        fX1 = userFunc(func, x + 1)

        if fX1 > c:
            return x
        
        return findNHelper(c, func, round((min + max) / 2), max)
    
    else:
        return findNHelper(c, func, min, round((min + max) / 2))

# Works better with local mins and maxes, but is far less efficient.
def findNHelperStrong(c, func):
    x = rMax
    while x > rMin:
        fX = userFunc(func, x)
        if fX <= c:
            return x
        x -= 1
    return None

        

def findN(func, c):
    if stronger:
        return findNHelperStrong(c, func)
    
    assert c >= rMin
    assert c >= rMin

    min = rMin
    max = rMax

    return findNHelper(c, func, min, max)

if __name__ == "__main__":
    choice = ""
    while choice != "6":
        choice = input("[1]: View demo\n[2]: set min and max range\n[3]: find n given f(x) and c\n[4]: Toggle run printing\n[5]: Change calc mode\n[6]: Exit\n")
        if choice == "1":
            print("Demo:")
            print("For a given function f(n) and constant c, this program finds the largest n such that f(n) <= c")
            print(f"The current range is between {rMin} and {rMax}")


            print("f(n) = n ** 2, c = 100")
            foundN = findN("n ** 2", 100)
            print(f"The smallest n value is: {foundN}")

            print("f(n) = n / 2, c = 67")
            foundN = findN("n / 2", 67)
            print(f"The smallest n value is: {foundN}")

            print("f(n) = n ** 2 - 4 * n + 8, c = 123")
            foundN = findN("n ** 2 - 4 * n + 8", 123)
            print(f"The smallest n value is: {foundN}")

            
            print("f(n) = n ** 2 - 4 * n + 8, c = 123")
            foundN = findN("n ** 2 - 4 * n + 8", 123)
            print(f"The smallest n value is: {foundN}")

            
            input("[]: Continue\n")


        if choice == "2":
            while True:
                min = int(input("Enter min range: "))
                max = int(input("Enter max range: "))

                try:
                    min = int(min)
                    max = int(max)
                except:
                    print("Invalid input")

                if min > max:
                    print("Invalid input")
                else:
                    rMin = min
                    rMax = max
                    break

        elif choice == "3":
            while True:
                try:
                    func = input("Enter function in terms of n (ex: n ** 2 + 2 * n + 10): ")
                    c = int(input("Enter c value: "))

                    print(f"The smallest n value is: {findN(func, c)}")
                    input("[]: Continue\n")
                    break
                except Exception as e:
                    print(f"Invalid input: {e}")

        elif choice == "4":
            printStuff = not printStuff
            print(f"Print stuff is now {printStuff}")
            input("[]: Continue\n")
        elif choice == "5":
            stronger = not stronger
            print(f"Strong mode is {stronger}")
            input("[]: Continue\n")

        
