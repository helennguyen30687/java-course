package Lab_08;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;

    public Animal() {
    }

    protected Animal(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                ", flyable=" + flyable +
                '}';
    }

    public static class Builder{
        private String name;
        private int speed;
        private boolean flyable;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build()
        {
            return new Animal(this);
        }
    }
}
