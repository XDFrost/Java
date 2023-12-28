public class Stringmethods {
    public static void main(String[] args) {
        String text = "World";
        System.out.println(text);

        System.out.println(text.length());              // length gives the length of string
        System.out.println(text.toLowerCase());         // Returns a lower case string
        System.out.println(text.toUpperCase());         // Returns a upper case string
        
        String fortrim = "       Hello          ";
        System.out.println(fortrim.trim());             // Removes trailing spaces
        
        System.out.println(text.substring(2));                         // returns a string starting from given index; can also contains end index - 1
        System.out.println(text.substring(2, 4));             // starts from index 2 and ends at 4 - 1 = 3        

        System.out.println(text.replace('W', 'X'));               // Replaces the characters in string; Can also take substring as input
        System.out.println(text.replace("Wo", "XX"));

        System.out.println(text.startsWith("Wor"));             // True if the string starts with the given argument
        System.out.println(text.startsWith("Abc"));

        System.out.println(text.endsWith("ld"));                // True if the string starts with the given argument
        System.out.println(text.endsWith("XY"));

        System.out.println(text.charAt(2));                  // Gives the character at the specified index

        String index = "Harryrry";
        System.out.println(index.indexOf("rry"));              // Returns the index of given substring or character; Can also take starting index; if match not found, returns -1
        System.out.println(index.indexOf("rry", 3));

        System.out.println(index.lastIndexOf("rry"));          // Works same as indexof but from end
        
        System.out.println(text.equals(index));                    // True if 2 strings are equal or not

        System.out.println(text.equalsIgnoreCase(index));          // True if 2 starings are equal ignoring their case
    } 
}
