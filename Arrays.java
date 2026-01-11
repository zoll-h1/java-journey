public class Arrays {
    public static void main(String[] args) {
        // WE HAVE TO WAYS TO CREATE ARRAYS
        // 1. We know the values , use { }.
        // The syntax : Type[] name = {value}

        int[] numbers = {10, 20, 30, 40, 50};

        // 2. We know only the size
        // Use "new"
        // Syntax : Type[] name = new Type[size]

        int[] grades = new int[5]; // Arrays of 5 zeroes
        grades[0] = 9;
        grades[3] = 12;
        // ======= LOOP ==========
        // 1. The Classical Loop(through the index)
        // i start with 0; while i less than length: 
        // increasing i in 1 
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }
        // 2. For-each (Improve LOOP)
        // it's like " for x in list" in Python. We use it when we need just to read the data 
        // " For each int num in array numbers"
        for (int num : numbers) {
            System.out.println(num);
        }
        
        String[] lang = {"Python", "Java", "JavaScript"};

        for(String lan : lang) {
            System.out.println("My favourite computer languages is : " + lan);
        }

    }
}
