class Question:
    def __init__(self, question, a, b, c, d, correct):
        self.question = question
        self.a = a
        self.b = b
        self.c = c
        self.d = d
        self.correct = correct

    def show(self):
        print(self.question)
        print("A. " + self.a)
        print("B. " + self.b)
        print("C. " + self.c)
        print("D. " + self.d)

def main():
    money = 1_000_000_000

    q1 = Question(
        "What is the capital of the Philippines?",
        "Cebu", "Manila", "Davao", "Palawan",
        "B"
    )

    q2 = Question(
        "Which language is used for Android Development?",
        "Java", "Python", "Ruby", "C++",
        "A"
    )

    q3 = Question(
        "Who invented Java?",
        "James Gosling", "Bill Gates", "Dennis Ritchie", "Elon Musk",
        "A"
    )

    q4 = Question(
        "Which planet is known as the Red Planet?",
        "Earth", "Saturn", "Mars", "Venus",
        "C"
    )

    q5 = Question(
        "What is 10 * 10?",
        "50", "100", "150", "200",
        "B"
    )

    questions = [q1, q2, q3, q4, q5]

    while True:
        print("===== WHO WANTS TO BECOME A BILLIONAIRE =====")
        print("1. Start Game")
        print("2. Exit")
        try:
            choice = int(input("Choose: "))
        except ValueError:
            print("Invalid choice!")
            continue

        if choice == 1:
            agree = input("Do you want to become a billionaire? ").strip().lower()
            if agree != "yes":
                print("You must agree to continue!")
                continue

            for q in questions:
                q.show()
                answer = input("Your answer: ").strip().upper()

                if answer == q.correct:
                    print("Correct!")
                else:
                    print("Wrong! -10% deducted!")
                    money -= money * 0.10
                print()

            print("Game Over!")
            print(f"Your final money: ₱{money}")
            print()
        elif choice == 2:
            print("Thank you for playing!")
            break
        else:
            print("Invalid choice!")

if __name__ == "__main__":
    main()
