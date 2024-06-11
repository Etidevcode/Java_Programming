public class Main {

    public static void main(String[] args) {
        printInformation("Hello World");
        System.out.println();
        printInformation("");
        System.out.println();
        printInformation("\t  \n");

        System.out.println();
        String helloworld = "Hello World";
        System.out.printf("index of r = %d %n", helloworld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloworld.indexOf("World"));

        System.out.println();
        System.out.printf("index of l = %d %n", helloworld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloworld.lastIndexOf('l'));

        System.out.println();
        System.out.printf("index of l = %d %n", helloworld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloworld.lastIndexOf('l', 8));

        String helloworldLower = helloworld.toLowerCase();
        if(helloworld.equals(helloworldLower)) {
            System.out.println("Values match exactly");
        }

        if(helloworld.equalsIgnoreCase(helloworldLower)) {
            System.out.println("Values match ignoring case");
        }

        if(helloworld.startsWith("Hello")) {
            System.out.println("String starts with hello");
        }

        if(helloworld.endsWith("World")) {
            System.out.println("String contains World");
        }

        if(helloworld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String id Blank");
        }
        System.out.printf("First chart = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }
}
