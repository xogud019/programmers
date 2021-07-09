package CodingTest.LeetCode.String.Easy;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
