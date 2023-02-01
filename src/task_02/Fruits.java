package task_02;

// Исправьте ошибки.
class Fruits extends Thread {

    public void run() {
        for (Integer fruit : getFruits()) {
            System.out.println(fruit);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println("Exception" + ie);
            }
        }
    }

    private /* ??? **/ getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}