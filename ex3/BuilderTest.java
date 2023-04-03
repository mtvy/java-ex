class House {

    public int rooms;
    public boolean hasGarage;
    private double landArea;

    public static class Builder {
        private int rooms;
        private boolean hasGarage;
        private double landArea;

        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setLandArea(double landArea) {
            this.landArea = landArea;
            return this;
        }

        public House build() {
            House house = new House();
            house.rooms = this.rooms;
            house.hasGarage = this.hasGarage;
            house.landArea = this.landArea;
            return house;
        }
    }
}

public class BuilderTest {//тест
    public static void main(String[] args) {
        House house = new House.Builder()
    .setRooms(4)
    .setHasGarage(true)
    .setLandArea(1000.0)
    .build();
    System.out.println(house.rooms);
    }

}
