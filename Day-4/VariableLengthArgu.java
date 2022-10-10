package Functions;



public class VariableLengthArgu {
    public static void main(String[] args) {
      fun(...v:5,6,7,7,8899,6,5,5,434);
    }
    static void fun( int ...v){
        System.out.println(Arrays.toString(v));
    }
}
