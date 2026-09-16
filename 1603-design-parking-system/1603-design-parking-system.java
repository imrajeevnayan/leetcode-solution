class ParkingSystem {
    private int[] slots; // index 1=big, 2=medium, 3=small (0 waste, koi baat nahi!)
    
    public ParkingSystem(int big, int medium, int small) {
        slots = new int[4];  // size 4: index 0,1,2,3
        slots[1] = big;
        slots[2] = medium;
        slots[3] = small;
    }
    
    public boolean addCar(int carType) {
        if (slots[carType] > 0) {   // carType = DIRECT INDEX!
            slots[carType]--;
            return true;
        }
        return false;
    }
}