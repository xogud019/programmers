package CodingTest.LeetCode.Contest;

public class ParkingSystem {
    int big = 0;
    int medium = 0;
    int small = 0;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(this.big>0){
                this.big--;
                return true;
            }
            else return false;
        }
        else if(carType == 2){
            if(this.medium>0){
                this.medium--;
                return true;
            }
            else return false;
        }
        else{
            if(this.small>0){
                this.small--;
                return true;
            }
            else return false;
        }
    }
}
