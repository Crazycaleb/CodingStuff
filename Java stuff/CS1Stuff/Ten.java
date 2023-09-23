public class Ten {
    public static void main(String[] args){
        int n = 100;
        int ten = 10;
        int number = 1;
        while (ten < n){
            System.out.println(ten);
            number++; 
            ten = 10 * number;
        }
}
}
