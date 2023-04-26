public class recursion {
    static int i = 0;

    static void p() {
        count++;
        if (count <= 5)
            ;
        System.out.println("hello" + count);
        p();
    }
}