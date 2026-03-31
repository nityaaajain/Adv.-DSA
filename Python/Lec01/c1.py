"""Basic Python example: greeting plus simple arithmetic."""

def main():
    print("Basic Python program")
    name = input("Enter your name: ").strip()
    print(f"Hello, {name}!")

    try:
        a = float(input("Enter the first number: "))
        b = float(input("Enter the second number: "))

        print(f"{a} + {b} = {a + b}")
        print(f"{a} - {b} = {a - b}")
        print(f"{a} * {b} = {a * b}")

        if b != 0:
            print(f"{a} / {b} = {a / b}")
        else:
            print("Cannot divide by zero.")
    except ValueError:
        print("Please enter valid numeric values.")


if __name__ == "__main__":
    main()
