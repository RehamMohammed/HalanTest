package org.example;

public class Problem3 {
    String runLengthEncode(String str){
        String res = "";

        if (str.length() == 1) {
            res += str + 1;
            return res;
        }
        for (int i=0;i<str.length();i++){
            int cnt = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                cnt++;
                i++;
            }

            res += str.charAt(i) + Integer.toString(cnt);
        }

        return res;
    }

    String runLengthDecode(String str){


        String dest="";


        for (int i = 0; i < str.length(); i+=2) {
            int count=Character.getNumericValue(str.charAt(i));

            for(int j=0;j<count;j++) {
                dest+=str.charAt(i+1);
            }
        }
        return dest;
    }
}
