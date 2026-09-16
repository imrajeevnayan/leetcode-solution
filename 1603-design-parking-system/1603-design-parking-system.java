class ParkingSystem {
    // STATE: bache hue slots (instance variables)
    private int big, medium, small;
    
    // CONSTRUCTOR: shuruati state set
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;       // this.big = instance var, big = parameter
        this.medium = medium;
        this.small = small;
    }
    
    // BEHAVIOR
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) { big--; return true; }
        } else if (carType == 2) {
            if (medium > 0) { medium--; return true; }
        } else { // carType == 3
            if (small > 0) { small--; return true; }
        }
        return false;
    }
}