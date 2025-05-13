
    import java.util.Scanner;

    class newOne2 {
        private String title;
        private boolean isCompleted;

        public newOne2(String title) {
            this.title = title;
            this.isCompleted = false;
        }

        public void markComplete() {
            isCompleted = true;
        }

        public void markIncomplete() {
            isCompleted = false;
        }

        public String getTitle() {
            return title;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String toString() {
            return (isCompleted ? "[X] " : "[ ] ") + title;
        }
    }

     class ToDoApp {
        private static newOne2[] tasks = new newOne2[100];
        private static int taskCount = 0;
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int choice;

            do {
                printMenu();
                choice = getChoice();
                handleChoice(choice);
            } while (choice != 6);

            System.out.println("Goodbye!");
        }

        public static void printMenu() {
            System.out.println("\n=== TO-DO LIST ===");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Edit Task");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
        }

        public static int getChoice() {
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
            return choice;
        }

        public static void handleChoice(int choice) {
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTaskCompleted();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    editTask();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        public static void addTask() {
            System.out.print("Enter task title: ");
            String title = scanner.nextLine();

            if (taskCount < tasks.length) {
                tasks[taskCount++] = new newOne2(title);
                System.out.println("Task added.");
            } else {
                System.out.println("Task list is full!");
            }
        }

        public static void listTasks() {
            if (taskCount == 0) {
                System.out.println("No tasks available.");
                return;
            }

            System.out.println("\nYour Tasks:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        }

        public static void markTaskCompleted() {
            listTasks();
            if (taskCount == 0) return;

            System.out.print("Enter task number to mark complete: ");
            int index = getIndex();
            if (index >= 0 && index < taskCount) {
                tasks[index].markComplete();
                System.out.println("Task marked as completed.");
            } else {
                System.out.println("Invalid task number.");
            }
        }

        public static void deleteTask() {
            listTasks();
            if (taskCount == 0) return;

            System.out.print("Enter task number to delete: ");
            int index = getIndex();
            if (index >= 0 && index < taskCount) {
                for (int i = index; i < taskCount - 1; i++) {
                    tasks[i] = tasks[i + 1];
                }
                tasks[--taskCount] = null;
                System.out.println("Task deleted.");
            } else {
                System.out.println("Invalid task number.");
            }
        }

        public static void editTask() {
            listTasks();
            if (taskCount == 0) return;

            System.out.print("Enter task number to edit: ");
            int index = getIndex();
            if (index >= 0 && index < taskCount) {
                System.out.print("Enter new task title: ");
                String newTitle = scanner.nextLine();
                tasks[index].setTitle(newTitle);
                System.out.println("Task updated.");
            } else {
                System.out.println("Invalid task number.");
            }
        }

        public static int getIndex() {
            int index = -1;
            try {
                index = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number.");
            }
            return index;
        }
    }

