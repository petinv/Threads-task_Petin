package task_03;

// Вывод групп товаров.
// Исправьте ошибки.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);
        getVeges(group);
        getBerries(group);
    }

    private static void getFruits(ThreadGroup group) {
        Fruits fruits = new Fruits(group, "\nFruits:");
        fruits.start();
        fruits./* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(group, "\nVeges:");
        veges.start();
        veges./* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static /* ??? **/ getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        berries/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }
}
