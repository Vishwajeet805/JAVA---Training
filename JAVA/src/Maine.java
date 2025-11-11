class Maine {
    public static void main(String[] args) {
//        System.out.println("Hii");
//        short b=5;
//        int c=4;
//        float f=90.8f;
//        boolean data=false;
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(f);
//        System.out.println(data);
//
//        int val=85;
//        if (val%2==0) {
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
//
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter a number: ");
//        int aa =sc.nextInt();
//        System.out.println(aa);
//
//
//        Scanner sc2 = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String str = sc2.nextLine();
//
//        int left = 0;
//        int right = str.length() - 1;
//        boolean isPalindrome = true;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) {
//                isPalindrome = false;
//                break;
//            }
//            left++;
//            right--;
//        }
//
//        if (isPalindrome) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a palindrome");
//        }
//
//        String str="hello is a powerfull";
//        String a[]=str.split(" ");
//        String largest="";
//        for(String val:a){
//            if(val.length()>largest.length()){
//                largest =val;
//
//            }
//        }System.out.println(largest);
        String str="hello is a powerfull";
    int [] freq=new int [256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character Frequency:");


        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }}


}


