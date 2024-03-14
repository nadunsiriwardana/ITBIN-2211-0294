class Pinky {
    String donky = "Donky";
}

class Inky {
    public Inky() {
        Pinky pinky = new Pinky();
        System.out.println("Pinky " + pinky.donky);
        secondConstructor(pinky);
    }

    public void secondConstructor(Pinky pinky) {
        String blinky = pinky.donky;
        String rinky = "Monky";
        System.out.println("Blinky " + blinky);
        System.out.println("Rinky " + rinky);
        System.out.println("Pinky " + pinky.donky + " " + rinky);
    }
}

class Ponky {
    public static void main(String[] args) {
        Pinky pinky = new Pinky();
        System.out.println("Pinky " + pinky.donky);
        new Inky();
    }
}