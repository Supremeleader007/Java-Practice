public class Clg {
        public static void main(String[] args) {
            // Check if a command-line argument is provided
            if (args.length > 0) {
                String collegeName = args[0]; // Get the first argument
                String collegeName1= args[1];
                String collegeName2= args[2];
                System.out.println("Your college name is: " + collegeName + " " + collegeName1 + " " + collegeName2);
            } else {
                System.out.println("Please provide your college name as a command-line argument.");

            }

        }
    }
    

