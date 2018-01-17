public class BinarySearchDescendingOrder
{ 
    public static void main(String[] args) 
    {
        int[] arrNumbers = {20, 15, 10, 5, 3, 1};      //create and initialise array

        int searchItem = 20;
        int start = 0;
        int end = (arrNumbers.length)-1;
        boolean found = false;
        int midPoint=0;

        while (found == false && start<=end ){
            midPoint = (start + end)/2;
            if (arrNumbers[midPoint] == searchItem){
                found = true;
            } else if (arrNumbers[midPoint]< searchItem){
                end = midPoint -1;
            } else 
                start = midPoint + 1;
        }

        if (found==true){
            System.out.println("Found at " + midPoint);
        } else {
            System.out.println("Not found");
        }
    }
}

