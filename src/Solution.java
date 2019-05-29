class Solution {
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
        System.out.println(reverseNumber(123456));
        System.out.println(reverseNumber(9876543));
        System.out.println(reverseNumber(546754));
    }

    private static int reverseNumber(int numberToRev){
        int numberOfDigits=(int)Math.ceil(Math.log10(numberToRev));
        int result=0;
        for(int i=0;i<numberOfDigits;i++){
            result+=(numberToRev/(int)Math.pow(10,i))%10*Math.pow(10,numberOfDigits-i-1);
        }
        return result;
    }
}
