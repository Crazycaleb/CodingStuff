public class EnhancedForLoop {

    public static void main(String[] args){
        double[] value = {1,5,9,2};
        double total = 0;
        for (double element : value) /* Sum Algorithm */
        { 
            total = total + element;
            System.out.println(total);
        }    
    for(int i = 0; i < value.length;i++) /*Filling Algorithm */
    {
        value[i] = i * i;
    }
}
}
