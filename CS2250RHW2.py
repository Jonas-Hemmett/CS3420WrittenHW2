rMin = 0
rMax = 1000
printStuff = False

def userFunc(func, n):
    return eval(func)

# To find the largest number n such that func(n) <= c, I recursively call findNHelper with a min and max range.
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

def findN(func, c):
    assert c >= rMin
    assert c >= rMin

    min = rMin
    max = rMax
    return findNHelper(c, func, min, max)

if __name__ == "__main__":
    while True:
        choice = input("[1]: set min and max range\n[2]: find n given f(x) and c\n[3]: View demo\n[4]: Toggle run printing\n[5]: Exit\n")
        if choice == "1":
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

        elif choice == "2":
            while True:
                try:
                    func = input("Enter function in terms of n (ex: n ** 2 + 2 * n + 10): ")
                    c = int(input("Enter c value: "))

                    print(f"The smallest n value is: {findN(func, c)}")
                    input("[]: Continue")
                    break
                except Exception as e:
                    print(f"Invalid input: {e}")

        elif choice == "3":
            print("Demo:")
            print("f(n) = n ** 2, c = 100")
            print(f"The smallest n value is: {findN("n ** 2", 100)}")

            print("f(n) = n / 2, c = 67")
            print(f"The smallest n value is: {findN("n / 2", 67)}")

            

            input("[]: Continue")


        elif choice == "4":
            printStuff = not printStuff
            print(f"Print stuff is now {printStuff}")
            input("[]: Continue")

        elif choice == "5":
            break

        
