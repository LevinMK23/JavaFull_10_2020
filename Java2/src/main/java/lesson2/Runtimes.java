package lesson2;

public class Runtimes {
    public static void main(String[] args) {
        try {
            int x = 12 / 0;
            int[] a = new int[3];
            int b = a[7];
            int[] c = null;
            int e = c[3];
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Выход за границу массива");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Must do it");
        }
    }
}
