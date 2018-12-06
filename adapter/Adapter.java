package adapter;

import singleton.ThreadSingleton2;

/**
 * 适配器。通过内部包装一个对象，将原来的对象转换为目标对象
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
