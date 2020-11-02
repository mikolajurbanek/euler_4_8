public class App {



    public static void main(String[] args) {
        Fourth fourth = new Fourth();
        Eighth eight = new Eighth();
        BinarySearch bs = new BinarySearch();
        FlatteningMultidimensionalList fml = new FlatteningMultidimensionalList();




        System.out.println(bs.lookForNumber(new int[]{2, 1, 4, 7, 9, 3}, 5));
        System.out.println(fourth.palindromesByMultiplicity());
        System.out.println(eight.findBiggestProduct());


    }
}
