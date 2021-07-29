public class MenuSystem {

    public void displayMainMenu() {
            System.out.println();
            System.out.println("-------- WELCOME TO YOUR ADDRESS BOOK --------");
            System.out.println("-         1. display next contact            -");
            System.out.println("-         2. display previous contact        -");
            System.out.println("-         3. add a contact                   -");
            System.out.println("-         4. delete a contact                -");
            System.out.println("-         5. update a contact                -");
            System.out.println("-         6. display number of contacts      -");
            System.out.println("-         7. search for a contact            -");
            System.out.println("-         8. quit application                -");
            System.out.println("----------------------------------------------");
            System.out.println();
        }

        public void displayAddContactMenu() {
            System.out.println();
            System.out.println("***** ADD CONTACT MENU *****");
            System.out
                    .println("Please enter contact information.");
        }

        public void displayDeleteContactMenu() {
            System.out.println();
            System.out.println("***** DELETE CONTACT MENU *****");
            System.out.println("Are you sure you wanted to delete the currently displayed contact? (Y/[N]");
        }
