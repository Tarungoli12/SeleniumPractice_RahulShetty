package abstraction;

public class ChildAirCraft extends ParentAirCraft{

    public static void main(String[] args) {
        ParentAirCraft parentAirCraft = new ChildAirCraft();
        parentAirCraft.engine();
        parentAirCraft.safetyGuidelines();
        parentAirCraft.planeColour();
    }

    @Override
    public void planeColour() {
        System.out.println("Red colour.........");
    }
}
