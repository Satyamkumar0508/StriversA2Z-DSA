
public class Q02_DataType {
    public static int dataTypes(String type) {
        
        int integerSize = 4;
        int longSize = 8;
        int floatSize = 4;
        int doubleSize = 8;
        int charSize = 1;

        int size;
        switch (type) {
            case "Integer":
                size = integerSize;
                break;
            case "Long":
                size = longSize;
                break;
            case "Float":
                size = floatSize;
                break;
            case "Double":
                size = doubleSize;
                break;
            case "Character":
                size = charSize;
                break;
            default:
                System.out.println("Error: Invalid data type entered.");
                return -1;
        }
        return size;
    }
}