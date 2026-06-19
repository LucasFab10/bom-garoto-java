class GoodDog {
    private int size; //Torne a variável de instância  private.
    public int getSize() { //Torne os métodos getter e setter public.
        return size;
    }
    public void setSize(int s) {
        size = s;
    }
    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        }
        else  if (size > 14) {
            System.out.println("Ruff! Ruff!");
        }
        else {
            System.out.println ("Yip! Yip!");
        }
    }
}