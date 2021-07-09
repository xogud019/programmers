package CodingTest.LeetCode.Design.Medium;

import java.util.HashMap;

/*
Note: This is a companion problem to the System Design problem: Design TinyURL(https://leetcode.com/discuss/interview-question/124658/Design-a-URL-Shortener-(-TinyURL-)-System/).
TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. 
There is no restriction on how your encode/decode algorithm should work. 
You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
*/
public class EncodeAndDecodeTinyURL {
    class Codec {
        HashMap<String, String> url = new HashMap<>();
        String baseUrl = "http://tinyurl.com/";
        
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String shortUrl = baseUrl+longUrl.hashCode();
            
            url.put(shortUrl, longUrl);
            
            return shortUrl;
        }
    
        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return url.get(shortUrl);
        }
    }

    /*
    String baseUrl = "http://tinyurl.com/";
    HashMap<String, String> map = new HashMap<>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = baseUrl + longUrl.hashCode();
        map.put(shortUrl, longUrl);
        
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
    */
}
