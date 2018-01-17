public class BinarySearchTextOnly 
{ 
    public static void main(String[] args) 
    {
        String[] arrNames = {"Abi", "Ben", "Elliott", "Rachel", "Sam", "Sophie", "Zoe"};      //create and initialise array

        String searchItem = "Zoe";

        int start = 0;
        int end = (arrNames.length)-1;
        Boolean found = false;
        int midPoint = 0;

        while (found == false && start<=end ){
            midPoint = (start + end)/2;
            if (arrNames[midPoint] == searchItem){
                found = true;
            } else if (arrNames[midPoint].compareTo(searchItem) > 0){
                end = midPoint -1;
            } else 
                start = midPoint + 1;
        }

        if (found==true){
            System.out.println("Found at " + midPoint );
        } else {
            System.out.println("Not found");
        }
    }
}

