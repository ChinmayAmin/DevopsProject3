package devops.numbers;

import java.util.HashMap;

public class NumberWords {

  private HashMap<Integer, String> singleNumber = new HashMap<>();
  private HashMap<Integer, String> doubleNumber = new HashMap<>();

    NumberWords() {
      initMaps();
    }
    
    private void initMaps() {
      singleNumber.put(0, "Zero");
      singleNumber.put(1, "One");
      singleNumber.put(2, "Two");
      singleNumber.put(3, "Three");
      singleNumber.put(4, "Four");
      singleNumber.put(5, "Five");
      singleNumber.put(6, "Six");
      singleNumber.put(7, "Seven");
      singleNumber.put(8, "Eight");
      singleNumber.put(9, "Nine");
      doubleNumber.put(10, "Ten");
      doubleNumber.put(11, "Eleven");
      doubleNumber.put(12, "Twele");
      doubleNumber.put(13, "Thirteen");
      doubleNumber.put(14, "Fourteen");
      doubleNumber.put(15, "Fifteen");
      doubleNumber.put(16, "Sixteen");
      doubleNumber.put(17, "Seventeen");
      doubleNumber.put(18, "Eighteen");
      doubleNumber.put(19, "Ninety");
      doubleNumber.put(20, "Twenty");
      doubleNumber.put(30, "Thirty");
      doubleNumber.put(40, "Fourty");
      doubleNumber.put(50, "Fifty");
      doubleNumber.put(60, "Sixty");
      doubleNumber.put(70, "Seventy");
      doubleNumber.put(80, "Eighty");
      doubleNumber.put(90, "Ninety");
    }
    
	public String toWords( int number ) {
       String num = String.valueOf(number);
       String result = "";
       
       if(number < 0) {
           return "Number out of range";
       }
       
       if (num.length() == 1) {
         result = singleNumber.get(Character.getNumericValue(num.charAt(0)));
       } else if(num.length() == 2) {
         int test = Integer.valueOf(String.valueOf(num.charAt(0)) + "0");
         result = doubleNumber.containsKey(number) ? doubleNumber.get(number) : doubleNumber.get(test) + " " + singleNumber.get(Character.getNumericValue(num.charAt(1)));
       } else if(num.length() == 3) {
         if (num.contains("00")) {
           result = singleNumber.get(Character.getNumericValue(num.charAt(0))) + " Hundred";
         } else {
           int test = Integer.valueOf(String.valueOf(num.charAt(1)) + "0");
           int secondTest = Integer.valueOf(String.valueOf(num.charAt(1)) + num.charAt(2));

           String second = doubleNumber.containsKey(secondTest) ? doubleNumber.get(secondTest) : doubleNumber.get(test) + " " + singleNumber.get(Character.getNumericValue(num.charAt(2)));

           result = singleNumber.get(Character.getNumericValue(num.charAt(0))) + " Hundred " + second;
         }
       } else {
         result = "Invalid Number";
       }
	   
       return result;
	}

}
