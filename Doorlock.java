public class DoorLock {
    

    // Constant.
    public static final int MAX_NUMBER_OF_ATTEMPTS = 3;

    // Instance variables.
    private Combination combination;
    private boolean open;
    private boolean activated;
    private int numberOfAttempts;

    // Constructor.
    public DoorLock( Combination combination ) {
        // Your code here
    }

    // Access methods.

    public boolean isOpen() {
        return open;
    }

    public boolean isActivated() {
        return activated;
    }

    // Notice that numberOfAttempts is compared to
    // MAX_NUMBER_OF_ATTEMPTS only when its value has been
    // incremented, Also, numberOfAttempts should be set to zero when
    // activated is false.  Problems related to the combined action of
    // these two variables have caused problems for some students.

    public boolean open( Combination combination ) {

        // Put your code here, then remove the line below.
        return true;
    }

    public void activate( Combination c ) {
        // Put your code here, then remove this comment.
        //if ((this.x ==c.x) && (this.y ==c.y) && (this.z ==c.z))
    }

    public static void main(String args[]){
        Combination c1, c2, c3;

        c1 = new Combination(1, 2, 3);
        c2 = new Combination(1, 2, 3);
        c3 = new Combination(3, 2, 1);
    }
    

}
