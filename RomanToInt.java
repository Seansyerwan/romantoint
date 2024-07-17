public class RomanToInt {
    public static int RomanToInt(String s) {
        int sum = 0;
        int counter = 0;
        while(counter < s.length()){
            String twoNumbers = counter < s.length()-1 ? s.substring(counter,counter+2) : s.substring(counter);
            if(twoNumbers.length() > 1 && (twoNumbers.charAt(0) == 'V' ||twoNumbers.charAt(0) == 'L' ||twoNumbers.charAt(0) == 'D') || twoNumbers.charAt(0) == 'M'){
                sum+=addingNums(s,counter);
            }
            else if(twoNumbers.length() > 1){
                if(twoNumbers.charAt(0) == ('I')&&(twoNumbers.charAt(1) == 'X'||twoNumbers.charAt(1) =='V')){
                    sum = (sum + addingNums(s,counter+1)) - addingNums(s,counter);
                    counter++;
                }
                else if(twoNumbers.charAt(0) == ('X')&&(twoNumbers.charAt(1) == 'C'||twoNumbers.charAt(1) =='L')){
                    sum = (sum + addingNums(s,counter+1)) - addingNums(s,counter);
                    counter++;

                }
                else if(twoNumbers.charAt(0) == ('C')&&(twoNumbers.charAt(1) == 'D'||twoNumbers.charAt(1) =='M')){
                    sum = (sum + addingNums(s,counter+1)) - addingNums(s,counter);
                    counter++;
                }
                else{
                    sum+=addingNums(s,counter);
                }
            }
            else{
                sum+=addingNums(s,counter);
            }
            counter++;
        }
        return sum;
    }

    public static int addingNums(String s, int counter){
        int sum = 0;
        switch (s.charAt(counter)){
            case 'I':
                sum+=1;
                break;
            case 'V':
                sum+=5;
                break;
            case 'X':
                sum+=10;
                break;
            case 'L':
                sum+=50;
                break;
            case 'C':
                sum+=100;
                break;
            case 'D':
                sum+=500;
                break;
            default:
                sum+=1000;
                break;
        }
        return sum;
    }


}