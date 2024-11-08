public class ExemploIntToInteger {
    
    public static void main(String[] args) {
        
        int valorPrimitivo = 42;

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("valor wrapper(Integer): " + valorWrapper);
    }
}