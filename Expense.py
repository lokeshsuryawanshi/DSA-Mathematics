class Employee:
    def __init__(self, id, name):
        self.id = id
        self.name = name

class Expense:
    def __init__(self, employee_id, date, category, description, amount):
        self.employee_id = employee_id
        self.date = date
        self.category = category
        self.description = description
        self.amount = amount

class ExpenseManagementSystem:
    def __init__(self):
        self.employees = {}
        self.expenses = []

    def add_employee(self, id, name):
        if id in self.employees:
            print("Employee already exists.")
        else:
            self.employees[id] = Employee(id, name)
            print(f"Employee {name} added successfully.")

    def submit_expense(self, employee_id, date, category, description, amount):
        if employee_id not in self.employees:
            print("Employee does not exist.")
        else:
            new_expense = Expense(employee_id, date, category, description, amount)
            self.expenses.append(new_expense)
            print("Expense submitted successfully.")

    def view_expenses(self, employee_id):
        if employee_id not in self.employees:
            print("Employee does not exist.")
        else:
            print(f"Expenses for {self.employees[employee_id].name}:")
            for expense in self.expenses:
                if expense.employee_id == employee_id:
                    print(f"{expense.date}: {expense.category} - {expense.description}: ${expense.amount}")

    def generate_report(self):
        print("All Expenses:")
        for expense in self.expenses:
            employee = self.employees[expense.employee_id]
            print(f"{employee.name} - {expense.date}: {expense.category} - {expense.description}: ${expense.amount}")

# Create an instance of the ExpenseManagementSystem
system = ExpenseManagementSystem()

# User interaction loop
while True:
    print("\nExpense Management System")
    print("1. Add Employee")
    print("2. Submit Expense")
    print("3. View Expenses")
    print("4. Generate Report")
    print("5. Exit")
    choice = input("Choose an option: ")

    if choice == '1':
        id = input("Enter employee ID: ")
        name = input("Enter employee name: ")
        system.add_employee(id, name)
    elif choice == '2':
        employee_id = input("Enter employee ID: ")
        date = input("Enter date (YYYY-MM-DD): ")
        category = input("Enter expense category: ")
        description = input("Enter expense description: ")
        amount = input("Enter expense amount: ")
        system.submit_expense(employee_id, date, category, description, amount)
    elif choice == '3':
        employee_id = input("Enter employee ID to view expenses: ")
        system.view_expenses(employee_id)
    elif choice == '4':
        system.generate_report()
    elif choice == '5':
        break
    else:
        print("Invalid option. Please try again.")
