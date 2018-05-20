package zhonghcc.P0535_EncodeandDecodeTinyURL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Codec {

    String candidate = "0123456789" +
            "abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
    char[] chars = candidate.toCharArray();
    int candidateLength = candidate.length();
    Map<Integer,String> map = new HashMap<>();
    int index = 10000;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        index ++;
        int temp = index;
        StringBuilder sb = new StringBuilder();

        while(temp>0){
            int n = temp%candidateLength;
            temp = temp/candidateLength;
            sb.append(chars[n]);
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        for(int i=shortUrl.length()-1;i>=0;i--){
            shortUrl.charAt(i);
        }
        return null;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
